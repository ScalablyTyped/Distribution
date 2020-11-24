package typings.phaser.Phaser.Input.Gamepad

import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a specific button on a Gamepad.
  * Button objects are created automatically by the Gamepad as they are needed.
  */
@js.native
trait Button extends js.Object {
  
  /**
    * Destroys this Button instance and releases external references it holds.
    */
  def destroy(): Unit = js.native
  
  /**
    * An event emitter to use to emit the button events.
    */
  var events: EventEmitter = js.native
  
  /**
    * The index of this Button.
    */
  var index: integer = js.native
  
  /**
    * A reference to the Gamepad that this Button belongs to.
    */
  var pad: typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
  
  /**
    * Is the Button being pressed down or not?
    */
  var pressed: Boolean = js.native
  
  /**
    * Can be set for analogue buttons to enable a 'pressure' threshold,
    * before a button is considered as being 'pressed'.
    */
  var threshold: Double = js.native
  
  /**
    * Between 0 and 1.
    */
  var value: Double = js.native
}
object Button {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    events: EventEmitter,
    index: integer,
    pad: typings.phaser.Phaser.Input.Gamepad.Gamepad,
    pressed: Boolean,
    threshold: Double,
    value: Double
  ): Button = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEvents(value: EventEmitter): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: integer): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPad(value: typings.phaser.Phaser.Input.Gamepad.Gamepad): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressed(value: Boolean): Self = this.set("pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
