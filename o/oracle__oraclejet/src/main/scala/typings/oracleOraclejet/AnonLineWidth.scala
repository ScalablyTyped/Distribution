package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLineWidth extends js.Object {
  var lineColor: String
  var lineWidth: Double
  var rendered: off | on
}

object AnonLineWidth {
  @scala.inline
  def apply(lineColor: String, lineWidth: Double, rendered: off | on): AnonLineWidth = {
    val __obj = js.Dynamic.literal(lineColor = lineColor.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineWidth]
  }
}

