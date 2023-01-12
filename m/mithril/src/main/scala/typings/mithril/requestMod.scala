package typings.mithril

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod extends Shortcut {
  
  @JSImport("mithril/request", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  trait Static extends StObject {
    
    var jsonp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jsonp */ Any
    
    var request: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof request */ Any
  }
  object Static {
    
    inline def apply(
      jsonp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jsonp */ Any,
      request: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof request */ Any
    ): Static = {
      val __obj = js.Dynamic.literal(jsonp = jsonp.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[Static]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
      
      inline def setJsonp(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jsonp */ Any): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof request */ Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `requestMod.foo` */
  override def _to: Static = ^
}
