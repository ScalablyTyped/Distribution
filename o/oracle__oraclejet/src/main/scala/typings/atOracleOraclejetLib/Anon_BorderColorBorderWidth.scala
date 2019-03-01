package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColorBorderWidth extends js.Object {
  var borderColor: java.lang.String
  var borderWidth: scala.Double
  var color: java.lang.String
  var iconDefaults: Anon_BorderColorBorderRadiusBorderWidthCircle
  var indicatorColor: java.lang.String
  var indicatorIconDefaults: Anon_BorderColorBorderRadiusBorderWidthCircle
  var labelStyle: js.Object
  var secondaryLabelStyle: js.Object
}

object Anon_BorderColorBorderWidth {
  @scala.inline
  def apply(
    borderColor: java.lang.String,
    borderWidth: scala.Double,
    color: java.lang.String,
    iconDefaults: Anon_BorderColorBorderRadiusBorderWidthCircle,
    indicatorColor: java.lang.String,
    indicatorIconDefaults: Anon_BorderColorBorderRadiusBorderWidthCircle,
    labelStyle: js.Object,
    secondaryLabelStyle: js.Object
  ): Anon_BorderColorBorderWidth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("borderColor")(borderColor)
    __obj.updateDynamic("borderWidth")(borderWidth)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("iconDefaults")(iconDefaults)
    __obj.updateDynamic("indicatorColor")(indicatorColor)
    __obj.updateDynamic("indicatorIconDefaults")(indicatorIconDefaults)
    __obj.updateDynamic("labelStyle")(labelStyle)
    __obj.updateDynamic("secondaryLabelStyle")(secondaryLabelStyle)
    __obj.asInstanceOf[Anon_BorderColorBorderWidth]
  }
}

