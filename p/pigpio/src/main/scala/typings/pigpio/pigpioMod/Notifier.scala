package typings.pigpio.pigpioMod

import typings.node.NodeJSNs.ReadableStream
import typings.pigpio.Anon_Bits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pigpio", "Notifier")
@js.native
/**
  * Returns a new Notifier object that contains a stream which provides notifications about state changes on any of GPIOs 0 through 31 concurrently.
  * @param options   Used to configure which GPIOs notifications should be provided for.
  */
class Notifier () extends js.Object {
  def this(options: Anon_Bits) = this()
  /**
    * Stops notifications and releases resources.
    */
  def close(): Notifier = js.native
  /**
    * Starts notifications for the GPIOs specified in the bit mask.
    * @param bits  a bit mask indicating the GPIOs of interest, bit0 corresponds to GPIO0, bit1 corresponds to GPIO1, ..., bit31 corresponds to GPIO31.
    * If a bit is set, the corresponding GPIO will be monitored for state changes.
    */
  def start(bits: Double): Notifier = js.native
  /**
    * Stops notifications. Notifications can be restarted with the start method.
    */
  def stop(): Notifier = js.native
  /**
    * Returns the notification stream which is a Readable stream.
    */
  def stream(): ReadableStream = js.native
}

/* static members */
@JSImport("pigpio", "Notifier")
@js.native
object Notifier extends js.Object {
  /**
    * The number of bytes occupied by a notification in the notification stream.
    */
  var NOTIFICATION_LENGTH: Double = js.native
  /**
    * Indicates a keep alive signal on the stream and is sent once a minute in the absence of other notification activity.
    */
  var PI_NTFY_FLAGS_ALIVE: Double = js.native
}

