package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TenantResource extends js.Object {
  
  /** Output only. @OutputOnly Identifier of the tenant resource. For cloud projects, it is in the form 'projects/{number}'. For example 'projects/123456'. */
  var resource: js.UndefOr[String] = js.native
  
  /** Status of tenant resource. */
  var status: js.UndefOr[String] = js.native
  
  /** Unique per single tenancy unit. */
  var tag: js.UndefOr[String] = js.native
}
object TenantResource {
  
  @scala.inline
  def apply(): TenantResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TenantResource]
  }
  
  @scala.inline
  implicit class TenantResourceOps[Self <: TenantResource] (val x: Self) extends AnyVal {
    
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
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
