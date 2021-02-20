package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCompanyRequest extends StObject {
  
  /** Required. The company to be created. */
  var company: js.UndefOr[Company] = js.native
}
object CreateCompanyRequest {
  
  @scala.inline
  def apply(): CreateCompanyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCompanyRequest]
  }
  
  @scala.inline
  implicit class CreateCompanyRequestMutableBuilder[Self <: CreateCompanyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompany(value: Company): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
  }
}
