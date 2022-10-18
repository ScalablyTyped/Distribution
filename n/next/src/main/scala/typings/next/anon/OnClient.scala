package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClient[T] extends StObject {
  
  def onClient(): T
  
  def onEdgeServer(): T
  
  def onServer(): T
  
  var page: String
  
  var pageRuntime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerRuntime */ Any
}
object OnClient {
  
  inline def apply[T](
    onClient: () => T,
    onEdgeServer: () => T,
    onServer: () => T,
    page: String,
    pageRuntime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerRuntime */ Any
  ): OnClient[T] = {
    val __obj = js.Dynamic.literal(onClient = js.Any.fromFunction0(onClient), onEdgeServer = js.Any.fromFunction0(onEdgeServer), onServer = js.Any.fromFunction0(onServer), page = page.asInstanceOf[js.Any], pageRuntime = pageRuntime.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClient[T]]
  }
  
  extension [Self <: OnClient[?], T](x: Self & OnClient[T]) {
    
    inline def setOnClient(value: () => T): Self = StObject.set(x, "onClient", js.Any.fromFunction0(value))
    
    inline def setOnEdgeServer(value: () => T): Self = StObject.set(x, "onEdgeServer", js.Any.fromFunction0(value))
    
    inline def setOnServer(value: () => T): Self = StObject.set(x, "onServer", js.Any.fromFunction0(value))
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageRuntime(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerRuntime */ Any
    ): Self = StObject.set(x, "pageRuntime", value.asInstanceOf[js.Any])
  }
}
