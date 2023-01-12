package typings.metroCache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait MetroCache extends StObject {
    
    var AutoCleanFileStore: Any
    
    var Cache: Any
    
    var FileStore: Any
    
    var HttpGetStore: Any
    
    var HttpStore: Any
    
    var stableHash: Any
  }
  object MetroCache {
    
    inline def apply(
      AutoCleanFileStore: Any,
      Cache: Any,
      FileStore: Any,
      HttpGetStore: Any,
      HttpStore: Any,
      stableHash: Any
    ): MetroCache = {
      val __obj = js.Dynamic.literal(AutoCleanFileStore = AutoCleanFileStore.asInstanceOf[js.Any], Cache = Cache.asInstanceOf[js.Any], FileStore = FileStore.asInstanceOf[js.Any], HttpGetStore = HttpGetStore.asInstanceOf[js.Any], HttpStore = HttpStore.asInstanceOf[js.Any], stableHash = stableHash.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetroCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetroCache] (val x: Self) extends AnyVal {
      
      inline def setAutoCleanFileStore(value: Any): Self = StObject.set(x, "AutoCleanFileStore", value.asInstanceOf[js.Any])
      
      inline def setCache(value: Any): Self = StObject.set(x, "Cache", value.asInstanceOf[js.Any])
      
      inline def setFileStore(value: Any): Self = StObject.set(x, "FileStore", value.asInstanceOf[js.Any])
      
      inline def setHttpGetStore(value: Any): Self = StObject.set(x, "HttpGetStore", value.asInstanceOf[js.Any])
      
      inline def setHttpStore(value: Any): Self = StObject.set(x, "HttpStore", value.asInstanceOf[js.Any])
      
      inline def setStableHash(value: Any): Self = StObject.set(x, "stableHash", value.asInstanceOf[js.Any])
    }
  }
}
