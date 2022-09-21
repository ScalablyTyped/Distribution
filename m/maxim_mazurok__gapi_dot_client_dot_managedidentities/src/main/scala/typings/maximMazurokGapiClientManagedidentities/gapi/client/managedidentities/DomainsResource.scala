package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientManagedidentities.anon.AccesstokenAlt
import typings.maximMazurokGapiClientManagedidentities.anon.Callback
import typings.maximMazurokGapiClientManagedidentities.anon.DomainName
import typings.maximMazurokGapiClientManagedidentities.anon.Fields
import typings.maximMazurokGapiClientManagedidentities.anon.Filter
import typings.maximMazurokGapiClientManagedidentities.anon.Name
import typings.maximMazurokGapiClientManagedidentities.anon.Oauthtoken
import typings.maximMazurokGapiClientManagedidentities.anon.Parent
import typings.maximMazurokGapiClientManagedidentities.anon.PrettyPrint
import typings.maximMazurokGapiClientManagedidentities.anon.QuotaUser
import typings.maximMazurokGapiClientManagedidentities.anon.Resource
import typings.maximMazurokGapiClientManagedidentities.anon.UpdateMask
import typings.maximMazurokGapiClientManagedidentities.anon.UploadType
import typings.maximMazurokGapiClientManagedidentities.anon.Uploadprotocol
import typings.maximMazurokGapiClientManagedidentities.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainsResource extends StObject {
  
  def attachTrust(request: Callback, body: AttachTrustRequest): Request[Operation] = js.native
  /** Adds an AD trust to a domain. */
  def attachTrust(request: PrettyPrint): Request[Operation] = js.native
  
  var backups: BackupsResource = js.native
  
  /** Creates a Microsoft AD domain. */
  def create(request: DomainName): Request[Operation] = js.native
  def create(request: Parent, body: Domain): Request[Operation] = js.native
  
  /** Deletes a domain. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  def detachTrust(request: Callback, body: DetachTrustRequest): Request[Operation] = js.native
  /** Removes an AD trust. */
  def detachTrust(request: QuotaUser): Request[Operation] = js.native
  
  /** Gets information about a domain. */
  def get(): Request[Domain] = js.native
  def get(request: Callback): Request[Domain] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  
  /** Gets the domain ldaps settings. */
  def getLdapssettings(): Request[LDAPSSettings] = js.native
  def getLdapssettings(request: Callback): Request[LDAPSSettings] = js.native
  
  /** Lists domains in a project. */
  def list(): Request[ListDomainsResponse] = js.native
  def list(request: Filter): Request[ListDomainsResponse] = js.native
  
  def patch(request: Name, body: Domain): Request[Operation] = js.native
  /** Updates the metadata and configuration of a domain. */
  def patch(request: Resource): Request[Operation] = js.native
  
  def reconfigureTrust(request: Callback, body: ReconfigureTrustRequest): Request[Operation] = js.native
  /** Updates the DNS conditional forwarder. */
  def reconfigureTrust(request: UploadType): Request[Operation] = js.native
  
  def resetAdminPassword(request: Callback, body: ResetAdminPasswordRequest): Request[ResetAdminPasswordResponse] = js.native
  /** Resets a domain's administrator password. */
  def resetAdminPassword(request: Uploadprotocol): Request[ResetAdminPasswordResponse] = js.native
  
  def restore(request: Callback, body: RestoreDomainRequest): Request[Operation] = js.native
  /** RestoreDomain restores domain backup mentioned in the RestoreDomainRequest */
  def restore(request: Xgafv): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  var sqlIntegrations: SqlIntegrationsResource = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def updateLdapssettings(request: Name, body: LDAPSSettings): Request[Operation] = js.native
  /** Patches a single ldaps settings. */
  def updateLdapssettings(request: UpdateMask): Request[Operation] = js.native
  
  /** Validates a trust state, that the target domain is reachable, and that the target domain is able to accept incoming trust requests. */
  def validateTrust(request: AccesstokenAlt): Request[Operation] = js.native
  def validateTrust(request: Callback, body: ValidateTrustRequest): Request[Operation] = js.native
}
