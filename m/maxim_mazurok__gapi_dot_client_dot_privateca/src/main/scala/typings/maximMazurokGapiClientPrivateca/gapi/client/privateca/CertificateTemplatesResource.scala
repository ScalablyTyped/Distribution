package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPrivateca.anon.Accesstoken
import typings.maximMazurokGapiClientPrivateca.anon.Alt
import typings.maximMazurokGapiClientPrivateca.anon.Callback
import typings.maximMazurokGapiClientPrivateca.anon.CallbackCertificateTemplateId
import typings.maximMazurokGapiClientPrivateca.anon.CallbackFields
import typings.maximMazurokGapiClientPrivateca.anon.CertificateTemplateId
import typings.maximMazurokGapiClientPrivateca.anon.Key
import typings.maximMazurokGapiClientPrivateca.anon.Oauthtoken
import typings.maximMazurokGapiClientPrivateca.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateTemplatesResource extends StObject {
  
  def create(request: CallbackCertificateTemplateId, body: CertificateTemplate): Request[Operation] = js.native
  /** Create a new CertificateTemplate in a given Project and Location. */
  def create(request: CertificateTemplateId): Request[Operation] = js.native
  
  /** DeleteCertificateTemplate deletes a CertificateTemplate. */
  def delete(): Request[Operation] = js.native
  def delete(request: Xgafv): Request[Operation] = js.native
  
  /** Returns a CertificateTemplate. */
  def get(): Request[CertificateTemplate] = js.native
  def get(request: Accesstoken): Request[CertificateTemplate] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Alt): Request[Policy] = js.native
  
  /** Lists CertificateTemplates. */
  def list(): Request[ListCertificateTemplatesResponse] = js.native
  def list(request: Callback): Request[ListCertificateTemplatesResponse] = js.native
  
  /** Update a CertificateTemplate. */
  def patch(request: CallbackFields): Request[Operation] = js.native
  def patch(request: Key, body: CertificateTemplate): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
