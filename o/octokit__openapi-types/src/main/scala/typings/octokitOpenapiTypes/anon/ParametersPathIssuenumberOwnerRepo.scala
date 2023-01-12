package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerRepo extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var responses: `301304404`
}
object ParametersPathIssuenumberOwnerRepo {
  
  inline def apply(parameters: PathIssuenumberOwnerRepo, responses: `301304404`): ParametersPathIssuenumberOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumberOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `301304404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
