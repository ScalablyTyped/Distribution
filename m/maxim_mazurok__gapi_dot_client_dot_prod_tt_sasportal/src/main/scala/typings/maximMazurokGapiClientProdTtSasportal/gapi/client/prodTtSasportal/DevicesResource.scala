package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientProdTtSasportal.anon.Accesstoken
import typings.maximMazurokGapiClientProdTtSasportal.anon.Alt
import typings.maximMazurokGapiClientProdTtSasportal.anon.Callback
import typings.maximMazurokGapiClientProdTtSasportal.anon.Fields
import typings.maximMazurokGapiClientProdTtSasportal.anon.Key
import typings.maximMazurokGapiClientProdTtSasportal.anon.Name
import typings.maximMazurokGapiClientProdTtSasportal.anon.Oauthtoken
import typings.maximMazurokGapiClientProdTtSasportal.anon.PrettyPrint
import typings.maximMazurokGapiClientProdTtSasportal.anon.QuotaUser
import typings.maximMazurokGapiClientProdTtSasportal.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesResource extends StObject {
  
  /** Creates a device under a node or customer. */
  def create(request: Accesstoken): Request[SasPortalDevice] = js.native
  def create(request: Alt, body: SasPortalDevice): Request[SasPortalDevice] = js.native
  
  def createSigned(request: Alt, body: SasPortalCreateSignedDeviceRequest): Request[SasPortalDevice] = js.native
  /** Creates a signed device under a node or customer. */
  def createSigned(request: Callback): Request[SasPortalDevice] = js.native
  
  /** Deletes a device. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets details about a device. */
  def get(): Request[SasPortalDevice] = js.native
  def get(request: Key): Request[SasPortalDevice] = js.native
  
  /** Lists devices under a node or customer. */
  def list(): Request[SasPortalListDevicesResponse] = js.native
  def list(request: Fields): Request[SasPortalListDevicesResponse] = js.native
  
  def move(request: Key, body: SasPortalMoveDeviceRequest): Request[SasPortalOperation] = js.native
  /** Moves a device under another node or customer. */
  def move(request: Name): Request[SasPortalOperation] = js.native
  
  /** Updates a device. */
  def patch(request: Oauthtoken): Request[SasPortalDevice] = js.native
  def patch(request: PrettyPrint, body: SasPortalDevice): Request[SasPortalDevice] = js.native
  
  def signDevice(request: Key, body: SasPortalSignDeviceRequest): Request[js.Object] = js.native
  /** Signs a device. */
  def signDevice(request: QuotaUser): Request[js.Object] = js.native
  
  def updateSigned(request: Key, body: SasPortalUpdateSignedDeviceRequest): Request[SasPortalDevice] = js.native
  /** Updates a signed device. */
  def updateSigned(request: Resource): Request[SasPortalDevice] = js.native
}
