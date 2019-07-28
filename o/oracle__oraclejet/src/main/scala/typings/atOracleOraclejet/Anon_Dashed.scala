package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.dashed
import typings.atOracleOraclejet.atOracleOraclejetStrings.dotted
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dashed extends js.Object {
  var lineColor: String
  var lineStyle: dotted | dashed | solid
  var lineWidth: Double
  var markerColor: String
  var markerDisplayed: off | on
  var markerSize: Double
}

object Anon_Dashed {
  @scala.inline
  def apply(
    lineColor: String,
    lineStyle: dotted | dashed | solid,
    lineWidth: Double,
    markerColor: String,
    markerDisplayed: off | on,
    markerSize: Double
  ): Anon_Dashed = {
    val __obj = js.Dynamic.literal(lineColor = lineColor, lineStyle = lineStyle.asInstanceOf[js.Any], lineWidth = lineWidth, markerColor = markerColor, markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerSize = markerSize)
  
    __obj.asInstanceOf[Anon_Dashed]
  }
}

