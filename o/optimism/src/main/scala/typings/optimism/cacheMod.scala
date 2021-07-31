package typings.optimism

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("optimism/lib/cache", "Cache")
  @js.native
  class Cache[K, V] () extends StObject {
    def this(max: Double) = this()
    def this(max: Double, dispose: js.Function2[/* value */ V, /* key */ K, Unit]) = this()
    def this(max: Unit, dispose: js.Function2[/* value */ V, /* key */ K, Unit]) = this()
    
    def clean(): Unit = js.native
    
    def delete(key: K): Boolean = js.native
    
    def dispose(value: V, key: K): Unit = js.native
    
    def get(key: K): js.UndefOr[V] = js.native
    
    var getEntry: js.Any = js.native
    
    def has(key: K): Boolean = js.native
    
    var map: js.Any = js.native
    
    var max: js.Any = js.native
    
    var newest: js.Any = js.native
    
    var oldest: js.Any = js.native
    
    def set(key: K, value: V): V = js.native
  }
}
