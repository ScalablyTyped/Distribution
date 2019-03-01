package typings
package mobxLib.libApiTojsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToJSOptions extends js.Object {
  var detectCycles: js.UndefOr[scala.Boolean] = js.undefined
  var exportMapsAsObjects: js.UndefOr[scala.Boolean] = js.undefined
  var recurseEverything: js.UndefOr[scala.Boolean] = js.undefined
}

object ToJSOptions {
  @scala.inline
  def apply(
    detectCycles: js.UndefOr[scala.Boolean] = js.undefined,
    exportMapsAsObjects: js.UndefOr[scala.Boolean] = js.undefined,
    recurseEverything: js.UndefOr[scala.Boolean] = js.undefined
  ): ToJSOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detectCycles)) __obj.updateDynamic("detectCycles")(detectCycles)
    if (!js.isUndefined(exportMapsAsObjects)) __obj.updateDynamic("exportMapsAsObjects")(exportMapsAsObjects)
    if (!js.isUndefined(recurseEverything)) __obj.updateDynamic("recurseEverything")(recurseEverything)
    __obj.asInstanceOf[ToJSOptions]
  }
}

