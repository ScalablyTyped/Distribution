package typings.openui5.anon

import typings.openui5.sapUiUx3ThingActionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * Selected ThingAction
    */
  var action: js.UndefOr[default] = js.undefined
  
  /**
    * Id of selected ThingAction
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * New State of the selected action. Only filled if the respective action maintains a state property, for
    * example 'FollowUp' or 'Favorite'
    */
  var newState: js.UndefOr[String] = js.undefined
}
object Action {
  
  inline def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: default): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNewState(value: String): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    inline def setNewStateUndefined: Self = StObject.set(x, "newState", js.undefined)
  }
}
