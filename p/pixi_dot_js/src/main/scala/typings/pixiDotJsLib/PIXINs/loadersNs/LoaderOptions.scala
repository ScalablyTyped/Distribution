package typings
package pixiDotJsLib.PIXINs.loadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderOptions extends js.Object {
  var crossOrigin: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var loadType: js.UndefOr[scala.Double] = js.undefined
  var metaData: js.UndefOr[pixiDotJsLib.Anon_LoadElement] = js.undefined
  var xhrType: js.UndefOr[java.lang.String] = js.undefined
}

object LoaderOptions {
  @scala.inline
  def apply(
    crossOrigin: scala.Boolean | java.lang.String = null,
    loadType: scala.Int | scala.Double = null,
    metaData: pixiDotJsLib.Anon_LoadElement = null,
    xhrType: java.lang.String = null
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (loadType != null) __obj.updateDynamic("loadType")(loadType.asInstanceOf[js.Any])
    if (metaData != null) __obj.updateDynamic("metaData")(metaData)
    if (xhrType != null) __obj.updateDynamic("xhrType")(xhrType)
    __obj.asInstanceOf[LoaderOptions]
  }
}

