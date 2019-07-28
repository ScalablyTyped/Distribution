package typings.pixiDotJs.PIXINs.loadersNs

import typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.LOAD_TYPE
import typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    callback: OnCompleteSignal = null,
    crossOrigin: String | Boolean = null,
    loadType: LOAD_TYPE = null,
    metadata: IMetadata = null,
    onComplete: OnCompleteSignal = null,
    timeout: Int | Double = null,
    xhrType: XHR_RESPONSE_TYPE = null
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (loadType != null) __obj.updateDynamic("loadType")(loadType)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (xhrType != null) __obj.updateDynamic("xhrType")(xhrType)
    __obj.asInstanceOf[LoaderOptions]
  }
}

