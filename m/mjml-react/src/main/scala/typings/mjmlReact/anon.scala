package typings.mjmlReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: String
  }
  object Children {
    
    @scala.inline
    def apply(children: String): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  trait Condition extends StObject {
    
    var children: String
    
    var condition: String
  }
  object Condition {
    
    @scala.inline
    def apply(children: String, condition: String): Condition = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
      __obj.asInstanceOf[Condition]
    }
    
    @scala.inline
    implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Errors extends StObject {
    
    var errors: js.Array[Error]
    
    var html: String
  }
  object Errors {
    
    @scala.inline
    def apply(errors: js.Array[Error], html: String): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    }
  }
  
  trait Inline extends StObject {
    
    var children: String
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
  }
  object Inline {
    
    @scala.inline
    def apply(children: String): Inline = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Inline]
    }
    
    @scala.inline
    implicit class InlineMutableBuilder[Self <: Inline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    }
  }
  
  trait Name
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var name: String
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Src extends StObject {
    
    var src: String
  }
  object Src {
    
    @scala.inline
    def apply(src: String): Src = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Src]
    }
    
    @scala.inline
    implicit class SrcMutableBuilder[Self <: Src] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
