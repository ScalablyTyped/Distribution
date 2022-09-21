package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryVisibletorepository extends StObject {
  
  var parameters: QueryVisibletorepository
  
  var responses: `200ContentApplicationjsonRunnergroupsTotalcount`
}
object ParametersQueryVisibletorepository {
  
  inline def apply(parameters: QueryVisibletorepository, responses: `200ContentApplicationjsonRunnergroupsTotalcount`): ParametersQueryVisibletorepository = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryVisibletorepository]
  }
  
  extension [Self <: ParametersQueryVisibletorepository](x: Self) {
    
    inline def setParameters(value: QueryVisibletorepository): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunnergroupsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
