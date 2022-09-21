package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPrivateca.anon.Accesstoken
import typings.maximMazurokGapiClientPrivateca.anon.AccesstokenAlt
import typings.maximMazurokGapiClientPrivateca.anon.Alt
import typings.maximMazurokGapiClientPrivateca.anon.AltCallback
import typings.maximMazurokGapiClientPrivateca.anon.CaPoolId
import typings.maximMazurokGapiClientPrivateca.anon.Callback
import typings.maximMazurokGapiClientPrivateca.anon.Key
import typings.maximMazurokGapiClientPrivateca.anon.Oauthtoken
import typings.maximMazurokGapiClientPrivateca.anon.Uploadprotocol
import typings.maximMazurokGapiClientPrivateca.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaPoolsResource extends StObject {
  
  var certificateAuthorities: CertificateAuthoritiesResource = js.native
  
  var certificates: CertificatesResource = js.native
  
  /** Create a CaPool. */
  def create(request: CaPoolId): Request[Operation] = js.native
  def create(request: Uploadprotocol, body: CaPool): Request[Operation] = js.native
  
  /** Delete a CaPool. */
  def delete(): Request[Operation] = js.native
  def delete(request: Xgafv): Request[Operation] = js.native
  
  def fetchCaCerts(request: AccesstokenAlt, body: FetchCaCertsRequest): Request[FetchCaCertsResponse] = js.native
  /** FetchCaCerts returns the current trust anchor for the CaPool. This will include CA certificate chains for all ACTIVE CertificateAuthority resources in the CaPool. */
  def fetchCaCerts(request: typings.maximMazurokGapiClientPrivateca.anon.CaPool): Request[FetchCaCertsResponse] = js.native
  
  /** Returns a CaPool. */
  def get(): Request[CaPool] = js.native
  def get(request: Accesstoken): Request[CaPool] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Alt): Request[Policy] = js.native
  
  /** Lists CaPools. */
  def list(): Request[ListCaPoolsResponse] = js.native
  def list(request: Callback): Request[ListCaPoolsResponse] = js.native
  
  /** Update a CaPool. */
  def patch(request: AltCallback): Request[Operation] = js.native
  def patch(request: Key, body: CaPool): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
