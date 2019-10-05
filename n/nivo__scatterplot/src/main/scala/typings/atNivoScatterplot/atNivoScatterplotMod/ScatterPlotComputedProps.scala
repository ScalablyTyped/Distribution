package typings.atNivoScatterplot.atNivoScatterplotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterPlotComputedProps extends js.Object {
  var innerHeight: Double
  var innerWidth: Double
  var nodes: js.Array[Node]
  var outerHeight: Double
  var outerWidth: Double
  var xScale: Scale
  var yScale: Scale
}

object ScatterPlotComputedProps {
  @scala.inline
  def apply(
    innerHeight: Double,
    innerWidth: Double,
    nodes: js.Array[Node],
    outerHeight: Double,
    outerWidth: Double,
    xScale: /* value */ Value => Double,
    yScale: /* value */ Value => Double
  ): ScatterPlotComputedProps = {
    val __obj = js.Dynamic.literal(innerHeight = innerHeight, innerWidth = innerWidth, nodes = nodes, outerHeight = outerHeight, outerWidth = outerWidth, xScale = js.Any.fromFunction1(xScale), yScale = js.Any.fromFunction1(yScale))
  
    __obj.asInstanceOf[ScatterPlotComputedProps]
  }
}

