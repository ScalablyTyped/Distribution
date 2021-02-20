package typings.nunjucks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Async extends StObject {
    
    var async: js.UndefOr[Boolean] = js.native
    
    var useCache: js.UndefOr[Boolean] = js.native
  }
  object Async {
    
    @scala.inline
    def apply(): Async = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Async]
    }
    
    @scala.inline
    implicit class AsyncMutableBuilder[Self <: Async] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCacheUndefined: Self = StObject.set(x, "useCache", js.undefined)
    }
  }
  
  @js.native
  trait Autoescape extends StObject {
    
    var autoescape: Boolean = js.native
  }
  object Autoescape {
    
    @scala.inline
    def apply(autoescape: Boolean): Autoescape = {
      val __obj = js.Dynamic.literal(autoescape = autoescape.asInstanceOf[js.Any])
      __obj.asInstanceOf[Autoescape]
    }
    
    @scala.inline
    implicit class AutoescapeMutableBuilder[Self <: Autoescape] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoescape(value: Boolean): Self = StObject.set(x, "autoescape", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BlockEnd extends StObject {
    
    var blockEnd: js.UndefOr[String] = js.native
    
    var blockStart: js.UndefOr[String] = js.native
    
    var commentEnd: js.UndefOr[String] = js.native
    
    var commentStart: js.UndefOr[String] = js.native
    
    var variableEnd: js.UndefOr[String] = js.native
    
    var variableStart: js.UndefOr[String] = js.native
  }
  object BlockEnd {
    
    @scala.inline
    def apply(): BlockEnd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockEnd]
    }
    
    @scala.inline
    implicit class BlockEndMutableBuilder[Self <: BlockEnd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockEnd(value: String): Self = StObject.set(x, "blockEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockEndUndefined: Self = StObject.set(x, "blockEnd", js.undefined)
      
      @scala.inline
      def setBlockStart(value: String): Self = StObject.set(x, "blockStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockStartUndefined: Self = StObject.set(x, "blockStart", js.undefined)
      
      @scala.inline
      def setCommentEnd(value: String): Self = StObject.set(x, "commentEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentEndUndefined: Self = StObject.set(x, "commentEnd", js.undefined)
      
      @scala.inline
      def setCommentStart(value: String): Self = StObject.set(x, "commentStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentStartUndefined: Self = StObject.set(x, "commentStart", js.undefined)
      
      @scala.inline
      def setVariableEnd(value: String): Self = StObject.set(x, "variableEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableEndUndefined: Self = StObject.set(x, "variableEnd", js.undefined)
      
      @scala.inline
      def setVariableStart(value: String): Self = StObject.set(x, "variableStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableStartUndefined: Self = StObject.set(x, "variableStart", js.undefined)
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    var template: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, template: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
}
