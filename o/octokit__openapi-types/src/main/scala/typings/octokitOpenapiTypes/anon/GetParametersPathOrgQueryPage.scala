package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOrgQueryPage extends StObject {
  
  /**
    * Lists the codespaces associated to a specified organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPathOrgQueryPage
}
object GetParametersPathOrgQueryPage {
  
  inline def apply(get: ParametersPathOrgQueryPage): GetParametersPathOrgQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOrgQueryPage]
  }
  
  extension [Self <: GetParametersPathOrgQueryPage](x: Self) {
    
    inline def setGet(value: ParametersPathOrgQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
