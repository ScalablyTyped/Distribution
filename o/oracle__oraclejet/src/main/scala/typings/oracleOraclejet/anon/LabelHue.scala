package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelHue extends js.Object {
  var labelHue: js.UndefOr[String] = js.undefined
  var labelOpacity: js.UndefOr[String] = js.undefined
  var labelSatLum: js.UndefOr[String] = js.undefined
  var labelThumbDesc: js.UndefOr[String] = js.undefined
}

object LabelHue {
  @scala.inline
  def apply(
    labelHue: String = null,
    labelOpacity: String = null,
    labelSatLum: String = null,
    labelThumbDesc: String = null
  ): LabelHue = {
    val __obj = js.Dynamic.literal()
    if (labelHue != null) __obj.updateDynamic("labelHue")(labelHue.asInstanceOf[js.Any])
    if (labelOpacity != null) __obj.updateDynamic("labelOpacity")(labelOpacity.asInstanceOf[js.Any])
    if (labelSatLum != null) __obj.updateDynamic("labelSatLum")(labelSatLum.asInstanceOf[js.Any])
    if (labelThumbDesc != null) __obj.updateDynamic("labelThumbDesc")(labelThumbDesc.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelHue]
  }
}

