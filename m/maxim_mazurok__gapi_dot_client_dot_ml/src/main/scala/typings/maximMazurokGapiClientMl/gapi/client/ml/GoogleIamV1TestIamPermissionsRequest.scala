package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleIamV1TestIamPermissionsRequest extends StObject {
  
  /**
    * The set of permissions to check for the `resource`. Permissions with wildcards (such as '*' or 'storage.*') are not allowed. For more information see [IAM
    * Overview](https://cloud.google.com/iam/docs/overview#permissions).
    */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleIamV1TestIamPermissionsRequest {
  
  @scala.inline
  def apply(): GoogleIamV1TestIamPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIamV1TestIamPermissionsRequest]
  }
  
  @scala.inline
  implicit class GoogleIamV1TestIamPermissionsRequestMutableBuilder[Self <: GoogleIamV1TestIamPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
