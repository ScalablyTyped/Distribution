package typings.pixiDotJs.PIXI.loaders

import typings.pixiDotJs.PIXI.loaders.Resource.LOAD_TYPE
import typings.pixiDotJs.PIXI.loaders.Resource.XHR_RESPONSE_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for a call to `.add()`.
  * @property [name] - The name of the resource to load, if not passed the url is used.
  * @property [key] - Alias for `name`.
  * @property [url] - The url for this resource, relative to the baseUrl of this loader.
  * @property [crossOrigin] - Is this request cross-origin? Default is to
  *      determine automatically.
  * @property [timeout=0] - A timeout in milliseconds for the load. If the load takes
  *      longer than this time it is cancelled and the load is considered a failure. If this value is
  *      set to `0` then there is no explicit timeout.
  * @property [loadType=Resource.LOAD_TYPE.XHR] - How should this resource
  *      be loaded?
  * @property [xhrType=Resource.XHR_RESPONSE_TYPE.DEFAULT] - How
  *      should the data being loaded be interpreted when using XHR?
  * @property [onComplete] - Callback to add an an onComplete signal istener.
  * @property [callback] - Alias for `onComplete`.
  * @property [metadata] - Extra configuration for middleware and the Resource object.
  */
trait LoaderOptions extends js.Object {
  var callback: js.UndefOr[OnCompleteSignal] = js.undefined
  var crossOrigin: js.UndefOr[String | Boolean] = js.undefined
  var loadType: js.UndefOr[LOAD_TYPE] = js.undefined
  var metadata: js.UndefOr[IMetadata] = js.undefined
  var onComplete: js.UndefOr[OnCompleteSignal] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var xhrType: js.UndefOr[XHR_RESPONSE_TYPE] = js.undefined
}

object LoaderOptions {
  @scala.inline
  def apply(
    callback: /* loader */ Loader => Unit = null,
    crossOrigin: String | Boolean = null,
    loadType: LOAD_TYPE = null,
    metadata: IMetadata = null,
    onComplete: /* loader */ Loader => Unit = null,
    timeout: Int | Double = null,
    xhrType: XHR_RESPONSE_TYPE = null
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (loadType != null) __obj.updateDynamic("loadType")(loadType)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (xhrType != null) __obj.updateDynamic("xhrType")(xhrType)
    __obj.asInstanceOf[LoaderOptions]
  }
}

