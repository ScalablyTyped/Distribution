package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuerySubjectid extends StObject {
  
  var parameters: QuerySubjectid
  
  var responses: `200Content382`
}
object ParametersQuerySubjectid {
  
  inline def apply(parameters: QuerySubjectid, responses: `200Content382`): ParametersQuerySubjectid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuerySubjectid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuerySubjectid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QuerySubjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content382`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
