package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunnergroupidNumberRequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: PathRunnergroupidNumber
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
}
object ParametersPathRunnergroupidNumberRequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(parameters: PathRunnergroupidNumber, requestBody: ContentApplicationjsonSelectedrepositoryids): ParametersPathRunnergroupidNumberRequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunnergroupidNumberRequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  extension [Self <: ParametersPathRunnergroupidNumberRequestBodyContentApplicationjsonSelectedrepositoryids](x: Self) {
    
    inline def setParameters(value: PathRunnergroupidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
