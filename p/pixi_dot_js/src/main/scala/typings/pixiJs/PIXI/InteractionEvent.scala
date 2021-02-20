package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event class that mimics native DOM events.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait InteractionEvent extends StObject {
  
  /**
    * The object whose event listener’s callback is currently being invoked.
    *
    * @member {PIXI.DisplayObject} PIXI.InteractionEvent#currentTarget
    */
  var currentTarget: DisplayObject = js.native
  
  /**
    * InteractionData related to this event
    *
    * @member {PIXI.InteractionData} PIXI.InteractionEvent#data
    */
  var data: InteractionData = js.native
  
  /**
    * Resets the event.
    */
  def reset(): Unit = js.native
  
  /**
    * Prevents event from reaching any objects other than the current object.
    *
    */
  def stopPropagation(): Unit = js.native
  
  /**
    * Whether this event will continue propagating in the tree.
    *
    * Remaining events for the {@link stopsPropagatingAt} object
    * will still be dispatched.
    *
    * @member {boolean} PIXI.InteractionEvent#stopped
    */
  var stopped: Boolean = js.native
  
  /**
    * The object which caused this event to be dispatched.
    * For listener callback see {@link PIXI.InteractionEvent.currentTarget}.
    *
    * @member {PIXI.DisplayObject} PIXI.InteractionEvent#target
    */
  var target: DisplayObject = js.native
  
  /**
    * Type of the event
    *
    * @member {string} PIXI.InteractionEvent#type
    */
  var `type`: String = js.native
}
object InteractionEvent {
  
  @scala.inline
  def apply(
    currentTarget: DisplayObject,
    data: InteractionData,
    reset: () => Unit,
    stopPropagation: () => Unit,
    stopped: Boolean,
    target: DisplayObject,
    `type`: String
  ): InteractionEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), stopPropagation = js.Any.fromFunction0(stopPropagation), stopped = stopped.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionEvent]
  }
  
  @scala.inline
  implicit class InteractionEventMutableBuilder[Self <: InteractionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTarget(value: DisplayObject): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: InteractionData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: DisplayObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
