package typings
package atNivoLineLib.atNivoLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @nivo/line.@nivo/line.LineSvgProps, 'xScale' | 'yScale'> ]: @nivo/line.@nivo/line.LineSvgProps[P]} */ @js.native
trait LineCustomLayerProps extends js.Object {
  @JSName("xScale")
  var xScale_Original: atNivoScalesLib.atNivoScalesMod.ScaleFunc = js.native
  @JSName("yScale")
  var yScale_Original: atNivoScalesLib.atNivoScalesMod.ScaleFunc = js.native
  def hideTooltip(): scala.Unit = js.native
  def showTooltip(
    tooltip: reactLib.reactMod.ReactNs.ReactNode,
    event: reactLib.reactMod.ReactNs.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]
  ): scala.Unit = js.native
  def xScale(value: java.lang.String): scala.Double = js.native
  def xScale(value: scala.Double): scala.Double = js.native
  def xScale(value: stdLib.Date): scala.Double = js.native
  def yScale(value: java.lang.String): scala.Double = js.native
  def yScale(value: scala.Double): scala.Double = js.native
  def yScale(value: stdLib.Date): scala.Double = js.native
}

