package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoLineColor extends js.Object {
  var lineColor: String
  var lineWidth: Double
  var rendered: on | off | auto
}

object Anon_AutoLineColor {
  @scala.inline
  def apply(lineColor: String, lineWidth: Double, rendered: on | off | auto): Anon_AutoLineColor = {
    val __obj = js.Dynamic.literal(lineColor = lineColor, lineWidth = lineWidth, rendered = rendered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AutoLineColor]
  }
}

