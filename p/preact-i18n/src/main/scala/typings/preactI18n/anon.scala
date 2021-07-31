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
    
    @scala.inline
    def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  trait Definition extends StObject {
    
    var definition: js.UndefOr[js.Object] = js.undefined
    
    var mark: js.UndefOr[Boolean] = js.undefined
    
    var scope: js.UndefOr[js.Any] = js.undefined
  }
  object Definition {
    
    @scala.inline
    def apply(): Definition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Definition]
    }
    
    @scala.inline
    implicit class DefinitionMutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefinition(value: js.Object): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
      
      @scala.inline
      def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    var fields: js.UndefOr[js.Object] = js.undefined
    
    var id: String
    
    var plural: js.UndefOr[Double] = js.undefined
  }
  object Fields {
    
    @scala.inline
    def apply(id: String): Fields = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlural(value: Double): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
    }
  }
  
  trait Scope extends StObject {
    
    var definition: js.UndefOr[js.Object] = js.undefined
    
    var scope: js.UndefOr[js.Any] = js.undefined
  }
  object Scope {
    
    @scala.inline
    def apply(): Scope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scope]
    }
    
    @scala.inline
    implicit class ScopeMutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefinition(value: js.Object): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
