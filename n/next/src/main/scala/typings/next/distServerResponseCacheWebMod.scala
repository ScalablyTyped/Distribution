package typings.next

import typings.next.anon.Entry
import typings.next.anon.IsPrefetch
import typings.next.distServerResponseCacheTypesMod.ResponseCacheEntry
import typings.next.distServerResponseCacheTypesMod.ResponseGenerator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerResponseCacheWebMod {
  
  @JSImport("next/dist/server/response-cache/web", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with WebResponseCache {
    def this(minimalMode: Boolean) = this()
  }
  
  @js.native
  trait WebResponseCache extends StObject {
    
    def get(key: String, responseGenerator: ResponseGenerator, context: IsPrefetch): js.Promise[ResponseCacheEntry | Null] = js.native
    def get(key: Null, responseGenerator: ResponseGenerator, context: IsPrefetch): js.Promise[ResponseCacheEntry | Null] = js.native
    
    var minimalMode: js.UndefOr[Boolean] = js.native
    
    var pendingResponses: Map[String, js.Promise[ResponseCacheEntry | Null]] = js.native
    
    var previousCacheItem: js.UndefOr[Entry] = js.native
  }
}
