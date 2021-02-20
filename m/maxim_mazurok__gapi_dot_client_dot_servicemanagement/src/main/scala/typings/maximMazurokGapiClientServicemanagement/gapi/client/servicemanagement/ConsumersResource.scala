package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientServicemanagement.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumersResource extends StObject {
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(request: PrettyPrint, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
object ConsumersResource {
  
  @scala.inline
  def apply(
    getIamPolicy: (PrettyPrint, GetIamPolicyRequest) => Request[Policy],
    setIamPolicy: (PrettyPrint, SetIamPolicyRequest) => Request[Policy],
    testIamPermissions: (PrettyPrint, TestIamPermissionsRequest) => Request[TestIamPermissionsResponse]
  ): ConsumersResource = {
    val __obj = js.Dynamic.literal(getIamPolicy = js.Any.fromFunction2(getIamPolicy), setIamPolicy = js.Any.fromFunction2(setIamPolicy), testIamPermissions = js.Any.fromFunction2(testIamPermissions))
    __obj.asInstanceOf[ConsumersResource]
  }
  
  @scala.inline
  implicit class ConsumersResourceMutableBuilder[Self <: ConsumersResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetIamPolicy(value: (PrettyPrint, GetIamPolicyRequest) => Request[Policy]): Self = StObject.set(x, "getIamPolicy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetIamPolicy(value: (PrettyPrint, SetIamPolicyRequest) => Request[Policy]): Self = StObject.set(x, "setIamPolicy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTestIamPermissions(value: (PrettyPrint, TestIamPermissionsRequest) => Request[TestIamPermissionsResponse]): Self = StObject.set(x, "testIamPermissions", js.Any.fromFunction2(value))
  }
}
