package typings.ngwysiwyg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngWYSIWYG {
  
  trait Config extends StObject {
    
    var sanitize: Boolean
    
    var toolbar: js.UndefOr[js.Array[Toolbar]] = js.undefined
  }
  object Config {
    
    inline def apply(sanitize: Boolean): Config = {
      val __obj = js.Dynamic.literal(sanitize = sanitize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
      
      inline def setToolbar(value: js.Array[Toolbar]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      inline def setToolbarVarargs(value: Toolbar*): Self = StObject.set(x, "toolbar", js.Array(value*))
    }
  }
  
  trait Toolbar extends StObject {
    
    var items: js.Array[String]
    
    var name: String
  }
  object Toolbar {
    
    inline def apply(items: js.Array[String], name: String): Toolbar = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Toolbar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Toolbar] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
