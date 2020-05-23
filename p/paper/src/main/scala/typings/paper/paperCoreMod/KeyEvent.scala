package typings.paper.paperCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper/dist/paper-core", "KeyEvent")
@js.native
class KeyEvent ()
  extends typings.paper.paper.KeyEvent {
  /** 
    * The character representation of the key that caused this key event,
    * taking into account the current key-modifiers (e.g. shift, control,
    * caps-lock, etc.)
    */
  /* CompleteClass */
  override var character: String = js.native
  /** 
    * The key that caused this key event, either as a lower-case character or
    * special key descriptor.
    */
  /* CompleteClass */
  override var key: String = js.native
  /** 
    * The current state of the keyboard modifiers.
    * 
    * @see Key.modifiers
    */
  /* CompleteClass */
  override val modifiers: js.Any = js.native
  /** 
    * The time at which the event was created, in milliseconds since the epoch.
    */
  /* CompleteClass */
  override val timeStamp: Double = js.native
  /** 
    * The type of mouse event.
    */
  /* CompleteClass */
  override var `type`: String = js.native
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
}

