package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIconDefaults extends js.Object {
  var borderColor: String
  var borderWidth: Double
  var color: String
  var iconDefaults: AnonPattern
  var indicatorColor: String
  var indicatorIconDefaults: AnonPattern
  var labelStyle: js.Object
  var secondaryLabelStyle: js.Object
}

object AnonIconDefaults {
  @scala.inline
  def apply(
    borderColor: String,
    borderWidth: Double,
    color: String,
    iconDefaults: AnonPattern,
    indicatorColor: String,
    indicatorIconDefaults: AnonPattern,
    labelStyle: js.Object,
    secondaryLabelStyle: js.Object
  ): AnonIconDefaults = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], iconDefaults = iconDefaults.asInstanceOf[js.Any], indicatorColor = indicatorColor.asInstanceOf[js.Any], indicatorIconDefaults = indicatorIconDefaults.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], secondaryLabelStyle = secondaryLabelStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIconDefaults]
  }
}

