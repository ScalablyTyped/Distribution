package typings.maximMazurokGapiClientDns.gapi.client.dns

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDns.anon.Alt
import typings.maximMazurokGapiClientDns.anon.DnsName
import typings.maximMazurokGapiClientDns.anon.Oauthtoken
import typings.maximMazurokGapiClientDns.anon.PrettyPrint
import typings.maximMazurokGapiClientDns.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZonesResource extends StObject {
  
  /** Creates a new ManagedZone. */
  def create(request: Oauthtoken): Request[ManagedZone] = js.native
  def create(request: PrettyPrint, body: ManagedZone): Request[ManagedZone] = js.native
  
  /** Deletes a previously created ManagedZone. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Fetches the representation of an existing ManagedZone. */
  def get(): Request[ManagedZone] = js.native
  def get(request: Alt): Request[ManagedZone] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(request: QuotaUser, body: GoogleIamV1GetIamPolicyRequest): Request[GoogleIamV1Policy] = js.native
  
  /** Enumerates ManagedZones that have been created but not yet deleted. */
  def list(): Request[ManagedZonesListResponse] = js.native
  def list(request: DnsName): Request[ManagedZonesListResponse] = js.native
  
  def patch(request: Alt, body: ManagedZone): Request[Operation] = js.native
  /** Applies a partial update to an existing ManagedZone. */
  def patch(request: typings.maximMazurokGapiClientDns.anon.Project): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: QuotaUser, body: GoogleIamV1SetIamPolicyRequest): Request[GoogleIamV1Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: QuotaUser, body: GoogleIamV1TestIamPermissionsRequest): Request[GoogleIamV1TestIamPermissionsResponse] = js.native
  
  def update(request: Alt, body: ManagedZone): Request[Operation] = js.native
  /** Updates an existing ManagedZone. */
  def update(request: typings.maximMazurokGapiClientDns.anon.Project): Request[Operation] = js.native
}
