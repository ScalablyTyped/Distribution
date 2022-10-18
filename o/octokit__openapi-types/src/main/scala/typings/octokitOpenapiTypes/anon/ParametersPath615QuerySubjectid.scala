package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath615QuerySubjectid extends StObject {
  
  var parameters: Path615QuerySubjectid
  
  var responses: `200Content655`
}
object ParametersPath615QuerySubjectid {
  
  inline def apply(parameters: Path615QuerySubjectid, responses: `200Content655`): ParametersPath615QuerySubjectid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath615QuerySubjectid]
  }
  
  extension [Self <: ParametersPath615QuerySubjectid](x: Self) {
    
    inline def setParameters(value: Path615QuerySubjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content655`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
