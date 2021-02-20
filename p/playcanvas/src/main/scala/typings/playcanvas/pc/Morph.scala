package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a list of pc.MorphTarget, a combined delta AABB and some associated data.
  * @param targets - A list of morph targets.
  * @param graphicsDevice - The graphics device used to manage this morph target. If it is not provided, a device is obtained
  * from the {@link pc.Application}.
  */
@js.native
trait Morph extends StObject {
  
  /**
    * Frees video memory allocated by this object.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets the morph target by index.
    * @param index - An index of morph target.
    * @returns A morph target object.
    */
  def getTarget(index: Double): MorphTarget = js.native
}
object Morph {
  
  @scala.inline
  def apply(destroy: () => Unit, getTarget: Double => MorphTarget): Morph = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getTarget = js.Any.fromFunction1(getTarget))
    __obj.asInstanceOf[Morph]
  }
  
  @scala.inline
  implicit class MorphMutableBuilder[Self <: Morph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTarget(value: Double => MorphTarget): Self = StObject.set(x, "getTarget", js.Any.fromFunction1(value))
  }
}
