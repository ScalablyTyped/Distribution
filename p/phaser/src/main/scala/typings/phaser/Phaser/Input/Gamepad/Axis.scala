package typings.phaser.Phaser.Input.Gamepad

import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a specific Gamepad Axis.
  * Axis objects are created automatically by the Gamepad as they are needed.
  */
trait Axis extends js.Object {
  /**
    * An event emitter to use to emit the axis events.
    */
  var events: EventEmitter
  /**
    * The index of this Axis.
    */
  var index: integer
  /**
    * A reference to the Gamepad that this Axis belongs to.
    */
  var pad: typings.phaser.Phaser.Input.Gamepad.Gamepad
  /**
    * Movement tolerance threshold below which axis values are ignored in `getValue`.
    */
  var threshold: Double
  /**
    * The raw axis value, between -1 and 1 with 0 being dead center.
    * Use the method `getValue` to get a normalized value with the threshold applied.
    */
  var value: Double
  /**
    * Destroys this Axis instance and releases external references it holds.
    */
  def destroy(): Unit
  /**
    * Applies the `threshold` value to the axis and returns it.
    */
  def getValue(): Double
}

object Axis {
  @scala.inline
  def apply(
    destroy: () => Unit,
    events: EventEmitter,
    getValue: () => Double,
    index: integer,
    pad: typings.phaser.Phaser.Input.Gamepad.Gamepad,
    threshold: Double,
    value: Double
  ): Axis = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], getValue = js.Any.fromFunction0(getValue), index = index.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
}

