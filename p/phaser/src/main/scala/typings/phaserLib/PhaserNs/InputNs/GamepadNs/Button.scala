package typings
package phaserLib.PhaserNs.InputNs.GamepadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a specific button on a Gamepad.
  * Button objects are created automatically by the Gamepad as they are needed.
  */
@JSGlobal("Phaser.Input.Gamepad.Button")
@js.native
class Button protected () extends js.Object {
  /**
    * 
    * @param pad A reference to the Gamepad that this Button belongs to.
    * @param index The index of this Button.
    */
  def this(pad: Gamepad, index: phaserLib.integer) = this()
  /**
    * An event emitter to use to emit the button events.
    */
  var events: phaserLib.PhaserNs.EventsNs.EventEmitter = js.native
  /**
    * The index of this Button.
    */
  var index: phaserLib.integer = js.native
  /**
    * A reference to the Gamepad that this Button belongs to.
    */
  var pad: Gamepad = js.native
  /**
    * Is the Button being pressed down or not?
    */
  var pressed: scala.Boolean = js.native
  /**
    * Can be set for analogue buttons to enable a 'pressure' threshold,
    * before a button is considered as being 'pressed'.
    */
  var threshold: scala.Double = js.native
  /**
    * Between 0 and 1.
    */
  var value: scala.Double = js.native
  /**
    * Destroys this Button instance and releases external references it holds.
    */
  def destroy(): scala.Unit = js.native
}

