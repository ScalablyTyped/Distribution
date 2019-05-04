package typings
package atPhosphorSignalingLib.atPhosphorSignalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISignal[T, U] extends js.Object {
  /**
    * Connect a slot to the signal.
    *
    * @param slot - The slot to invoke when the signal is emitted.
    *
    * @param thisArg - The `this` context for the slot. If provided,
    *   this must be a non-primitive object.
    *
    * @returns `true` if the connection succeeds, `false` otherwise.
    *
    * #### Notes
    * Slots are invoked in the order in which they are connected.
    *
    * Signal connections are unique. If a connection already exists for
    * the given `slot` and `thisArg`, this method returns `false`.
    *
    * A newly connected slot will not be invoked until the next time the
    * signal is emitted, even if the slot is connected while the signal
    * is dispatching.
    */
  def connect(slot: Slot[T, U]): scala.Boolean = js.native
  def connect(slot: Slot[T, U], thisArg: js.Any): scala.Boolean = js.native
  /**
    * Disconnect a slot from the signal.
    *
    * @param slot - The slot to disconnect from the signal.
    *
    * @param thisArg - The `this` context for the slot. If provided,
    *   this must be a non-primitive object.
    *
    * @returns `true` if the connection is removed, `false` otherwise.
    *
    * #### Notes
    * If no connection exists for the given `slot` and `thisArg`, this
    * method returns `false`.
    *
    * A disconnected slot will no longer be invoked, even if the slot
    * is disconnected while the signal is dispatching.
    */
  def disconnect(slot: Slot[T, U]): scala.Boolean = js.native
  def disconnect(slot: Slot[T, U], thisArg: js.Any): scala.Boolean = js.native
}

