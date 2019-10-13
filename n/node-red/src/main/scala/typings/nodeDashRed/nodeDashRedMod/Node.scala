package typings.nodeDashRed.nodeDashRedMod

import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node
  extends EventEmitter
     with NodeProperties {
  def close(removed: js.Any): Unit = js.native
  def context(): js.Any = js.native
  /**
    * Log a debug-level event. Use this is for logging
    * internal detail not needed for normal operation.
    * @param msg - message to log.
    */
  def debug(msg: js.Any): Unit = js.native
  /**
    * Log an error-level event. To trigger catch nodes on
    * the workflow call the function with msg set to the
    * original message.
    * @param logMessage - description of the error.
    * @param msg - optional payload that caused the error.
    */
  def error(logMessage: js.Any): Unit = js.native
  def error(logMessage: js.Any, msg: js.Any): Unit = js.native
  /**
    * Log an log-level event. Used for mundane events
    * that are part of the normal functioning of the
    * node.
    * @param msg - message to log.
    */
  def log(msg: js.Any): Unit = js.native
  def metric(): Unit = js.native
  def metric(eventname: js.Any): Unit = js.native
  def metric(eventname: js.Any, msg: js.Any): Unit = js.native
  def metric(eventname: js.Any, msg: js.Any, metricValue: js.Any): Unit = js.native
  /**
    * Send a message to this node.
    * @param msg - optional message to send.
    */
  def receive(msg: js.Any): Unit = js.native
  /**
    * Send a message to the downstream node. If msg is null or
    * undefined, no message is sent.
    * @param msg - optional message to send.
    */
  def send(): Unit = js.native
  def send(msg: js.Any): Unit = js.native
  /**
    * Send one or more messages to multiple downstream nodes.
    * It is possible to send multiple messages to any
    * one node by sending an array to the node instead
    * of a single message.
    * @param msg - array of messages and/or message bundle arrays.
    */
  def send(msg: js.Array[_]): Unit = js.native
  def status(status: ClearNodeStatus): Unit = js.native
  /**
    * Set or clear node status.
    *
    * For more info see: https://nodered.org/docs/creating-nodes/status
    * @param status - the status to set or an empty object to clear the
    *  node status.
    */
  def status(status: NodeStatus): Unit = js.native
  /**
    * Log a trace-level event. Even more internal details than
    * debug-level.
    * @param msg - message to log.
    */
  def trace(msg: js.Any): Unit = js.native
  def updateWires(wires: js.Any): Unit = js.native
  /**
    * Log a warn-level event. For important events
    * that the user should be made aware of.
    * @param msg - message to log.
    */
  def warn(msg: js.Any): Unit = js.native
}

