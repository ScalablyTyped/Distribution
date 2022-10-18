package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var actionName: String
  
  var actionType: String
  
  var target: String
}
object Action {
  
  inline def apply(actionName: String, actionType: String, target: String): Action = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], actionType = actionType.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setActionName(value: String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setActionType(value: String): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
