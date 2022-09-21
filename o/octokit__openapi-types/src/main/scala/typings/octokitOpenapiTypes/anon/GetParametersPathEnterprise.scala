package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathEnterprise extends StObject {
  
  /**
    * Gets the total GitHub Actions cache usage for an enterprise.
    * The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  var get: ParametersPathEnterprise
}
object GetParametersPathEnterprise {
  
  inline def apply(get: ParametersPathEnterprise): GetParametersPathEnterprise = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathEnterprise]
  }
  
  extension [Self <: GetParametersPathEnterprise](x: Self) {
    
    inline def setGet(value: ParametersPathEnterprise): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
