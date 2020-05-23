package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Pool")
@js.native
class Pool[T] protected ()
  extends typings.phaser.spine.Pool[T] {
  def this(instantiator: js.Function0[T]) = this()
  /* CompleteClass */
  override var instantiator: js.Any = js.native
  /* CompleteClass */
  override var items: js.Any = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def free(item: T): Unit = js.native
  /* CompleteClass */
  override def freeAll(items: ArrayLike[T]): Unit = js.native
  /* CompleteClass */
  override def obtain(): T = js.native
}

