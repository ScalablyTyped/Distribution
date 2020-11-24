package typings.nivoTooltip.anon

import typings.nivoTooltip.contextMod.TooltipActionsContextData
import typings.nivoTooltip.contextMod.TooltipStateContextData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions extends js.Object {
  
  var actions: TooltipActionsContextData = js.native
  
  var state: TooltipStateContextData = js.native
}
object Actions {
  
  @scala.inline
  def apply(actions: TooltipActionsContextData, state: TooltipStateContextData): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit class ActionsOps[Self <: Actions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActions(value: TooltipActionsContextData): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: TooltipStateContextData): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
