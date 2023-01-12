package typings.preactI18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Definition extends StObject {
    
    var definition: js.UndefOr[js.Object] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
  }
  object Definition {
    
    inline def apply(): Definition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Definition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
      
      inline def setDefinition(value: js.Object): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait Mark extends StObject {
    
    var mark: Boolean
    
    var scope: String
  }
  object Mark {
    
    inline def apply(mark: Boolean, scope: String): Mark = {
      val __obj = js.Dynamic.literal(mark = mark.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mark]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mark] (val x: Self) extends AnyVal {
      
      inline def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
