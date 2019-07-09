package typings
package atNivoScatterplotLib.atNivoScatterplotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterPlotComputedProps extends js.Object {
  var innerHeight: scala.Double
  var innerWidth: scala.Double
  var nodes: js.Array[Node]
  var outerHeight: scala.Double
  var outerWidth: scala.Double
  var xScale: Scale
  var yScale: Scale
}

object ScatterPlotComputedProps {
  @scala.inline
  def apply(
    innerHeight: scala.Double,
    innerWidth: scala.Double,
    nodes: js.Array[Node],
    outerHeight: scala.Double,
    outerWidth: scala.Double,
    xScale: Scale,
    yScale: Scale
  ): ScatterPlotComputedProps = {
    val __obj = js.Dynamic.literal(innerHeight = innerHeight, innerWidth = innerWidth, nodes = nodes, outerHeight = outerHeight, outerWidth = outerWidth, xScale = xScale, yScale = yScale)
  
    __obj.asInstanceOf[ScatterPlotComputedProps]
  }
}

