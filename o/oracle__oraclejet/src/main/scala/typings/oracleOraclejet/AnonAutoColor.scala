package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoColor extends js.Object {
  var color: String
  var rendered: off | auto
}

object AnonAutoColor {
  @scala.inline
  def apply(color: String, rendered: off | auto): AnonAutoColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAutoColor]
  }
}

