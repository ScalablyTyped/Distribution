package typings
package atNivoBarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var format: java.lang.String | atNivoBarLib.atNivoBarMod.LabelFormatter
  var legend: java.lang.String
  var legendOffset: scala.Double
  var legendPosition: atNivoBarLib.atNivoBarLibStrings.start | atNivoBarLib.atNivoBarLibStrings.middle | atNivoBarLib.atNivoBarLibStrings.end
  var orient: atNivoBarLib.atNivoBarLibStrings.top | atNivoBarLib.atNivoBarLibStrings.right | atNivoBarLib.atNivoBarLibStrings.bottom | atNivoBarLib.atNivoBarLibStrings.left
  var tickPadding: scala.Double
  var tickRotation: scala.Double
  var tickSize: scala.Double
  var tickValues: scala.Double | (js.Array[scala.Double | java.lang.String])
}

object Anon_Bottom {
  @scala.inline
  def apply(
    format: java.lang.String | atNivoBarLib.atNivoBarMod.LabelFormatter,
    legend: java.lang.String,
    legendOffset: scala.Double,
    legendPosition: atNivoBarLib.atNivoBarLibStrings.start | atNivoBarLib.atNivoBarLibStrings.middle | atNivoBarLib.atNivoBarLibStrings.end,
    orient: atNivoBarLib.atNivoBarLibStrings.top | atNivoBarLib.atNivoBarLibStrings.right | atNivoBarLib.atNivoBarLibStrings.bottom | atNivoBarLib.atNivoBarLibStrings.left,
    tickPadding: scala.Double,
    tickRotation: scala.Double,
    tickSize: scala.Double,
    tickValues: scala.Double | (js.Array[scala.Double | java.lang.String])
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], legend = legend, legendOffset = legendOffset, legendPosition = legendPosition.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any], tickPadding = tickPadding, tickRotation = tickRotation, tickSize = tickSize, tickValues = tickValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Bottom]
  }
}

