package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalTestPermissionsRequest extends js.Object {
  
  /** The set of permissions to check for the `resource`. */
  var permissions: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. The resource for which the permissions are being requested. */
  var resource: js.UndefOr[String] = js.native
}
object SasPortalTestPermissionsRequest {
  
  @scala.inline
  def apply(): SasPortalTestPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalTestPermissionsRequest]
  }
  
  @scala.inline
  implicit class SasPortalTestPermissionsRequestOps[Self <: SasPortalTestPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
}
