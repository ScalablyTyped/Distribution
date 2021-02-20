package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new PostEffectQueue.
  * @param app - The application.
  * @param camera - The camera component.
  */
@js.native
trait PostEffectQueue extends StObject {
  
  /**
    * Adds a post effect to the queue. If the queue is disabled adding a post effect will
    * automatically enable the queue.
    * @param effect - The post effect to add to the queue.
    */
  def addEffect(effect: PostEffect): Unit = js.native
  
  /**
    * Removes all the effects from the queue and disables it.
    */
  def destroy(): Unit = js.native
  
  /**
    * Disables the queue and all of its effects.
    */
  def disable(): Unit = js.native
  
  /**
    * Enables the queue and all of its effects. If there are no effects then the queue will not be enabled.
    */
  def enable(): Unit = js.native
  
  /**
    * Removes a post effect from the queue. If the queue becomes empty it will be disabled automatically.
    * @param effect - The post effect to remove.
    */
  def removeEffect(effect: PostEffect): Unit = js.native
}
object PostEffectQueue {
  
  @scala.inline
  def apply(
    addEffect: PostEffect => Unit,
    destroy: () => Unit,
    disable: () => Unit,
    enable: () => Unit,
    removeEffect: PostEffect => Unit
  ): PostEffectQueue = {
    val __obj = js.Dynamic.literal(addEffect = js.Any.fromFunction1(addEffect), destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), removeEffect = js.Any.fromFunction1(removeEffect))
    __obj.asInstanceOf[PostEffectQueue]
  }
  
  @scala.inline
  implicit class PostEffectQueueMutableBuilder[Self <: PostEffectQueue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEffect(value: PostEffect => Unit): Self = StObject.set(x, "addEffect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveEffect(value: PostEffect => Unit): Self = StObject.set(x, "removeEffect", js.Any.fromFunction1(value))
  }
}
