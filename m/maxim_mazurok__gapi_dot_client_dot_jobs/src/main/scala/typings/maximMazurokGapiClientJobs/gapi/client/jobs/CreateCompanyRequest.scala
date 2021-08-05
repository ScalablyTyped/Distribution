package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCompanyRequest extends StObject {
  
  /** Required. The company to be created. */
  var company: js.UndefOr[Company] = js.undefined
}
object CreateCompanyRequest {
  
  inline def apply(): CreateCompanyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCompanyRequest]
  }
  
  extension [Self <: CreateCompanyRequest](x: Self) {
    
    inline def setCompany(value: Company): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
  }
}
