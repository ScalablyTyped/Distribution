package typings.atNivoLine.atNivoLineMod

import typings.atNivoScales.atNivoScalesMod.ScaleFunc
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @nivo/line.@nivo/line.LineSvgProps, 'xScale' | 'yScale'> ]: @nivo/line.@nivo/line.LineSvgProps[P]} */ trait LineCustomLayerProps extends js.Object {
  var xScale: ScaleFunc
  var yScale: ScaleFunc
}

object LineCustomLayerProps {
  @scala.inline
  def apply(
    xScale: /* value */ String | Double | Date => Double,
    yScale: /* value */ String | Double | Date => Double
  ): LineCustomLayerProps = {
    val __obj = js.Dynamic.literal(xScale = js.Any.fromFunction1(xScale), yScale = js.Any.fromFunction1(yScale))
  
    __obj.asInstanceOf[LineCustomLayerProps]
  }
}

