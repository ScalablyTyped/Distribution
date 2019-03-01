package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LabelHue extends js.Object {
  var labelHue: js.UndefOr[java.lang.String] = js.undefined
  var labelOpacity: js.UndefOr[java.lang.String] = js.undefined
  var labelSatLum: js.UndefOr[java.lang.String] = js.undefined
  var labelThumbDesc: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_LabelHue {
  @scala.inline
  def apply(
    labelHue: java.lang.String = null,
    labelOpacity: java.lang.String = null,
    labelSatLum: java.lang.String = null,
    labelThumbDesc: java.lang.String = null
  ): Anon_LabelHue = {
    val __obj = js.Dynamic.literal()
    if (labelHue != null) __obj.updateDynamic("labelHue")(labelHue)
    if (labelOpacity != null) __obj.updateDynamic("labelOpacity")(labelOpacity)
    if (labelSatLum != null) __obj.updateDynamic("labelSatLum")(labelSatLum)
    if (labelThumbDesc != null) __obj.updateDynamic("labelThumbDesc")(labelThumbDesc)
    __obj.asInstanceOf[Anon_LabelHue]
  }
}

