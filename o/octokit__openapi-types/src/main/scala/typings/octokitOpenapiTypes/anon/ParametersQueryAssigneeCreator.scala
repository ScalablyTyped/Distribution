package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAssigneeCreator extends StObject {
  
  var parameters: QueryAssigneeCreator
  
  var responses: `200301404422`
}
object ParametersQueryAssigneeCreator {
  
  inline def apply(parameters: QueryAssigneeCreator, responses: `200301404422`): ParametersQueryAssigneeCreator = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAssigneeCreator]
  }
  
  extension [Self <: ParametersQueryAssigneeCreator](x: Self) {
    
    inline def setParameters(value: QueryAssigneeCreator): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200301404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
