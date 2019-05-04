package typings
package atPhosphorMessagingLib.atPhosphorMessagingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/messaging", "Message")
@js.native
class Message protected () extends js.Object {
  /**
    * Construct a new message.
    *
    * @param type - The type of the message.
    */
  def this(`type`: java.lang.String) = this()
  /**
    * Test whether the message is conflatable.
    *
    * #### Notes
    * Message conflation is an advanced topic. Most message types will
    * not make use of this feature.
    *
    * If a conflatable message is posted to a handler while another
    * conflatable message of the same `type` has already been posted
    * to the handler, the `conflate()` method of the existing message
    * will be invoked. If that method returns `true`, the new message
    * will not be enqueued. This allows messages to be compressed, so
    * that only a single instance of the message type is processed per
    * cycle, no matter how many times messages of that type are posted.
    *
    * Custom message types may reimplement this property.
    *
    * The default implementation is always `false`.
    */
  val isConflatable: scala.Boolean = js.native
  /**
    * The type of the message.
    *
    * #### Notes
    * The `type` of a message should be related directly to its actual
    * runtime type. This means that `type` can and will be used to cast
    * the message to the relevant derived `Message` subtype.
    */
  val `type`: java.lang.String = js.native
  /**
    * Conflate this message with another message of the same `type`.
    *
    * @param other - A conflatable message of the same `type`.
    *
    * @returns `true` if the message was successfully conflated, or
    *   `false` otherwise.
    *
    * #### Notes
    * Message conflation is an advanced topic. Most message types will
    * not make use of this feature.
    *
    * This method is called automatically by the message loop when the
    * given message is posted to the handler paired with this message.
    * This message will already be enqueued and conflatable, and the
    * given message will have the same `type` and also be conflatable.
    *
    * This method should merge the state of the other message into this
    * message as needed so that when this message is finally delivered
    * to the handler, it receives the most up-to-date information.
    *
    * If this method returns `true`, it signals that the other message
    * was successfully conflated and that message will not be enqueued.
    *
    * If this method returns `false`, the other message will be enqueued
    * for normal delivery.
    *
    * Custom message types may reimplement this method.
    *
    * The default implementation always returns `false`.
    */
  def conflate(other: Message): scala.Boolean = js.native
}

