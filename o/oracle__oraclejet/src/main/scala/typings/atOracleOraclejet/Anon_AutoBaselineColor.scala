package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.dashed
import typings.atOracleOraclejet.atOracleOraclejetStrings.dotted
import typings.atOracleOraclejet.atOracleOraclejetStrings.inherit
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBaselineColor extends js.Object {
  var baselineColor: inherit | auto
  var baselineStyle: dotted | dashed | solid
  var baselineWidth: Double
  var lineColor: String
  var lineStyle: dotted | dashed | solid
  var lineWidth: Double
  var rendered: on | off | auto
}

object Anon_AutoBaselineColor {
  @scala.inline
  def apply(
    baselineColor: inherit | auto,
    baselineStyle: dotted | dashed | solid,
    baselineWidth: Double,
    lineColor: String,
    lineStyle: dotted | dashed | solid,
    lineWidth: Double,
    rendered: on | off | auto
  ): Anon_AutoBaselineColor = {
    val __obj = js.Dynamic.literal(baselineColor = baselineColor.asInstanceOf[js.Any], baselineStyle = baselineStyle.asInstanceOf[js.Any], baselineWidth = baselineWidth.asInstanceOf[js.Any], lineColor = lineColor.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AutoBaselineColor]
  }
}

