package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathEnvironmentnameRepositoryid extends StObject {
  
  /** Lists all secrets available in an environment without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint. */
  var get: ParametersPathEnvironmentnameRepositoryid
}
object GetParametersPathEnvironmentnameRepositoryid {
  
  inline def apply(get: ParametersPathEnvironmentnameRepositoryid): GetParametersPathEnvironmentnameRepositoryid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathEnvironmentnameRepositoryid]
  }
  
  extension [Self <: GetParametersPathEnvironmentnameRepositoryid](x: Self) {
    
    inline def setGet(value: ParametersPathEnvironmentnameRepositoryid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
