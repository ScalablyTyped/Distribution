package typings
package atPhosphorSignalingLib.atPhosphorSignalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/signaling", "Signal")
@js.native
object SignalNs extends js.Object {
  /**
    * Clear all signal data associated with the given object.
    *
    * @param object - The object for which the data should be cleared.
    *
    * #### Notes
    * This removes all signal connections and any other signal data
    * associated with the object.
    */
  def clearData(`object`: js.Any): scala.Unit = js.native
  /**
    * Remove all connections where an object is the sender or receiver.
    *
    * @param object - The object of interest.
    *
    * #### Notes
    * If a `thisArg` is provided when connecting a signal, that object
    * is considered the receiver. Otherwise, the `slot` is considered
    * the receiver.
    */
  def disconnectAll(`object`: js.Any): scala.Unit = js.native
  /**
    * Remove all connections between a sender and receiver.
    *
    * @param sender - The sender object of interest.
    *
    * @param receiver - The receiver object of interest.
    *
    * #### Notes
    * If a `thisArg` is provided when connecting a signal, that object
    * is considered the receiver. Otherwise, the `slot` is considered
    * the receiver.
    */
  def disconnectBetween(sender: js.Any, receiver: js.Any): scala.Unit = js.native
  /**
    * Remove all connections where the given object is the receiver.
    *
    * @param receiver - The receiver object of interest.
    *
    * #### Notes
    * If a `thisArg` is provided when connecting a signal, that object
    * is considered the receiver. Otherwise, the `slot` is considered
    * the receiver.
    */
  def disconnectReceiver(receiver: js.Any): scala.Unit = js.native
  /**
    * Remove all connections where the given object is the sender.
    *
    * @param sender - The sender object of interest.
    */
  def disconnectSender(sender: js.Any): scala.Unit = js.native
  /**
    * Get the signal exception handler.
    *
    * @returns The current exception handler.
    *
    * #### Notes
    * The default exception handler is `console.error`.
    */
  def getExceptionHandler(): ExceptionHandler = js.native
  /**
    * Set the signal exception handler.
    *
    * @param handler - The function to use as the exception handler.
    *
    * @returns The old exception handler.
    *
    * #### Notes
    * The exception handler is invoked when a slot throws an exception.
    */
  def setExceptionHandler(handler: ExceptionHandler): ExceptionHandler = js.native
  /**
    * A type alias for the exception handler function.
    */
  type ExceptionHandler = js.Function1[/* err */ stdLib.Error, scala.Unit]
}

