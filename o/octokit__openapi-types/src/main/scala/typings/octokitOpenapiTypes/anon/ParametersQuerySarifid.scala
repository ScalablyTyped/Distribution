package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuerySarifid extends StObject {
  
  var parameters: QuerySarifid
  
  var responses: `200Content192`
}
object ParametersQuerySarifid {
  
  inline def apply(parameters: QuerySarifid, responses: `200Content192`): ParametersQuerySarifid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuerySarifid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuerySarifid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QuerySarifid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content192`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
