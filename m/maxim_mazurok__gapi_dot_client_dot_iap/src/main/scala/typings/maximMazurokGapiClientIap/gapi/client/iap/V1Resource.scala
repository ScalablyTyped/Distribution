package typings.maximMazurokGapiClientIap.gapi.client.iap

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientIap.anon.Callback
import typings.maximMazurokGapiClientIap.anon.Name
import typings.maximMazurokGapiClientIap.anon.PrettyPrint
import typings.maximMazurokGapiClientIap.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1Resource extends js.Object {
  
  /**
    * Gets the access control policy for an Identity-Aware Proxy protected resource. More information about managing access via IAP can be found at:
    * https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
    */
  def getIamPolicy(request: PrettyPrint, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Gets the IAP settings on a particular IAP protected resource. */
  def getIapSettings(): Request[IapSettings] = js.native
  def getIapSettings(request: Callback): Request[IapSettings] = js.native
  
  /**
    * Sets the access control policy for an Identity-Aware Proxy protected resource. Replaces any existing policy. More information about managing access via IAP can be found at:
    * https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
    */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the Identity-Aware Proxy protected resource. More information about managing access via IAP can be found at:
    * https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
    */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  /** Updates the IAP settings on a particular IAP protected resource. It replaces all fields unless the `update_mask` is set. */
  def updateIapSettings(request: Name): Request[IapSettings] = js.native
  def updateIapSettings(request: QuotaUser, body: IapSettings): Request[IapSettings] = js.native
}
