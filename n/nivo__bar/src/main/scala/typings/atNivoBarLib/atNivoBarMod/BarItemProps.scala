package typings
package atNivoBarLib.atNivoBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarItemProps extends js.Object {
  var borderColor: java.lang.String = js.native
  var borderRadius: scala.Double = js.native
  var borderWidth: scala.Double = js.native
  var color: java.lang.String = js.native
  var data: atNivoBarLib.Anon_Id = js.native
  var height: scala.Double = js.native
  var label: java.lang.String = js.native
  var labelColor: java.lang.String = js.native
  @JSName("onClick")
  var onClick_Original: BarClickHandler = js.native
  var shouldRenderLabel: scala.Boolean = js.native
  var theme: atNivoCoreLib.atNivoCoreMod.Theme = js.native
  var tooltip: TooltipProp = js.native
  var tooltipFormat: java.lang.String | ValueFormatter = js.native
  var width: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def hideTooltip(): scala.Unit = js.native
  def onClick(
    datum: BarExtendedDatum,
    event: reactLib.reactMod.MouseEvent[stdLib.HTMLCanvasElement, reactLib.NativeMouseEvent]
  ): scala.Unit = js.native
  def showTooltip(
    tooltip: reactLib.reactMod.ReactNode,
    event: reactLib.reactMod.MouseEvent[stdLib.HTMLCanvasElement, reactLib.NativeMouseEvent]
  ): scala.Unit = js.native
}

