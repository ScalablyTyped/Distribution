package typings.ol.formatKMLMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var defaultStyle: js.UndefOr[js.Array[typings.ol.styleStyleMod.default]] = js.undefined
  var extractStyles: js.UndefOr[Boolean] = js.undefined
  var showPointNames: js.UndefOr[Boolean] = js.undefined
  var writeStyles: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultStyle: js.Array[typings.ol.styleStyleMod.default] = null,
    extractStyles: js.UndefOr[Boolean] = js.undefined,
    showPointNames: js.UndefOr[Boolean] = js.undefined,
    writeStyles: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle)
    if (!js.isUndefined(extractStyles)) __obj.updateDynamic("extractStyles")(extractStyles)
    if (!js.isUndefined(showPointNames)) __obj.updateDynamic("showPointNames")(showPointNames)
    if (!js.isUndefined(writeStyles)) __obj.updateDynamic("writeStyles")(writeStyles)
    __obj.asInstanceOf[Options]
  }
}

