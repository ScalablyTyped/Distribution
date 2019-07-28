package typings.atNivoBar

import typings.atNivoBar.atNivoBarMod.LabelFormatter
import typings.atNivoBar.atNivoBarStrings.bottom
import typings.atNivoBar.atNivoBarStrings.end
import typings.atNivoBar.atNivoBarStrings.left
import typings.atNivoBar.atNivoBarStrings.middle
import typings.atNivoBar.atNivoBarStrings.right
import typings.atNivoBar.atNivoBarStrings.start
import typings.atNivoBar.atNivoBarStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var format: String | LabelFormatter
  var legend: String
  var legendOffset: Double
  var legendPosition: start | middle | end
  var orient: top | right | bottom | left
  var tickPadding: Double
  var tickRotation: Double
  var tickSize: Double
  var tickValues: Double | (js.Array[Double | String])
}

object Anon_Bottom {
  @scala.inline
  def apply(
    format: String | LabelFormatter,
    legend: String,
    legendOffset: Double,
    legendPosition: start | middle | end,
    orient: top | right | bottom | left,
    tickPadding: Double,
    tickRotation: Double,
    tickSize: Double,
    tickValues: Double | (js.Array[Double | String])
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], legend = legend, legendOffset = legendOffset, legendPosition = legendPosition.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any], tickPadding = tickPadding, tickRotation = tickRotation, tickSize = tickSize, tickValues = tickValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Bottom]
  }
}

