package typings.optimism

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCacheMod {
  
  @JSImport("optimism/lib/cache", "Cache")
  @js.native
  open class Cache[K, V] () extends StObject {
    def this(max: Double) = this()
    def this(max: Double, dispose: js.Function2[/* value */ V, /* key */ K, Unit]) = this()
    def this(max: Unit, dispose: js.Function2[/* value */ V, /* key */ K, Unit]) = this()
    
    def clean(): Unit = js.native
    
    def delete(key: K): Boolean = js.native
    
    def dispose(value: V, key: K): Unit = js.native
    
    def get(key: K): js.UndefOr[V] = js.native
    
    /* private */ var getNode: Any = js.native
    
    def has(key: K): Boolean = js.native
    
    /* private */ var map: Any = js.native
    
    /* private */ var max: Any = js.native
    
    /* private */ var newest: Any = js.native
    
    /* private */ var oldest: Any = js.native
    
    def set(key: K, value: V): V = js.native
  }
}
