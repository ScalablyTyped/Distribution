package typings.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The inspector module provides an API for interacting with the V8 inspector.
  */
object nodeInspectorMod {
  
  @JSImport("node:inspector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The `inspector.Session` is used for dispatching messages to the V8 inspector
    * back-end and receiving message responses and notifications.
    */
  @JSImport("node:inspector", "Session")
  @js.native
  /**
    * Create a new instance of the inspector.Session class.
    * The inspector session needs to be connected through session.connect() before the messages can be dispatched to the inspector backend.
    */
  open class Session () extends StObject
  
  /**
    * Deactivate the inspector. Blocks until there are no active connections.
    */
  inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
  
  /**
    * Activate inspector on host and port. Equivalent to`node --inspect=[[host:]port]`, but can be done programmatically after node has
    * started.
    *
    * If wait is `true`, will block until a client has connected to the inspect port
    * and flow control has been passed to the debugger client.
    *
    * See the `security warning` regarding the `host`parameter usage.
    * @param [port='what was specified on the CLI'] Port to listen on for inspector connections. Optional.
    * @param [host='what was specified on the CLI'] Host to listen on for inspector connections. Optional.
    * @param [wait=false] Block until a client has connected. Optional.
    */
  inline def open(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[Unit]
  inline def open(port: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def open(port: Double, host: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(port: Double, host: String, wait: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(port: Double, host: Unit, wait: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(port: Unit, host: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(port: Unit, host: String, wait: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(port: Unit, host: Unit, wait: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Return the URL of the active inspector, or `undefined` if there is none.
    *
    * ```console
    * $ node --inspect -p 'inspector.url()'
    * Debugger listening on ws://127.0.0.1:9229/166e272e-7a30-4d09-97ce-f1c012b43c34
    * For help, see: https://nodejs.org/en/docs/inspector
    * ws://127.0.0.1:9229/166e272e-7a30-4d09-97ce-f1c012b43c34
    *
    * $ node --inspect=localhost:3000 -p 'inspector.url()'
    * Debugger listening on ws://localhost:3000/51cf8d0e-3c36-4c59-8efd-54519839e56a
    * For help, see: https://nodejs.org/en/docs/inspector
    * ws://localhost:3000/51cf8d0e-3c36-4c59-8efd-54519839e56a
    *
    * $ node -p 'inspector.url()'
    * undefined
    * ```
    */
  inline def url(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("url")().asInstanceOf[js.UndefOr[String]]
  
  /**
    * Blocks until a client (existing or connected later) has sent`Runtime.runIfWaitingForDebugger` command.
    *
    * An exception will be thrown if there is no active inspector.
    * @since v12.7.0
    */
  inline def waitForDebugger(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForDebugger")().asInstanceOf[Unit]
}
