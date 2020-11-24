package typings.nats.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends EventEmitter {
  
  /**
  	 * Close the connection to the server.
  	 */
  def close(): Unit = js.native
  
  /**
  	 * Create a properly formatted inbox subject.
  	 */
  def createInbox(): String = js.native
  
  /**
  	 * Drains all subscriptions. If an opt_callback is provided, the callback
  	 * is called if there's an error with an error argument.
  	 *
  	 * Note that after calling drain, it is impossible to create new subscriptions
  	 * or any requests. As soon as all messages for the draining subscriptions are
  	 * processed, it is also impossible to publish new messages.
  	 *
  	 * A drained connection is closed when the opt_callback is called without arguments.
  	 * @param callback
  	 */
  def drain(): Unit = js.native
  def drain(callback: js.Function): Unit = js.native
  
  /**
  	 * Draining a subscription is similar to unsubscribe but inbound pending messages are
  	 * not discarded. When the last in-flight message is processed, the subscription handler
  	 * is removed.
  	 * @param sid
  	 * @param callback
  	 */
  def drainSubscription(sid: Double): Unit = js.native
  def drainSubscription(sid: Double, callback: js.Function): Unit = js.native
  
  /**
  	 * Flush outbound queue to server and call optional callback when server has processed
  	 * all data.
  	 */
  def flush(): Unit = js.native
  def flush(callback: js.Function): Unit = js.native
  
  /**
  	 * Report number of outstanding subscriptions on this connection.
  	 */
  def numSubscriptions(): Double = js.native
  
  /**
  	 * Publish a message to the given subject, with optional reply and callback.
  	 */
  def publish(subject: String): Unit = js.native
  def publish(subject: String, callback: js.Function): Unit = js.native
  def publish(subject: String, msg: js.Any): Unit = js.native
  def publish(subject: String, msg: js.Any, callback: js.Function): Unit = js.native
  def publish(subject: String, msg: js.Any, reply: String): Unit = js.native
  def publish(subject: String, msg: js.Any, reply: String, callback: js.Function): Unit = js.native
  
  /**
  	 * Publish a message with an implicit inbox listener as the reply. Message is optional.
  	 * This should be treated as a subscription. You can optionally indicate how many
  	 * messages you only want to receive and how long to wait for the messages using
  	 * opt_options = {max:N, timeout:N}. Otherwise you will need to unsubscribe to stop
  	 * the message stream manually by calling unsubscribe() on the subscription id returned.
  	 */
  def request(subject: String, callback: js.Function): Double = js.native
  def request(subject: String, msg: js.Any, callback: js.Function): Double = js.native
  def request(subject: String, msg: js.Any, options: RequestOptions, callback: js.Function): Double = js.native
  
  def requestOne(subject: String, msg: js.Any, options: RequestOptions, timeout: Double, callback: js.Function): Double = js.native
  def requestOne(subject: String, msg: js.Any, timeout: Double, callback: js.Function): Double = js.native
  /**
  	 * Publish a message with an implicit inbox listener as the reply. Message is optional.
  	 * This should be treated as a subscription. Request one, will terminate the subscription
  	 * after the first response is received or the timeout is reached.
  	 * The callback can be called with either a message payload or a NatsError to indicate
  	 * a timeout has been reached.
  	 * The subscription id is returned.
  	 */
  def requestOne(subject: String, timeout: Double, callback: js.Function): Double = js.native
  
  /**
  	 * Subscribe to a given subject, with optional options and callback. opts can be
  	 * omitted, even with a callback. A subscription id is returned.
  	 */
  def subscribe(subject: String, callback: js.Function): Double = js.native
  def subscribe(subject: String, opts: SubscribeOptions, callback: js.Function): Double = js.native
  
  /**
  	 * Set a timeout on a subscription.
  	 */
  def timeout(sid: Double, timeout: Double, expected: Double, callback: js.Function1[/* sid */ Double, Unit]): Unit = js.native
  
  /**
  	 * Unsubscribe to a given subscription id, with optional max number of messages before unsubscribing.
  	 */
  def unsubscribe(sid: Double): Unit = js.native
  def unsubscribe(sid: Double, max: Double): Unit = js.native
}
