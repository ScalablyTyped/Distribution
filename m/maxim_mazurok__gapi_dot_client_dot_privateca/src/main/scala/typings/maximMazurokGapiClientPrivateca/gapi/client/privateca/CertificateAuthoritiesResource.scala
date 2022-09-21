package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPrivateca.anon.Accesstoken
import typings.maximMazurokGapiClientPrivateca.anon.Callback
import typings.maximMazurokGapiClientPrivateca.anon.CertificateAuthorityId
import typings.maximMazurokGapiClientPrivateca.anon.IgnoreActiveCertificates
import typings.maximMazurokGapiClientPrivateca.anon.Key
import typings.maximMazurokGapiClientPrivateca.anon.Name
import typings.maximMazurokGapiClientPrivateca.anon.Parent
import typings.maximMazurokGapiClientPrivateca.anon.PrettyPrint
import typings.maximMazurokGapiClientPrivateca.anon.QuotaUser
import typings.maximMazurokGapiClientPrivateca.anon.RequestId
import typings.maximMazurokGapiClientPrivateca.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateAuthoritiesResource extends StObject {
  
  def activate(request: Accesstoken, body: ActivateCertificateAuthorityRequest): Request[Operation] = js.native
  /**
    * Activate a CertificateAuthority that is in state AWAITING_USER_ACTIVATION and is of type SUBORDINATE. After the parent Certificate Authority signs a certificate signing request from
    * FetchCertificateAuthorityCsr, this method can complete the activation process.
    */
  def activate(request: Name): Request[Operation] = js.native
  
  var certificateRevocationLists: CertificateRevocationListsResource = js.native
  
  /** Create a new CertificateAuthority in a given Project and Location. */
  def create(request: CertificateAuthorityId): Request[Operation] = js.native
  def create(request: Parent, body: CertificateAuthority): Request[Operation] = js.native
  
  /** Delete a CertificateAuthority. */
  def delete(): Request[Operation] = js.native
  def delete(request: IgnoreActiveCertificates): Request[Operation] = js.native
  
  def disable(request: Accesstoken, body: DisableCertificateAuthorityRequest): Request[Operation] = js.native
  /** Disable a CertificateAuthority. */
  def disable(request: PrettyPrint): Request[Operation] = js.native
  
  def enable(request: Accesstoken, body: EnableCertificateAuthorityRequest): Request[Operation] = js.native
  /** Enable a CertificateAuthority. */
  def enable(request: QuotaUser): Request[Operation] = js.native
  
  /**
    * Fetch a certificate signing request (CSR) from a CertificateAuthority that is in state AWAITING_USER_ACTIVATION and is of type SUBORDINATE. The CSR must then be signed by the
    * desired parent Certificate Authority, which could be another CertificateAuthority resource, or could be an on-prem certificate authority. See also ActivateCertificateAuthority.
    */
  def fetch(): Request[FetchCertificateAuthorityCsrResponse] = js.native
  def fetch(request: Accesstoken): Request[FetchCertificateAuthorityCsrResponse] = js.native
  
  /** Returns a CertificateAuthority. */
  def get(): Request[CertificateAuthority] = js.native
  def get(request: Accesstoken): Request[CertificateAuthority] = js.native
  
  /** Lists CertificateAuthorities. */
  def list(): Request[ListCertificateAuthoritiesResponse] = js.native
  def list(request: Callback): Request[ListCertificateAuthoritiesResponse] = js.native
  
  def patch(request: Key, body: CertificateAuthority): Request[Operation] = js.native
  /** Update a CertificateAuthority. */
  def patch(request: RequestId): Request[Operation] = js.native
  
  def undelete(request: Accesstoken, body: UndeleteCertificateAuthorityRequest): Request[Operation] = js.native
  /** Undelete a CertificateAuthority that has been deleted. */
  def undelete(request: Resource): Request[Operation] = js.native
}
