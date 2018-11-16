package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Pool")
@js.native
class Pool[T] protected () extends js.Object {
  def this(instantiator: js.Function0[T]) = this()
  var instantiator: js.Any = js.native
  var items: js.Any = js.native
  def clear(): scala.Unit = js.native
  def free(item: T): scala.Unit = js.native
  def freeAll(items: ArrayLike[T]): scala.Unit = js.native
  def obtain(): T = js.native
}

