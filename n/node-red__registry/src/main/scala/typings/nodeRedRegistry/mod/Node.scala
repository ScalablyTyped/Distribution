package typings.nodeRedRegistry.mod

import typings.node.eventsMod.EventEmitter
import typings.nodeRedRegistry.nodeRedRegistryStrings.close
import typings.nodeRedRegistry.nodeRedRegistryStrings.input
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node[TCreds /* <: js.Object */] extends EventEmitter {
  
  /**
    * Called when the node is being stopped
    * @param  removed Whether the node has been removed, or just being stopped
    * @returns Promises which resolves when the node has closed
    */
  def close(removed: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Get the context object for this node.
    * @returnsthe context object
    */
  def context(): NodeContext = js.native
  
  var credentials: TCreds = js.native
  
  /**
    * Log an DEBUG level message
    */
  def debug(msg: js.Any): Unit = js.native
  
  /**
    * Log an ERROR level message
    */
  def error(logMessage: js.Any): Unit = js.native
  def error(logMessage: js.Any, msg: NodeMessage): Unit = js.native
  
  var id: String = js.native
  
  /**
    * Log an INFO level message
    */
  def log(msg: js.Any): Unit = js.native
  
  /**
    * Log a metric event.
    * If called with no args, returns whether metric collection is enabled
    */
  def metric(): Boolean = js.native
  def metric(eventname: String, msg: NodeMessage, metricValue: Double): Unit = js.native
  
  var name: js.UndefOr[String] = js.native
  
  /**
    * Whenever a new flow is deployed, the existing nodes are deleted. If any of them
    * need to tidy up state when this happens, such as disconnecting from a remote
    * system, they should register a listener on the close event.
    * More info: https://nodered.org/docs/creating-nodes/node-js#closing-the-node
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  /**
    * If the node needs to do any asynchronous work to complete the tidy up, the
    * registered listener should accept an argument which is a function to be called
    * when all the work is complete.
    * More info: https://nodered.org/docs/creating-nodes/node-js#closing-the-node
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function1[/* done */ js.Function0[Unit], Unit]): this.type = js.native
  // tslint:disable-line:unified-signatures
  /**
    * If the registered listener accepts two arguments, the first will be a boolean
    * flag that indicates whether the node is being closed because it has been removed
    * entirely, or that it is just being restarted.
    * More info: https://nodered.org/docs/creating-nodes/node-js#closing-the-node
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function2[/* removed */ Boolean, /* done */ js.Function0[Unit], Unit]): this.type = js.native
  /**
    * Nodes register a listener on the input event to receive messages from the
    * up-stream nodes in a flow.
    * More info: https://nodered.org/docs/creating-nodes/node-js#receiving-messages
    */
  @JSName("on")
  def on_input(
    event: input,
    listener: js.Function3[
      /* msg */ NodeMessageInFlow, 
      /* send */ js.Function1[/* msg */ NodeMessage | (js.Array[NodeMessage | Null]), Unit], 
      /* done */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Receive a message.
    *
    * This will emit the `input` event with the provided message.
    * As of 1.0, this will return *before* any 'input' callback handler is invoked.
    */
  def receive(): Unit = js.native
  def receive(msg: NodeMessage): Unit = js.native
  
  /**
    * Send a message to the nodes wired.
    * @param msg A message or array of messages to send
    */
  def send(): Unit = js.native
  def send(msg: js.Array[NodeMessage]): Unit = js.native
  def send(msg: NodeMessage): Unit = js.native
  
  /**
    * Set the node's status object
    *
    * status: { fill:"red|green", shape:"dot|ring", text:"blah" }
    * or
    * status: "simple text status"
    */
  def status(status: String): Unit = js.native
  def status(status: NodeStatus): Unit = js.native
  
  /**
    * Log an TRACE level message
    */
  def trace(msg: js.Any): Unit = js.native
  
  var `type`: String = js.native
  
  /**
    * Update the wiring configuration for this node.
    * @param wires -the new wiring configuration
    */
  def updateWires(wires: js.Array[js.Array[js.Any]]): Unit = js.native
  
  /**
    * Log a WARN level message
    */
  def warn(msg: js.Any): Unit = js.native
  
  var z: String = js.native
}
