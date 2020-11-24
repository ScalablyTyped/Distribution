package typings.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typings.minappEnv.Iterable
import typings.minappEnv.WeakMapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("WeakMap")
@js.native
class WeakMap[K /* <: js.Object */, V] ()
  extends typings.minappEnv.WeakMap[K, V] {
  def this(entries: typings.minappEnv.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
}
@JSGlobal("WeakMap")
@js.native
object WeakMap extends TopLevel[WeakMapConstructor]
