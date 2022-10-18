package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientOnly extends StObject {
  
  var appPaths: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var clientOnly: Boolean
  
  var page: String
}
object ClientOnly {
  
  inline def apply(clientOnly: Boolean, page: String): ClientOnly = {
    val __obj = js.Dynamic.literal(clientOnly = clientOnly.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOnly]
  }
  
  extension [Self <: ClientOnly](x: Self) {
    
    inline def setAppPaths(value: js.Array[String]): Self = StObject.set(x, "appPaths", value.asInstanceOf[js.Any])
    
    inline def setAppPathsNull: Self = StObject.set(x, "appPaths", null)
    
    inline def setAppPathsUndefined: Self = StObject.set(x, "appPaths", js.undefined)
    
    inline def setAppPathsVarargs(value: String*): Self = StObject.set(x, "appPaths", js.Array(value*))
    
    inline def setClientOnly(value: Boolean): Self = StObject.set(x, "clientOnly", value.asInstanceOf[js.Any])
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
