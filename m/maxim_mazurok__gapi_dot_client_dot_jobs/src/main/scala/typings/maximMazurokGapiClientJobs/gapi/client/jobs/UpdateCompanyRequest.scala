package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCompanyRequest extends StObject {
  
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
  implicit class UpdateCompanyRequestMutableBuilder[Self <: UpdateCompanyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompany(value: Company): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
