package typings.next

import typings.next.distServerLibIncrementalCacheMod.CacheHandler
import typings.next.distServerLibIncrementalCacheMod.CacheHandlerContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLibIncrementalCacheFileSystemCacheMod {
  
  @JSImport("next/dist/server/lib/incremental-cache/file-system-cache", JSImport.Default)
  @js.native
  open class default protected () extends FileSystemCache {
    def this(ctx: CacheHandlerContext) = this()
  }
  
  @js.native
  trait FileSystemCache extends CacheHandler {
    
    /* private */ var appDir: Any = js.native
    
    /* private */ var flushToDisk: Any = js.native
    
    /* private */ var fs: Any = js.native
    
    /* private */ var getFsPath: Any = js.native
    
    /* private */ var memoryCache: Any = js.native
    
    /* private */ var serverDistDir: Any = js.native
  }
}
