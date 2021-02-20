package typings.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object inspectorMod {
  
  /**
    * Deactivate the inspector. Blocks until there are no active connections.
    */
  @scala.inline
  def close(): scala.Unit = typings.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[scala.Unit]
  
  // Top Level API
  /**
    * Activate inspector on host and port. Equivalent to node --inspect=[[host:]port], but can be done programatically after node has started.
    * If wait is true, will block until a client has connected to the inspect port and flow control has been passed to the debugger client.
    * @param port Port to listen on for inspector connections. Optional, defaults to what was specified on the CLI.
    * @param host Host to listen on for inspector connections. Optional, defaults to what was specified on the CLI.
    * @param wait Block until a client has connected. Optional, defaults to false.
    */
  @scala.inline
  def open(): scala.Unit = typings.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[scala.Unit]
  @scala.inline
  def open(port: js.UndefOr[scala.Nothing], host: js.UndefOr[scala.Nothing], wait: scala.Boolean): scala.Unit = (typings.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(port: js.UndefOr[scala.Nothing], host: java.lang.String): scala.Unit = (typings.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(port: js.UndefOr[scala.Nothing], host: java.lang.String, wait: scala.Boolean): scala.Unit = (typings.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(port: scala.Double): scala.Unit = typings.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def open(port: scala.Double, host: js.UndefOr[scala.Nothing], wait: scala.Boolean): scala.Unit = (typings.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(port: scala.Double, host: java.lang.String): scala.Unit = (typings.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(port: scala.Double, host: java.lang.String, wait: scala.Boolean): scala.Unit = (typings.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * Return the URL of the active inspector, or `undefined` if there is none.
    */
  @scala.inline
  def url(): js.UndefOr[java.lang.String] = typings.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("url")().asInstanceOf[js.UndefOr[java.lang.String]]
  
  /**
    * Blocks until a client (existing or connected later) has sent
    * `Runtime.runIfWaitingForDebugger` command.
    * An exception will be thrown if there is no active inspector.
    */
  @scala.inline
  def waitForDebugger(): scala.Unit = typings.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("waitForDebugger")().asInstanceOf[scala.Unit]
}
