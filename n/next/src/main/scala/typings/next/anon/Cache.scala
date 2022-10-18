package typings.next.anon

import typings.std.CacheStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cache extends StObject {
  
  var Cache: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Cache */ Any
  
  var CacheStorage: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CacheStorage */ Any
  
  def cacheStorage(): CacheStorage
}
object Cache {
  
  inline def apply(
    Cache: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Cache */ Any,
    CacheStorage: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CacheStorage */ Any,
    cacheStorage: () => CacheStorage
  ): Cache = {
    val __obj = js.Dynamic.literal(Cache = Cache.asInstanceOf[js.Any], CacheStorage = CacheStorage.asInstanceOf[js.Any], cacheStorage = js.Any.fromFunction0(cacheStorage))
    __obj.asInstanceOf[Cache]
  }
  
  extension [Self <: Cache](x: Self) {
    
    inline def setCache(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Cache */ Any): Self = StObject.set(x, "Cache", value.asInstanceOf[js.Any])
    
    inline def setCacheStorage(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CacheStorage */ Any): Self = StObject.set(x, "CacheStorage", value.asInstanceOf[js.Any])
  }
}
