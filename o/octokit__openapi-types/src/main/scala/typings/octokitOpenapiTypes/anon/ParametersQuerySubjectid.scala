package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuerySubjectid extends StObject {
  
  var parameters: QuerySubjectid
  
  var responses: `200Content394`
}
object ParametersQuerySubjectid {
  
  inline def apply(parameters: QuerySubjectid, responses: `200Content394`): ParametersQuerySubjectid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuerySubjectid]
  }
  
  extension [Self <: ParametersQuerySubjectid](x: Self) {
    
    inline def setParameters(value: QuerySubjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content394`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
