package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.Pool")
@js.native
class Pool[T] protected ()
  extends StObject
     with typings.phaser.spine.Pool[T] {
  def this(instantiator: js.Function0[T]) = this()
  
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /* CompleteClass */
  override def free(item: T): Unit = js.native
  
  /* CompleteClass */
  override def freeAll(items: ArrayLike[T]): Unit = js.native
  
  /* CompleteClass */
  var instantiator: js.Any = js.native
  
  /* CompleteClass */
  var items: js.Any = js.native
  
  /* CompleteClass */
  override def obtain(): T = js.native
}
