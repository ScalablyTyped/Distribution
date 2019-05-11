package typings
package phaserLib.PhaserNs.InputNs.GamepadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a specific Gamepad Axis.
  * Axis objects are created automatically by the Gamepad as they are needed.
  */
@JSGlobal("Phaser.Input.Gamepad.Axis")
@js.native
class Axis protected () extends js.Object {
  /**
    * 
    * @param pad A reference to the Gamepad that this Axis belongs to.
    * @param index The index of this Axis.
    */
  def this(pad: Gamepad, index: phaserLib.integer) = this()
  /**
    * An event emitter to use to emit the axis events.
    */
  var events: phaserLib.PhaserNs.EventsNs.EventEmitter = js.native
  /**
    * The index of this Axis.
    */
  var index: phaserLib.integer = js.native
  /**
    * A reference to the Gamepad that this Axis belongs to.
    */
  var pad: Gamepad = js.native
  /**
    * Movement tolerance threshold below which axis values are ignored in `getValue`.
    */
  var threshold: scala.Double = js.native
  /**
    * The raw axis value, between -1 and 1 with 0 being dead center.
    * Use the method `getValue` to get a normalized value with the threshold applied.
    */
  var value: scala.Double = js.native
  /**
    * Destroys this Axis instance and releases external references it holds.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Applies the `threshold` value to the axis and returns it.
    */
  def getValue(): scala.Double = js.native
}

