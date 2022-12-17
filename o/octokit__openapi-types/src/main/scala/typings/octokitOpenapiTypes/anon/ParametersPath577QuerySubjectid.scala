package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath577QuerySubjectid extends StObject {
  
  var parameters: Path577QuerySubjectid
  
  var responses: `200ContentApplicationjson393`
}
object ParametersPath577QuerySubjectid {
  
  inline def apply(parameters: Path577QuerySubjectid, responses: `200ContentApplicationjson393`): ParametersPath577QuerySubjectid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath577QuerySubjectid]
  }
  
  extension [Self <: ParametersPath577QuerySubjectid](x: Self) {
    
    inline def setParameters(value: Path577QuerySubjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson393`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
