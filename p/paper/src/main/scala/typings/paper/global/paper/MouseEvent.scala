package typings.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The MouseEvent object is received by the {@link Item}'s mouse event
  * handlers {@link Item#onMouseDown}, {@link Item#onMouseDrag},
  * {@link Item#onMouseMove}, {@link Item#onMouseUp}, {@link Item#onClick},
  * {@link Item#onDoubleClick}, {@link Item#onMouseEnter} and
  * {@link Item#onMouseLeave}. The MouseEvent object is the only parameter passed
  * to these functions and contains information about the mouse event.
  */
@JSGlobal("paper.MouseEvent")
@js.native
open class MouseEvent ()
  extends StObject
     with typings.paper.paper.MouseEvent {
  
  /** 
    * The current target for the event, as the event traverses the scene graph.
    * It always refers to the element the event handler has been attached to as
    * opposed to {@link #target} which identifies the element on
    * which the event occurred.
    */
  /* CompleteClass */
  var currentTarget: typings.paper.paper.Item = js.native
  
  /* CompleteClass */
  var delta: typings.paper.paper.Point = js.native
  
  /** 
    * The current state of the keyboard modifiers.
    * 
    * @see Key.modifiers
    */
  /* CompleteClass */
  override val modifiers: Any = js.native
  
  /** 
    * The position of the mouse in project coordinates when the event was
    * fired.
    */
  /* CompleteClass */
  var point: typings.paper.paper.Point = js.native
  
  /** 
    * Cancels the event if it is cancelable, without stopping further
    * propagation of the event.
    */
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  
  /** 
    * Cancels the event if it is cancelable, and stops stopping further
    * propagation of the event. This is has the same effect as calling both
    * {@link #stopPropagation} and {@link #preventDefault}.
    * 
    * Any handler can also return `false` to indicate that `stop()` should be
    * called right after.
    */
  /* CompleteClass */
  override def stop(): Unit = js.native
  
  /** 
    * Prevents further propagation of the current event.
    */
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
  
  /** 
    * The item that dispatched the event. It is different from
    * {@link #currentTarget} when the event handler is called during
    * the bubbling phase of the event.
    */
  /* CompleteClass */
  var target: typings.paper.paper.Item = js.native
  
  /** 
    * The time at which the event was created, in milliseconds since the epoch.
    */
  /* CompleteClass */
  override val timeStamp: Double = js.native
  
  /** 
    * The type of mouse event.
    */
  /* CompleteClass */
  var `type`: String = js.native
}
