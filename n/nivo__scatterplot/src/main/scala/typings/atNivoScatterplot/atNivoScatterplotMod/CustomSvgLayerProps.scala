package typings.atNivoScatterplot.atNivoScatterplotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @nivo/scatterplot.@nivo/scatterplot.ScatterPlotSvgProps, 'xScale' | 'yScale'> ]: @nivo/scatterplot.@nivo/scatterplot.ScatterPlotSvgProps[P]} */ trait CustomSvgLayerProps extends ScatterPlotComputedProps

object CustomSvgLayerProps {
  @scala.inline
  def apply(
    innerHeight: Double,
    innerWidth: Double,
    nodes: js.Array[Node],
    outerHeight: Double,
    outerWidth: Double,
    xScale: /* value */ Value => Double,
    yScale: /* value */ Value => Double
  ): CustomSvgLayerProps = {
    val __obj = js.Dynamic.literal(innerHeight = innerHeight, innerWidth = innerWidth, nodes = nodes, outerHeight = outerHeight, outerWidth = outerWidth, xScale = js.Any.fromFunction1(xScale), yScale = js.Any.fromFunction1(yScale))
  
    __obj.asInstanceOf[CustomSvgLayerProps]
  }
}

