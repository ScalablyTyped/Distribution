package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerResponses200ContentApplicationjsonRunners extends StObject {
  
  /**
    * List self-hosted runners for a repository
    * @description Lists all self-hosted runners configured in a repository. You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  var get: ParametersPathOwnerResponses200ContentApplicationjsonRunners
}
object GetParametersPathOwnerResponses200ContentApplicationjsonRunners {
  
  inline def apply(get: ParametersPathOwnerResponses200ContentApplicationjsonRunners): GetParametersPathOwnerResponses200ContentApplicationjsonRunners = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerResponses200ContentApplicationjsonRunners]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOwnerResponses200ContentApplicationjsonRunners] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOwnerResponses200ContentApplicationjsonRunners): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
