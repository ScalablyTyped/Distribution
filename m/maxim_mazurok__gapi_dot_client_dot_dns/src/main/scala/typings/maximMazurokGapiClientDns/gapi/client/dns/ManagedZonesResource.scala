package typings.maximMazurokGapiClientDns.gapi.client.dns

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDns.anon.Alt
import typings.maximMazurokGapiClientDns.anon.DnsName
import typings.maximMazurokGapiClientDns.anon.Oauthtoken
import typings.maximMazurokGapiClientDns.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZonesResource extends StObject {
  
  /** Create a new ManagedZone. */
  def create(request: Oauthtoken): Request[ManagedZone] = js.native
  def create(request: PrettyPrint, body: ManagedZone): Request[ManagedZone] = js.native
  
  /** Delete a previously created ManagedZone. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Fetch the representation of an existing ManagedZone. */
  def get(): Request[ManagedZone] = js.native
  def get(request: Alt): Request[ManagedZone] = js.native
  
  /** Enumerate ManagedZones that have been created but not yet deleted. */
  def list(): Request[ManagedZonesListResponse] = js.native
  def list(request: DnsName): Request[ManagedZonesListResponse] = js.native
  
  def patch(request: Alt, body: ManagedZone): Request[Operation] = js.native
  /** Apply a partial update to an existing ManagedZone. */
  def patch(request: typings.maximMazurokGapiClientDns.anon.Project): Request[Operation] = js.native
  
  def update(request: Alt, body: ManagedZone): Request[Operation] = js.native
  /** Update an existing ManagedZone. */
  def update(request: typings.maximMazurokGapiClientDns.anon.Project): Request[Operation] = js.native
}
