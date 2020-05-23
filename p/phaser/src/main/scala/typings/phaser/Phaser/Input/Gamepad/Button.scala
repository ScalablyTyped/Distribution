package typings.phaser.Phaser.Input.Gamepad

import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a specific button on a Gamepad.
  * Button objects are created automatically by the Gamepad as they are needed.
  */
trait Button extends js.Object {
  /**
    * An event emitter to use to emit the button events.
    */
  var events: EventEmitter
  /**
    * The index of this Button.
    */
  var index: integer
  /**
    * A reference to the Gamepad that this Button belongs to.
    */
  var pad: typings.phaser.Phaser.Input.Gamepad.Gamepad
  /**
    * Is the Button being pressed down or not?
    */
  var pressed: Boolean
  /**
    * Can be set for analogue buttons to enable a 'pressure' threshold,
    * before a button is considered as being 'pressed'.
    */
  var threshold: Double
  /**
    * Between 0 and 1.
    */
  var value: Double
  /**
    * Destroys this Button instance and releases external references it holds.
    */
  def destroy(): Unit
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
}

