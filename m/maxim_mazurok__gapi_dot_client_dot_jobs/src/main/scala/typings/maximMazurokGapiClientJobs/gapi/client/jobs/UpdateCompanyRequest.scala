package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCompanyRequest extends js.Object {
  
  /** Required. The company resource to replace the current resource in the system. */
  var company: js.UndefOr[Company] = js.native
  
  /**
    * Optional but strongly recommended for the best service experience. If update_mask is provided, only the specified fields in company are updated. Otherwise all the fields are
    * updated. A field mask to specify the company fields to be updated. Only top level fields of Company are supported.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object UpdateCompanyRequest {
  
  @scala.inline
  def apply(): UpdateCompanyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCompanyRequest]
  }
  
  @scala.inline
  implicit class UpdateCompanyRequestOps[Self <: UpdateCompanyRequest] (val x: Self) extends AnyVal {
    
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
    def setCompany(value: Company): Self = this.set("company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
