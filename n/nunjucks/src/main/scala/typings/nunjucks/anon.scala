package typings.nunjucks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Async extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var useCache: js.UndefOr[Boolean] = js.undefined
  }
  object Async {
    
    inline def apply(): Async = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Async]
    }
    
    extension [Self <: Async](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
      
      inline def setUseCacheUndefined: Self = StObject.set(x, "useCache", js.undefined)
    }
  }
  
  trait Autoescape extends StObject {
    
    var autoescape: Boolean
  }
  object Autoescape {
    
    inline def apply(autoescape: Boolean): Autoescape = {
      val __obj = js.Dynamic.literal(autoescape = autoescape.asInstanceOf[js.Any])
      __obj.asInstanceOf[Autoescape]
    }
    
    extension [Self <: Autoescape](x: Self) {
      
      inline def setAutoescape(value: Boolean): Self = StObject.set(x, "autoescape", value.asInstanceOf[js.Any])
    }
  }
  
  trait BlockEnd extends StObject {
    
    var blockEnd: js.UndefOr[String] = js.undefined
    
    var blockStart: js.UndefOr[String] = js.undefined
    
    var commentEnd: js.UndefOr[String] = js.undefined
    
    var commentStart: js.UndefOr[String] = js.undefined
    
    var variableEnd: js.UndefOr[String] = js.undefined
    
    var variableStart: js.UndefOr[String] = js.undefined
  }
  object BlockEnd {
    
    inline def apply(): BlockEnd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockEnd]
    }
    
    extension [Self <: BlockEnd](x: Self) {
      
      inline def setBlockEnd(value: String): Self = StObject.set(x, "blockEnd", value.asInstanceOf[js.Any])
      
      inline def setBlockEndUndefined: Self = StObject.set(x, "blockEnd", js.undefined)
      
      inline def setBlockStart(value: String): Self = StObject.set(x, "blockStart", value.asInstanceOf[js.Any])
      
      inline def setBlockStartUndefined: Self = StObject.set(x, "blockStart", js.undefined)
      
      inline def setCommentEnd(value: String): Self = StObject.set(x, "commentEnd", value.asInstanceOf[js.Any])
      
      inline def setCommentEndUndefined: Self = StObject.set(x, "commentEnd", js.undefined)
      
      inline def setCommentStart(value: String): Self = StObject.set(x, "commentStart", value.asInstanceOf[js.Any])
      
      inline def setCommentStartUndefined: Self = StObject.set(x, "commentStart", js.undefined)
      
      inline def setVariableEnd(value: String): Self = StObject.set(x, "variableEnd", value.asInstanceOf[js.Any])
      
      inline def setVariableEndUndefined: Self = StObject.set(x, "variableEnd", js.undefined)
      
      inline def setVariableStart(value: String): Self = StObject.set(x, "variableStart", value.asInstanceOf[js.Any])
      
      inline def setVariableStartUndefined: Self = StObject.set(x, "variableStart", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var template: String
  }
  object Name {
    
    inline def apply(name: String, template: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
}
