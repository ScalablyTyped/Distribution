package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconDefaults extends js.Object {
  var borderColor: String
  var borderWidth: Double
  var color: String
  var iconDefaults: Pattern
  var indicatorColor: String
  var indicatorIconDefaults: Pattern
  var labelStyle: js.Object
  var secondaryLabelStyle: js.Object
}

object IconDefaults {
  @scala.inline
  def apply(
    borderColor: String,
    borderWidth: Double,
    color: String,
    iconDefaults: Pattern,
    indicatorColor: String,
    indicatorIconDefaults: Pattern,
    labelStyle: js.Object,
    secondaryLabelStyle: js.Object
  ): IconDefaults = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], iconDefaults = iconDefaults.asInstanceOf[js.Any], indicatorColor = indicatorColor.asInstanceOf[js.Any], indicatorIconDefaults = indicatorIconDefaults.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], secondaryLabelStyle = secondaryLabelStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconDefaults]
  }
}

