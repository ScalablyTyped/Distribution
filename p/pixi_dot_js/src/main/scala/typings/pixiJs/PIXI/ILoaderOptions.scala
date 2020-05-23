package typings.pixiJs.PIXI

import typings.pixiJs.anon.LoadElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoaderOptions extends js.Object {
  var crossOrigin: js.UndefOr[Boolean | String] = js.undefined
  var loadType: js.UndefOr[Double] = js.undefined
  var metadata: js.UndefOr[LoadElement] = js.undefined
  var xhrType: js.UndefOr[String] = js.undefined
}

object ILoaderOptions {
  @scala.inline
  def apply(
    crossOrigin: Boolean | String = null,
    loadType: js.UndefOr[Double] = js.undefined,
    metadata: LoadElement = null,
    xhrType: String = null
  ): ILoaderOptions = {
    val __obj = js.Dynamic.literal()
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(loadType)) __obj.updateDynamic("loadType")(loadType.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (xhrType != null) __obj.updateDynamic("xhrType")(xhrType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoaderOptions]
  }
}

