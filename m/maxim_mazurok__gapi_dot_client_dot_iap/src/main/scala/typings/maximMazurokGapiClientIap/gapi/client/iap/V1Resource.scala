package typings.maximMazurokGapiClientIap.gapi.client.iap

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientIap.anon.Callback
import typings.maximMazurokGapiClientIap.anon.QuotaUser
import typings.maximMazurokGapiClientIap.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1Resource extends StObject {
  
  /**
    * Gets the access control policy for an Identity-Aware Proxy protected resource. More information about managing access via IAP can be found at:
    * https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
    */
  def getIamPolicy(request: typings.maximMazurokGapiClientIap.anon.Resource, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Gets the IAP settings on a particular IAP protected resource. */
  def getIapSettings(): Request[IapSettings] = js.native
  def getIapSettings(request: Callback): Request[IapSettings] = js.native
  
  /**
    * Sets the access control policy for an Identity-Aware Proxy protected resource. Replaces any existing policy. More information about managing access via IAP can be found at:
    * https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
    */
  def setIamPolicy(request: typings.maximMazurokGapiClientIap.anon.Resource, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the Identity-Aware Proxy protected resource. More information about managing access via IAP can be found at:
    * https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
    */
  def testIamPermissions(request: typings.maximMazurokGapiClientIap.anon.Resource, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def updateIapSettings(request: QuotaUser, body: IapSettings): Request[IapSettings] = js.native
  /** Updates the IAP settings on a particular IAP protected resource. It replaces all fields unless the `update_mask` is set. */
  def updateIapSettings(request: UpdateMask): Request[IapSettings] = js.native
}
