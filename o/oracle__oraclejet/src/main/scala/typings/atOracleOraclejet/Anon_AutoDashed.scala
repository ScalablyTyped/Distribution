package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.dashed
import typings.atOracleOraclejet.atOracleOraclejetStrings.dotted
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoDashed extends js.Object {
  var lineColor: String
  var lineStyle: dotted | dashed | solid
  var lineWidth: Double
  var rendered: on | off | auto
}

object Anon_AutoDashed {
  @scala.inline
  def apply(
    lineColor: String,
    lineStyle: dotted | dashed | solid,
    lineWidth: Double,
    rendered: on | off | auto
  ): Anon_AutoDashed = {
    val __obj = js.Dynamic.literal(lineColor = lineColor, lineStyle = lineStyle.asInstanceOf[js.Any], lineWidth = lineWidth, rendered = rendered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AutoDashed]
  }
}

