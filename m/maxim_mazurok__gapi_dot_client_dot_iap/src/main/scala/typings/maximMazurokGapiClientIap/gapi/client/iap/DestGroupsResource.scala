package typings.maximMazurokGapiClientIap.gapi.client.iap

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientIap.anon.Callback
import typings.maximMazurokGapiClientIap.anon.Fields
import typings.maximMazurokGapiClientIap.anon.Name
import typings.maximMazurokGapiClientIap.anon.Parent
import typings.maximMazurokGapiClientIap.anon.PrettyPrint
import typings.maximMazurokGapiClientIap.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestGroupsResource extends StObject {
  
  /** Creates a new TunnelDestGroup. */
  def create(request: Parent): Request[TunnelDestGroup] = js.native
  def create(request: PrettyPrint, body: TunnelDestGroup): Request[TunnelDestGroup] = js.native
  
  /** Deletes a TunnelDestGroup. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Retrieves an existing TunnelDestGroup. */
  def get(): Request[TunnelDestGroup] = js.native
  def get(request: Callback): Request[TunnelDestGroup] = js.native
  
  /** Lists the existing TunnelDestGroups. To group across all locations, use a `-` as the location ID. For example: `/v1/projects/123/iap_tunnel/locations/-/destGroups` */
  def list(): Request[ListTunnelDestGroupsResponse] = js.native
  def list(request: Fields): Request[ListTunnelDestGroupsResponse] = js.native
  
  /** Updates a TunnelDestGroup. */
  def patch(request: Name): Request[TunnelDestGroup] = js.native
  def patch(request: QuotaUser, body: TunnelDestGroup): Request[TunnelDestGroup] = js.native
}
