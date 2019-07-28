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
    xScale: Scale,
    yScale: Scale
  ): CustomSvgLayerProps = {
    val __obj = js.Dynamic.literal(innerHeight = innerHeight, innerWidth = innerWidth, nodes = nodes, outerHeight = outerHeight, outerWidth = outerWidth, xScale = xScale, yScale = yScale)
  
    __obj.asInstanceOf[CustomSvgLayerProps]
  }
}

