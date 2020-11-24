package typings.maximMazurokGapiClientSmartdevicemanagement.gapi.client.smartdevicemanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSmartdevicemanagement.anon.Accesstoken
import typings.maximMazurokGapiClientSmartdevicemanagement.anon.Alt
import typings.maximMazurokGapiClientSmartdevicemanagement.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesResource extends js.Object {
  
  /** Executes a command to device managed by the enterprise. */
  def executeCommand(request: Accesstoken): Request[GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse] = js.native
  def executeCommand(request: Alt, body: GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest): Request[GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse] = js.native
  
  /** Gets a device managed by the enterprise. */
  def get(): Request[GoogleHomeEnterpriseSdmV1Device] = js.native
  def get(request: Alt): Request[GoogleHomeEnterpriseSdmV1Device] = js.native
  
  /** Lists devices managed by the enterprise. */
  def list(): Request[GoogleHomeEnterpriseSdmV1ListDevicesResponse] = js.native
  def list(request: Callback): Request[GoogleHomeEnterpriseSdmV1ListDevicesResponse] = js.native
}
