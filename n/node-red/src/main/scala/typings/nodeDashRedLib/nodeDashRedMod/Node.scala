package typings
package nodeDashRedLib.nodeDashRedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node
  extends nodeLib.eventsMod.^
     with NodeProperties {
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def close(removed: js.Any): scala.Unit = js.native
  def context(): js.Any = js.native
  /**
    * Log a debug-level event. Use this is for logging
    * internal detail not needed for normal operation.
    * @param msg - message to log.
    */
  def debug(msg: js.Any): scala.Unit = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  /**
    * Log an error-level event. To trigger catch nodes on
    * the workflow call the function with msg set to the
    * original message.
    * @param logMessage - description of the error.
    * @param msg - optional payload that caused the error.
    */
  def error(logMessage: js.Any): scala.Unit = js.native
  def error(logMessage: js.Any, msg: js.Any): scala.Unit = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /**
    * Log an log-level event. Used for mundane events
    * that are part of the normal functioning of the
    * node.
    * @param msg - message to log.
    */
  def log(msg: js.Any): scala.Unit = js.native
  def metric(): scala.Unit = js.native
  def metric(eventname: js.Any): scala.Unit = js.native
  def metric(eventname: js.Any, msg: js.Any): scala.Unit = js.native
  def metric(eventname: js.Any, msg: js.Any, metricValue: js.Any): scala.Unit = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /**
    * Send a message to this node.
    * @param msg - optional message to send.
    */
  def receive(msg: js.Any): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /**
    * Send a message to the downstream node. If msg is null or
    * undefined, no message is sent.
    * @param msg - optional message to send.
    */
  def send(): scala.Unit = js.native
  def send(msg: js.Any): scala.Unit = js.native
  /**
    * Send one or more messages to multiple downstream nodes.
    * It is possible to send multiple messages to any
    * one node by sending an array to the node instead
    * of a single message.
    * @param msg - array of messages and/or message bundle arrays.
    */
  def send(msg: js.Array[_]): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  def status(status: ClearNodeStatus): scala.Unit = js.native
  /**
    * Set or clear node status.
    *
    * For more info see: https://nodered.org/docs/creating-nodes/status
    * @param status - the status to set or an empty object to clear the
    *  node status.
    */
  def status(status: NodeStatus): scala.Unit = js.native
  /**
    * Log a trace-level event. Even more internal details than
    * debug-level.
    * @param msg - message to log.
    */
  def trace(msg: js.Any): scala.Unit = js.native
  def updateWires(wires: js.Any): scala.Unit = js.native
  /**
    * Log a warn-level event. For important events
    * that the user should be made aware of.
    * @param msg - message to log.
    */
  def warn(msg: js.Any): scala.Unit = js.native
}

