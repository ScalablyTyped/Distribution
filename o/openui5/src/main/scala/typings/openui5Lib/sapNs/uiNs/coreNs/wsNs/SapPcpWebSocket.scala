package typings
package openui5Lib.sapNs.uiNs.coreNs.wsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.ws.SapPcpWebSocket")
@js.native
class SapPcpWebSocket protected () extends WebSocket {
  /**
    * Creates a new WebSocket connection and uses the pcp-protocol for communication.
    * @param sUrl relative or absolute URL for WebSocket connection.
    * @param aProtocols array of protocols as strings, a single protocol as a string.Protocol(s) should be
    * selected from {@link sap.ui.core.ws.SapPcpWebSocket.SUPPORTED_PROTOCOLS}.
    */
  def this(sUrl: java.lang.String) = this()
  def this(sUrl: java.lang.String, aProtocols: js.Array[_]) = this()
  def send(message: java.lang.String, oPcpFields: js.Any): SapPcpWebSocket = js.native
  def send(message: js.Any): SapPcpWebSocket = js.native
  def send(message: js.Any, oPcpFields: js.Any): SapPcpWebSocket = js.native
  def send(message: js.Array[_]): SapPcpWebSocket = js.native
  def send(message: js.Array[_], oPcpFields: js.Any): SapPcpWebSocket = js.native
}

