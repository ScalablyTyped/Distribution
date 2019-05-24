package typings
package atNivoLineLib.atNivoLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @nivo/line.@nivo/line.LineSvgProps, 'xScale' | 'yScale'> ]: @nivo/line.@nivo/line.LineSvgProps[P]} */ trait LineCustomLayerProps extends js.Object {
  var xScale: atNivoScalesLib.atNivoScalesMod.ScaleFunc
  var yScale: atNivoScalesLib.atNivoScalesMod.ScaleFunc
}

object LineCustomLayerProps {
  @scala.inline
  def apply(
    xScale: atNivoScalesLib.atNivoScalesMod.ScaleFunc,
    yScale: atNivoScalesLib.atNivoScalesMod.ScaleFunc
  ): LineCustomLayerProps = {
    val __obj = js.Dynamic.literal(xScale = xScale, yScale = yScale)
  
    __obj.asInstanceOf[LineCustomLayerProps]
  }
}

