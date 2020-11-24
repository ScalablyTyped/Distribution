package typings.nivoTooltip.contextMod

import typings.nivoTooltip.typesMod.TooltipAnchor
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipActionsContextData extends js.Object {
  
  def hideTooltip(): Unit = js.native
  
  def showTooltipAt(content: Element, position: js.Tuple2[Double, Double]): Unit = js.native
  def showTooltipAt(content: Element, position: js.Tuple2[Double, Double], anchor: TooltipAnchor): Unit = js.native
  
  def showTooltipFromEvent(content: Element, event: MouseEvent[typings.std.Element, NativeMouseEvent]): Unit = js.native
}
