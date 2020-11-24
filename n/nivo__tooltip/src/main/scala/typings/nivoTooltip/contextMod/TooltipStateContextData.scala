package typings.nivoTooltip.contextMod

import typings.nivoTooltip.nivoTooltipBooleans.`false`
import typings.nivoTooltip.nivoTooltipBooleans.`true`
import typings.nivoTooltip.typesMod.TooltipAnchor
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nivoTooltip.contextMod.TooltipStateContextDataVisible
  - typings.nivoTooltip.contextMod.TooltipStateContextDataHidden
*/
trait TooltipStateContextData extends js.Object
object TooltipStateContextData {
  
  @scala.inline
  def TooltipStateContextDataVisible(anchor: TooltipAnchor, content: Element, isVisible: `true`, position: js.Tuple2[Double, Double]): TooltipStateContextData = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipStateContextData]
  }
  
  @scala.inline
  def TooltipStateContextDataHidden(anchor: Null, content: Null, isVisible: `false`, position: js.Tuple2[Null, Null]): TooltipStateContextData = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipStateContextData]
  }
}
