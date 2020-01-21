package typings.pahoMqtt.mod._Global_.Paho.MQTT

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An application message, sent or received.
  */
@JSGlobal("Paho.MQTT.Message")
@js.native
class Message protected () extends js.Object {
  /**
    * @param payload The message data to be sent.
    */
  def this(payload: String) = this()
  def this(payload: TypedArray) = this()
  def this(payload: ArrayBuffer) = this()
  /**
    * The name of the destination to which the message is to be sent
    * (for messages about to be sent) or the name of the destination from which the message has been received.
    * (for messages received by the onMessage function).
    */
  var destinationName: String = js.native
  /**
    * If true, this message might be a duplicate of one which has already been received.
    * This is only set on messages received from the server.
    */
  val duplicate: Boolean = js.native
  /**
    * The payload.
    * @return if payload is a string. Return the original otherwise.
    */
  val payloadBytes: ArrayBuffer | TypedArray = js.native
  /**
    *  The payload as a string if the payload consists of valid UTF-8 characters.
    *  @throw {Error} if the payload is not valid UTF-8
    */
  val payloadString: String = js.native
  /**
    * The Quality of Service used to deliver the message.
    * <dl>
    *     <dt>0 Best effort (default).
    *     <dt>1 At least once.
    *     <dt>2 Exactly once.
    * </dl>
    *
    * @default 0
    */
  var qos: Qos = js.native
  /**
    * If true, the message is to be retained by the server and delivered to both current and future
    * subscriptions. If false the server only delivers the message to current subscribers, this is the default
    * for new Messages. A received message has the retained boolean set to true if the message was published
    * with the retained boolean set to true and the subscription was made after the message has been published.
    *
    * @default false
    */
  var retained: Boolean = js.native
}

