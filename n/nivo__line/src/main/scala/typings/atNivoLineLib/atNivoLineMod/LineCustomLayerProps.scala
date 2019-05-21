package typings
package atNivoLineLib.atNivoLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @nivo/line.@nivo/line.LineSvgProps, 'xScale' | 'yScale'> ]: @nivo/line.@nivo/line.LineSvgProps[P]} */ trait LineCustomLayerProps extends js.Object {
  var xScale: atNivoScalesLib.atNivoScalesMod.ScaleFunc
  var yScale: atNivoScalesLib.atNivoScalesMod.ScaleFunc
  def hideTooltip(): scala.Unit
  def showTooltip(
    tooltip: reactLib.reactMod.ReactNode,
    event: reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]
  ): scala.Unit
}

object LineCustomLayerProps {
  @scala.inline
  def apply(
    hideTooltip: () => scala.Unit,
    showTooltip: (reactLib.reactMod.ReactNode, reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]) => scala.Unit,
    xScale: atNivoScalesLib.atNivoScalesMod.ScaleFunc,
    yScale: atNivoScalesLib.atNivoScalesMod.ScaleFunc
  ): LineCustomLayerProps = {
    val __obj = js.Dynamic.literal(hideTooltip = js.Any.fromFunction0(hideTooltip), showTooltip = js.Any.fromFunction2(showTooltip), xScale = xScale, yScale = yScale)
  
    __obj.asInstanceOf[LineCustomLayerProps]
  }
}

