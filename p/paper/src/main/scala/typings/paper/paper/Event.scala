package typings.paper.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The Event object is the base class for any of the other event types,
  * such as {@link MouseEvent}, {@link ToolEvent} and {@link KeyEvent}.
  */
@js.native
trait Event extends StObject {
  
  /** 
    * The current state of the keyboard modifiers.
    * 
    * @see Key.modifiers
    */
  val modifiers: js.Any = js.native
  
  /** 
    * Cancels the event if it is cancelable, without stopping further
    * propagation of the event.
    */
  def preventDefault(): Unit = js.native
  
  /** 
    * Cancels the event if it is cancelable, and stops stopping further
    * propagation of the event. This is has the same effect as calling both
    * {@link #stopPropagation} and {@link #preventDefault}.
    * 
    * Any handler can also return `false` to indicate that `stop()` should be
    * called right after.
    */
  def stop(): Unit = js.native
  
  /** 
    * Prevents further propagation of the current event.
    */
  def stopPropagation(): Unit = js.native
  
  /** 
    * The time at which the event was created, in milliseconds since the epoch.
    */
  val timeStamp: Double = js.native
}
object Event {
  
  @scala.inline
  def apply(
    modifiers: js.Any,
    preventDefault: () => Unit,
    stop: () => Unit,
    stopPropagation: () => Unit,
    timeStamp: Double
  ): Event = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stop = js.Any.fromFunction0(stop), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifiers(value: js.Any): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
