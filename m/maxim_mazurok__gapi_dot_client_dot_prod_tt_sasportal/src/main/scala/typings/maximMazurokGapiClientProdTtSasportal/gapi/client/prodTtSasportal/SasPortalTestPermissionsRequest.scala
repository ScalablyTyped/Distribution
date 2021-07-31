package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalTestPermissionsRequest extends StObject {
  
  /** The set of permissions to check for the `resource`. */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The resource for which the permissions are being requested. */
  var resource: js.UndefOr[String] = js.undefined
}
object SasPortalTestPermissionsRequest {
  
  @scala.inline
  def apply(): SasPortalTestPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalTestPermissionsRequest]
  }
  
  @scala.inline
  implicit class SasPortalTestPermissionsRequestMutableBuilder[Self <: SasPortalTestPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
