package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath649QuerySubjectid extends StObject {
  
  var parameters: Path649QuerySubjectid
  
  var responses: `200ContentApplicationjson445`
}
object ParametersPath649QuerySubjectid {
  
  inline def apply(parameters: Path649QuerySubjectid, responses: `200ContentApplicationjson445`): ParametersPath649QuerySubjectid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath649QuerySubjectid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath649QuerySubjectid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path649QuerySubjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson445`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
