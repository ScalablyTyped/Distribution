package typings.nodeFetchCache

import typings.nodeFetch.mod.RequestInfo
import typings.nodeFetch.mod.RequestInit
import typings.nodeFetch.mod.Response
import typings.nodeFetchCache.mod.Cache
import typings.nodeFetchCache.mod.FetchBuilder_
import typings.nodeFetchCache.mod.FetchCache
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(url: RequestInfo): js.Promise[Response] = js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    def apply(url: URL): js.Promise[Response] = js.native
    def apply(url: URL, init: RequestInit): js.Promise[Response] = js.native
  }
  
  trait WithCache extends StObject {
    
    def withCache(cache: Cache): FetchCache
    @JSName("withCache")
    var withCache_Original: FetchBuilder_
  }
  object WithCache {
    
    inline def apply(withCache: /* cache */ Cache => FetchCache): WithCache = {
      val __obj = js.Dynamic.literal(withCache = js.Any.fromFunction1(withCache))
      __obj.asInstanceOf[WithCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithCache] (val x: Self) extends AnyVal {
      
      inline def setWithCache(value: /* cache */ Cache => FetchCache): Self = StObject.set(x, "withCache", js.Any.fromFunction1(value))
    }
  }
}
