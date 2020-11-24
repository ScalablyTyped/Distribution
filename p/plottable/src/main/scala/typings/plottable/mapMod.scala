package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/utils/map", JSImport.Namespace)
@js.native
object mapMod extends js.Object {
  
  @js.native
  class Map[K, V] () extends js.Object {
    
    var _es6Map: js.Any = js.native
    
    var _keyValuePairs: js.Any = js.native
    
    def delete(key: K): Boolean = js.native
    
    def forEach(callbackFn: js.Function3[/* value */ V, /* key */ K, /* map */ Map[K, V], Unit]): Unit = js.native
    def forEach(callbackFn: js.Function3[/* value */ V, /* key */ K, /* map */ Map[K, V], Unit], thisArg: js.Any): Unit = js.native
    
    def get(key: K): V = js.native
    
    def has(key: K): Boolean = js.native
    
    def set(key: K, value: V): this.type = js.native
  }
}
