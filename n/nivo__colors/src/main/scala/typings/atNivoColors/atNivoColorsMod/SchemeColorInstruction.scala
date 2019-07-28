package typings.atNivoColors.atNivoColorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemeColorInstruction
  extends _OrdinalColorsInstruction[js.Any] {
  var scheme: ColorSchemeId
  // size is useful for diverging & sequential colors,
  // as they are array of array, whereas categorical colors
  // are simple arrays, if the size isn't specified,
  // the bigger array will be selected, this means the 11th
  // for diverging colors and 9th for sequential ones.
  var size: js.UndefOr[Double] = js.undefined
}

object SchemeColorInstruction {
  @scala.inline
  def apply(scheme: ColorSchemeId, size: Int | Double = null): SchemeColorInstruction = {
    val __obj = js.Dynamic.literal(scheme = scheme)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemeColorInstruction]
  }
}

