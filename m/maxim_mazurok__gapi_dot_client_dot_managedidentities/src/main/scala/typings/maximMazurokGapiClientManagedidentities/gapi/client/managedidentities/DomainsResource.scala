package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientManagedidentities.anon.Accesstoken
import typings.maximMazurokGapiClientManagedidentities.anon.Alt
import typings.maximMazurokGapiClientManagedidentities.anon.Callback
import typings.maximMazurokGapiClientManagedidentities.anon.DomainName
import typings.maximMazurokGapiClientManagedidentities.anon.Fields
import typings.maximMazurokGapiClientManagedidentities.anon.Filter
import typings.maximMazurokGapiClientManagedidentities.anon.Key
import typings.maximMazurokGapiClientManagedidentities.anon.Name
import typings.maximMazurokGapiClientManagedidentities.anon.Oauthtoken
import typings.maximMazurokGapiClientManagedidentities.anon.PrettyPrint
import typings.maximMazurokGapiClientManagedidentities.anon.QuotaUser
import typings.maximMazurokGapiClientManagedidentities.anon.Resource
import typings.maximMazurokGapiClientManagedidentities.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainsResource extends js.Object {
  
  /** Adds an AD trust to a domain. */
  def attachTrust(request: Accesstoken): Request[Operation] = js.native
  def attachTrust(request: Alt, body: AttachTrustRequest): Request[Operation] = js.native
  
  /** Creates a Microsoft AD domain. */
  def create(request: Callback): Request[Operation] = js.native
  def create(request: DomainName, body: Domain): Request[Operation] = js.native
  
  /** Deletes a domain. */
  def delete(): Request[Operation] = js.native
  def delete(request: Alt): Request[Operation] = js.native
  
  def detachTrust(request: Alt, body: DetachTrustRequest): Request[Operation] = js.native
  /** Removes an AD trust. */
  def detachTrust(request: Fields): Request[Operation] = js.native
  
  /** Gets information about a domain. */
  def get(): Request[Domain] = js.native
  def get(request: Alt): Request[Domain] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Key): Request[Policy] = js.native
  
  /** Lists domains in a project. */
  def list(): Request[ListDomainsResponse] = js.native
  def list(request: Filter): Request[ListDomainsResponse] = js.native
  
  /** Updates the metadata and configuration of a domain. */
  def patch(request: Name): Request[Operation] = js.native
  def patch(request: Oauthtoken, body: Domain): Request[Operation] = js.native
  
  def reconfigureTrust(request: Alt, body: ReconfigureTrustRequest): Request[Operation] = js.native
  /** Updates the DNS conditional forwarder. */
  def reconfigureTrust(request: PrettyPrint): Request[Operation] = js.native
  
  def resetAdminPassword(request: Alt, body: ResetAdminPasswordRequest): Request[ResetAdminPasswordResponse] = js.native
  /** Resets a domain's administrator password. */
  def resetAdminPassword(request: QuotaUser): Request[ResetAdminPasswordResponse] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Resource, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Resource, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def validateTrust(request: Alt, body: ValidateTrustRequest): Request[Operation] = js.native
  /** Validates a trust state, that the target domain is reachable, and that the target domain is able to accept incoming trust requests. */
  def validateTrust(request: UploadType): Request[Operation] = js.native
}
