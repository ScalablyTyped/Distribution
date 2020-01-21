package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Pool")
@js.native
class Pool[T] protected () extends js.Object {
  def this(instantiator: js.Function0[T]) = this()
  var instantiator: js.Any = js.native
  var items: js.Any = js.native
  def clear(): Unit = js.native
  def free(item: T): Unit = js.native
  def freeAll(items: ArrayLike[T]): Unit = js.native
  def obtain(): T = js.native
}

