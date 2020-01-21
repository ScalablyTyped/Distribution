package typings.phaser.Phaser.Physics.Matter.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enables a Matter-enabled Game Object to be able to go to sleep. Should be used as a mixin and not directly.
  */
@js.native
trait Sleep extends js.Object {
  /**
    * Wakes this Body if asleep.
    */
  def setAwake(): this.type = js.native
  /**
    * Enables or disables the Sleep End event for this body.
    * @param value `true` to enable the sleep event, or `false` to disable it.
    */
  def setSleepEndEvent(value: Boolean): this.type = js.native
  /**
    * Enable sleep and wake events for this body.
    * 
    * By default when a body goes to sleep, or wakes up, it will not emit any events.
    * 
    * The events are emitted by the Matter World instance and can be listened to via
    * the `SLEEP_START` and `SLEEP_END` events.
    * @param start `true` if you want the sleep start event to be emitted for this body.
    * @param end `true` if you want the sleep end event to be emitted for this body.
    */
  def setSleepEvents(start: Boolean, end: Boolean): this.type = js.native
  /**
    * Enables or disables the Sleep Start event for this body.
    * @param value `true` to enable the sleep event, or `false` to disable it.
    */
  def setSleepStartEvent(value: Boolean): this.type = js.native
  /**
    * Sets the number of updates in which this body must have near-zero velocity before it is set as sleeping (if sleeping is enabled by the engine).
    * @param value A `Number` that defines the number of updates in which this body must have near-zero velocity before it is set as sleeping. Default 60.
    */
  def setSleepThreshold(): this.type = js.native
  def setSleepThreshold(value: Double): this.type = js.native
  /**
    * Sets this Body to sleep.
    */
  def setToSleep(): this.type = js.native
}

