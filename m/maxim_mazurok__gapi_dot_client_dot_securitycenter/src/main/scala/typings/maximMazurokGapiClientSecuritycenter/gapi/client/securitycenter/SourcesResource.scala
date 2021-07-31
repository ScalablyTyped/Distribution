package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSecuritycenter.anon.AccesstokenAlt
import typings.maximMazurokGapiClientSecuritycenter.anon.Alt
import typings.maximMazurokGapiClientSecuritycenter.anon.AltCallback
import typings.maximMazurokGapiClientSecuritycenter.anon.PageSize
import typings.maximMazurokGapiClientSecuritycenter.anon.PrettyPrint
import typings.maximMazurokGapiClientSecuritycenter.anon.UpdateMask
import typings.maximMazurokGapiClientSecuritycenter.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourcesResource extends StObject {
  
  def create(request: Alt, body: Source): Request[Source] = js.native
  /** Creates a source. */
  def create(request: Xgafv): Request[Source] = js.native
  
  var findings: FindingsResource = js.native
  
  /** Gets a source. */
  def get(): Request[Source] = js.native
  def get(request: PrettyPrint): Request[Source] = js.native
  
  /** Gets the access control policy on the specified Source. */
  def getIamPolicy(request: AccesstokenAlt, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists all sources belonging to an organization. */
  def list(): Request[ListSourcesResponse] = js.native
  def list(request: PageSize): Request[ListSourcesResponse] = js.native
  
  /** Updates a source. */
  def patch(request: AltCallback): Request[Source] = js.native
  def patch(request: UpdateMask, body: Source): Request[Source] = js.native
  
  /** Sets the access control policy on the specified Source. */
  def setIamPolicy(request: AccesstokenAlt, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Returns the permissions that a caller has on the specified source. */
  def testIamPermissions(request: AccesstokenAlt, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
