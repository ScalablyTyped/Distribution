package typings.nivoTooltip

import typings.nivoTooltip.distTypesContextMod.TooltipActionsContextData
import typings.nivoTooltip.distTypesContextMod.TooltipStateContextData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Actions extends StObject {
    
    var actions: TooltipActionsContextData
    
    var state: TooltipStateContextData
  }
  object Actions {
    
    inline def apply(actions: TooltipActionsContextData, state: TooltipStateContextData): Actions = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Actions]
    }
    
    extension [Self <: Actions](x: Self) {
      
      inline def setActions(value: TooltipActionsContextData): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setState(value: TooltipStateContextData): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
