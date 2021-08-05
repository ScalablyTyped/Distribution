package typings.navigationReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait StateNavigator extends StObject {
    
    var stateNavigator: typings.navigation.mod.StateNavigator
  }
  object StateNavigator {
    
    inline def apply(stateNavigator: typings.navigation.mod.StateNavigator): StateNavigator = {
      val __obj = js.Dynamic.literal(stateNavigator = stateNavigator.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateNavigator]
    }
    
    extension [Self <: StateNavigator](x: Self) {
      
      inline def setStateNavigator(value: typings.navigation.mod.StateNavigator): Self = StObject.set(x, "stateNavigator", value.asInstanceOf[js.Any])
    }
  }
}
