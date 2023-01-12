package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOrgResponses200ContentApplicationjsonRunners extends StObject {
  
  /**
    * Lists all self-hosted runners configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPathOrgResponses200ContentApplicationjsonRunners
}
object GetParametersPathOrgResponses200ContentApplicationjsonRunners {
  
  inline def apply(get: ParametersPathOrgResponses200ContentApplicationjsonRunners): GetParametersPathOrgResponses200ContentApplicationjsonRunners = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOrgResponses200ContentApplicationjsonRunners]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOrgResponses200ContentApplicationjsonRunners] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOrgResponses200ContentApplicationjsonRunners): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
