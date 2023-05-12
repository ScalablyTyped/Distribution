package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameNameRepositoryid extends StObject {
  
  var parameters: PathEnvironmentnameNameRepositoryid
  
  var responses: `200ContentApplicationjsonUpdatedatValue`
}
object ParametersPathEnvironmentnameNameRepositoryid {
  
  inline def apply(
    parameters: PathEnvironmentnameNameRepositoryid,
    responses: `200ContentApplicationjsonUpdatedatValue`
  ): ParametersPathEnvironmentnameNameRepositoryid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameNameRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameNameRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameNameRepositoryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonUpdatedatValue`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
