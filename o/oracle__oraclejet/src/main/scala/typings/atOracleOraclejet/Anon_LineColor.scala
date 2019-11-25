package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LineColor extends js.Object {
  var lineColor: String
  var lineWidth: Double
  var rendered: off | on
}

object Anon_LineColor {
  @scala.inline
  def apply(lineColor: String, lineWidth: Double, rendered: off | on): Anon_LineColor = {
    val __obj = js.Dynamic.literal(lineColor = lineColor.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LineColor]
  }
}

