package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderWidth extends js.Object {
  var backgroundColor: String
  var borderColor: String
  var borderWidth: Double
  var rendered: off | on
}

object AnonBorderWidth {
  @scala.inline
  def apply(backgroundColor: String, borderColor: String, borderWidth: Double, rendered: off | on): AnonBorderWidth = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderWidth]
  }
}

