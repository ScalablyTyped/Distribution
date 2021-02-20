package typings.nivoTooltip

import typings.nivoTooltip.contextMod.TooltipActionsContextData
import typings.nivoTooltip.contextMod.TooltipStateContextData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Actions extends StObject {
    
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
    implicit class ActionsMutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: TooltipActionsContextData): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: TooltipStateContextData): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
