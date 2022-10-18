package typings.preactI18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Definition extends StObject {
    
    var mark: Boolean
    
    var scope: String
  }
  object Definition {
    
    inline def apply(mark: Boolean, scope: String): Definition = {
      val __obj = js.Dynamic.literal(mark = mark.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Definition]
    }
    
    extension [Self <: Definition](x: Self) {
      
      inline def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scope extends StObject {
    
    var definition: js.UndefOr[js.Object] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
  }
  object Scope {
    
    inline def apply(): Scope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scope]
    }
    
    extension [Self <: Scope](x: Self) {
      
      inline def setDefinition(value: js.Object): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
