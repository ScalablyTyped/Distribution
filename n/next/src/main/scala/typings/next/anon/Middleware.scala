package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Middleware extends StObject {
  
  /** Whether we should look for a middleware or not */
  var middleware: Boolean
  
  var page: String
}
object Middleware {
  
  inline def apply(middleware: Boolean, page: String): Middleware = {
    val __obj = js.Dynamic.literal(middleware = middleware.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Middleware]
  }
  
  extension [Self <: Middleware](x: Self) {
    
    inline def setMiddleware(value: Boolean): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
