package typings.maximMazurokGapiClientSmartdevicemanagement.gapi.client.smartdevicemanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSmartdevicemanagement.anon.Alt
import typings.maximMazurokGapiClientSmartdevicemanagement.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomsResource extends js.Object {
  
  /** Gets a room managed by the enterprise. */
  def get(): Request[GoogleHomeEnterpriseSdmV1Room] = js.native
  def get(request: Alt): Request[GoogleHomeEnterpriseSdmV1Room] = js.native
  
  /** Lists rooms managed by the enterprise. */
  def list(): Request[GoogleHomeEnterpriseSdmV1ListRoomsResponse] = js.native
  def list(request: Fields): Request[GoogleHomeEnterpriseSdmV1ListRoomsResponse] = js.native
}
