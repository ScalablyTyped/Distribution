package typings.plottable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("plottable/build/src/utils/map", "Map")
  @js.native
  open class Map[K, V] () extends StObject {
    
    /* private */ var _es6Map: Any = js.native
    
    /* private */ var _keyValuePairs: Any = js.native
    
    def delete(key: K): Boolean = js.native
    
    def forEach(callbackFn: js.Function3[/* value */ V, /* key */ K, /* map */ Map[K, V], Unit]): Unit = js.native
    def forEach(callbackFn: js.Function3[/* value */ V, /* key */ K, /* map */ Map[K, V], Unit], thisArg: Any): Unit = js.native
    
    def get(key: K): V = js.native
    
    def has(key: K): Boolean = js.native
    
    def set(key: K, value: V): this.type = js.native
  }
}
