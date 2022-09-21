package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/base", "Pool")
@js.native
open class Pool[T] protected () extends StObject {
  def this(instantiator: js.Function0[T]) = this()
  
  def clear(): Unit = js.native
  
  def free(item: T): Unit = js.native
  
  def freeAll(items: ArrayLike2[T]): Unit = js.native
  
  /* private */ var instantiator: Any = js.native
  
  /* private */ var items: Any = js.native
  
  def obtain(): T = js.native
}
