package typings.optimism

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("optimism/lib/cache", JSImport.Namespace)
@js.native
object cacheMod extends js.Object {
  @js.native
  class Cache[K, V] () extends js.Object {
    def this(max: Double) = this()
    def this(max: js.UndefOr[scala.Nothing], dispose: js.Function2[/* value */ V, /* key */ K, Unit]) = this()
    def this(max: Double, dispose: js.Function2[/* value */ V, /* key */ K, Unit]) = this()
    var getEntry: js.Any = js.native
    var map: js.Any = js.native
    var max: js.Any = js.native
    var newest: js.Any = js.native
    var oldest: js.Any = js.native
    def clean(): Unit = js.native
    def delete(key: K): Boolean = js.native
    def dispose(value: V, key: K): Unit = js.native
    def get(key: K): Unit | V = js.native
    def has(key: K): Boolean = js.native
    def set(key: K, value: V): V = js.native
  }
  
}

