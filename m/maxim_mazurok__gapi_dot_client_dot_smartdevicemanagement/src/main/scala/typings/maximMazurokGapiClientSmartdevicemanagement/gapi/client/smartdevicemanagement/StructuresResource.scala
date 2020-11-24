package typings.maximMazurokGapiClientSmartdevicemanagement.gapi.client.smartdevicemanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSmartdevicemanagement.anon.Alt
import typings.maximMazurokGapiClientSmartdevicemanagement.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructuresResource extends js.Object {
  
  /** Gets a structure managed by the enterprise. */
  def get(): Request[GoogleHomeEnterpriseSdmV1Structure] = js.native
  def get(request: Alt): Request[GoogleHomeEnterpriseSdmV1Structure] = js.native
  
  /** Lists structures managed by the enterprise. */
  def list(): Request[GoogleHomeEnterpriseSdmV1ListStructuresResponse] = js.native
  def list(request: Callback): Request[GoogleHomeEnterpriseSdmV1ListStructuresResponse] = js.native
  
  var rooms: RoomsResource = js.native
}
