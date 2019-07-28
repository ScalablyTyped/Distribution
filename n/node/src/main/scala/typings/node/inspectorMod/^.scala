package typings.node.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inspector", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Deactivate the inspector. Blocks until there are no active connections.
    */
  def close(): Unit = js.native
  // Top Level API
  /**
    * Activate inspector on host and port. Equivalent to node --inspect=[[host:]port], but can be done programatically after node has started.
    * If wait is true, will block until a client has connected to the inspect port and flow control has been passed to the debugger client.
    * @param port Port to listen on for inspector connections. Optional, defaults to what was specified on the CLI.
    * @param host Host to listen on for inspector connections. Optional, defaults to what was specified on the CLI.
    * @param wait Block until a client has connected. Optional, defaults to false.
    */
  def open(): Unit = js.native
  def open(port: Double): Unit = js.native
  def open(port: Double, host: java.lang.String): Unit = js.native
  def open(port: Double, host: java.lang.String, wait: Boolean): Unit = js.native
  /**
    * Return the URL of the active inspector, or `undefined` if there is none.
    */
  def url(): js.UndefOr[java.lang.String] = js.native
}

