package typings.openui5

import typings.openui5.openui5Strings.component
import typings.openui5.sapUiCoreComponentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreServiceServiceMod {
  
  trait Context extends StObject {
    
    /**
      * Object that is in scope (e.g. component instance)
      */
    var scopeObject: default
    
    /**
      * Type of object that is in scope
      */
    var scopeType: component
  }
  object Context {
    
    inline def apply(scopeObject: default): Context = {
      val __obj = js.Dynamic.literal(scopeObject = scopeObject.asInstanceOf[js.Any], scopeType = "component")
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setScopeObject(value: default): Self = StObject.set(x, "scopeObject", value.asInstanceOf[js.Any])
      
      inline def setScopeType(value: component): Self = StObject.set(x, "scopeType", value.asInstanceOf[js.Any])
    }
  }
}
