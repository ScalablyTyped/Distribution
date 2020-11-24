package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TenancyUnit extends js.Object {
  
  /** Output only. @OutputOnly Cloud resource name of the consumer of this service. For example 'projects/123456'. */
  var consumer: js.UndefOr[String] = js.native
  
  /** Output only. @OutputOnly The time this tenancy unit was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Globally unique identifier of this tenancy unit "services/{service}/{collection id}/{resource id}/tenancyUnits/{unit}" */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Google Cloud API name of the managed service owning this tenancy unit. For example 'serviceconsumermanagement.googleapis.com'. */
  var service: js.UndefOr[String] = js.native
  
  /** Resources constituting the tenancy unit. There can be at most 512 tenant resources in a tenancy unit. */
  var tenantResources: js.UndefOr[js.Array[TenantResource]] = js.native
}
object TenancyUnit {
  
  @scala.inline
  def apply(): TenancyUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TenancyUnit]
  }
  
  @scala.inline
  implicit class TenancyUnitOps[Self <: TenancyUnit] (val x: Self) extends AnyVal {
    
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
    def setConsumer(value: String): Self = this.set("consumer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumer: Self = this.set("consumer", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setTenantResourcesVarargs(value: TenantResource*): Self = this.set("tenantResources", js.Array(value :_*))
    
    @scala.inline
    def setTenantResources(value: js.Array[TenantResource]): Self = this.set("tenantResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantResources: Self = this.set("tenantResources", js.undefined)
  }
}
