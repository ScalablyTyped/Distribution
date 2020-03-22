package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WeakMap")
@js.native
class WeakMapCls[K /* <: js.Object */, V] () extends WeakMap[K, V] {
  def this(entries: Array[js.Tuple2[K, V]]) = this()
  def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
}

