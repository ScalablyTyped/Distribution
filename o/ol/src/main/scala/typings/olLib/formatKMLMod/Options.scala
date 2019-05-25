package typings
package olLib.formatKMLMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var defaultStyle: js.UndefOr[js.Array[olLib.styleStyleMod.default]] = js.undefined
  var extractStyles: js.UndefOr[scala.Boolean] = js.undefined
  var showPointNames: js.UndefOr[scala.Boolean] = js.undefined
  var writeStyles: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultStyle: js.Array[olLib.styleStyleMod.default] = null,
    extractStyles: js.UndefOr[scala.Boolean] = js.undefined,
    showPointNames: js.UndefOr[scala.Boolean] = js.undefined,
    writeStyles: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle)
    if (!js.isUndefined(extractStyles)) __obj.updateDynamic("extractStyles")(extractStyles)
    if (!js.isUndefined(showPointNames)) __obj.updateDynamic("showPointNames")(showPointNames)
    if (!js.isUndefined(writeStyles)) __obj.updateDynamic("writeStyles")(writeStyles)
    __obj.asInstanceOf[Options]
  }
}

