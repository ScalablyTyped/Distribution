package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath246 extends StObject {
  
  /**
    * Gets the total GitHub Actions cache usage for an enterprise.
    * The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  var get: ParametersPath246
}
object GetParametersPath246 {
  
  inline def apply(get: ParametersPath246): GetParametersPath246 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath246]
  }
  
  extension [Self <: GetParametersPath246](x: Self) {
    
    inline def setGet(value: ParametersPath246): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
