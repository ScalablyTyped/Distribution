package typings.node.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inspector", "open")
@js.native
object open extends js.Object {
  // Top Level API
  /**
    * Activate inspector on host and port. Equivalent to node --inspect=[[host:]port], but can be done programatically after node has started.
    * If wait is true, will block until a client has connected to the inspect port and flow control has been passed to the debugger client.
    * @param port Port to listen on for inspector connections. Optional, defaults to what was specified on the CLI.
    * @param host Host to listen on for inspector connections. Optional, defaults to what was specified on the CLI.
    * @param wait Block until a client has connected. Optional, defaults to false.
    */
  def apply(): Unit = js.native
  def apply(port: Double): Unit = js.native
  def apply(port: Double, host: String): Unit = js.native
  def apply(port: Double, host: String, wait: Boolean): Unit = js.native
}

