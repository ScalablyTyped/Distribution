package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath599QuerySubjectid extends StObject {
  
  var parameters: Path599QuerySubjectid
  
  var responses: `200ContentApplicationjson416`
}
object ParametersPath599QuerySubjectid {
  
  inline def apply(parameters: Path599QuerySubjectid, responses: `200ContentApplicationjson416`): ParametersPath599QuerySubjectid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath599QuerySubjectid]
  }
  
  extension [Self <: ParametersPath599QuerySubjectid](x: Self) {
    
    inline def setParameters(value: Path599QuerySubjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson416`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
