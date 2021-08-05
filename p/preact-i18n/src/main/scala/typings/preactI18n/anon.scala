package typings.preactI18n

import typings.preact.mod.ComponentChild
import typings.preact.mod.ComponentChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: ComponentChildren
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  trait Definition extends StObject {
    
    var definition: js.UndefOr[js.Object] = js.undefined
    
    var mark: js.UndefOr[Boolean] = js.undefined
    
    var scope: js.UndefOr[js.Any] = js.undefined
  }
  object Definition {
    
    inline def apply(): Definition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Definition]
    }
    
    extension [Self <: Definition](x: Self) {
      
      inline def setDefinition(value: js.Object): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
      
      inline def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    var fields: js.UndefOr[js.Object] = js.undefined
    
    var id: String
    
    var plural: js.UndefOr[Double] = js.undefined
  }
  object Fields {
    
    inline def apply(id: String): Fields = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPlural(value: Double): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      inline def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
    }
  }
  
  trait Scope extends StObject {
    
    var definition: js.UndefOr[js.Object] = js.undefined
    
    var scope: js.UndefOr[js.Any] = js.undefined
  }
  object Scope {
    
    inline def apply(): Scope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scope]
    }
    
    extension [Self <: Scope](x: Self) {
      
      inline def setDefinition(value: js.Object): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
      
      inline def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
