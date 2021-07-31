package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPrivateca.anon.Accesstoken
import typings.maximMazurokGapiClientPrivateca.anon.Alt
import typings.maximMazurokGapiClientPrivateca.anon.Callback
import typings.maximMazurokGapiClientPrivateca.anon.CertificateAuthorityId
import typings.maximMazurokGapiClientPrivateca.anon.Key
import typings.maximMazurokGapiClientPrivateca.anon.Oauthtoken
import typings.maximMazurokGapiClientPrivateca.anon.QuotaUser
import typings.maximMazurokGapiClientPrivateca.anon.RequestId
import typings.maximMazurokGapiClientPrivateca.anon.Resource
import typings.maximMazurokGapiClientPrivateca.anon.UpdateMask
import typings.maximMazurokGapiClientPrivateca.anon.UploadType
import typings.maximMazurokGapiClientPrivateca.anon.Uploadprotocol
import typings.maximMazurokGapiClientPrivateca.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateAuthoritiesResource extends StObject {
  
  def activate(request: Accesstoken, body: ActivateCertificateAuthorityRequest): Request[Operation] = js.native
  /**
    * Activate a CertificateAuthority that is in state PENDING_ACTIVATION and is of type SUBORDINATE. After the parent Certificate Authority signs a certificate signing request from
    * FetchCertificateAuthorityCsr, this method can complete the activation process.
    */
  def activate(request: QuotaUser): Request[Operation] = js.native
  
  var certificateRevocationLists: CertificateRevocationListsResource = js.native
  
  var certificates: CertificatesResource = js.native
  
  /** Create a new CertificateAuthority in a given Project and Location. */
  def create(request: CertificateAuthorityId): Request[Operation] = js.native
  def create(request: RequestId, body: CertificateAuthority): Request[Operation] = js.native
  
  def disable(request: Accesstoken, body: DisableCertificateAuthorityRequest): Request[Operation] = js.native
  /** Disable a CertificateAuthority. */
  def disable(request: Resource): Request[Operation] = js.native
  
  def enable(request: Accesstoken, body: EnableCertificateAuthorityRequest): Request[Operation] = js.native
  /** Enable a CertificateAuthority. */
  def enable(request: UploadType): Request[Operation] = js.native
  
  /**
    * Fetch a certificate signing request (CSR) from a CertificateAuthority that is in state PENDING_ACTIVATION and is of type SUBORDINATE. The CSR must then be signed by the desired
    * parent Certificate Authority, which could be another CertificateAuthority resource, or could be an on-prem certificate authority. See also ActivateCertificateAuthority.
    */
  def fetch(): Request[FetchCertificateAuthorityCsrResponse] = js.native
  def fetch(request: Accesstoken): Request[FetchCertificateAuthorityCsrResponse] = js.native
  
  /** Returns a CertificateAuthority. */
  def get(): Request[CertificateAuthority] = js.native
  def get(request: Accesstoken): Request[CertificateAuthority] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Alt): Request[Policy] = js.native
  
  /** Lists CertificateAuthorities. */
  def list(): Request[ListCertificateAuthoritiesResponse] = js.native
  def list(request: Callback): Request[ListCertificateAuthoritiesResponse] = js.native
  
  def patch(request: Key, body: CertificateAuthority): Request[Operation] = js.native
  /** Update a CertificateAuthority. */
  def patch(request: UpdateMask): Request[Operation] = js.native
  
  def restore(request: Accesstoken, body: RestoreCertificateAuthorityRequest): Request[Operation] = js.native
  /** Restore a CertificateAuthority that is scheduled for deletion. */
  def restore(request: Uploadprotocol): Request[Operation] = js.native
  
  def scheduleDelete(request: Accesstoken, body: ScheduleDeleteCertificateAuthorityRequest): Request[Operation] = js.native
  /** Schedule a CertificateAuthority for deletion. */
  def scheduleDelete(request: Xgafv): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
