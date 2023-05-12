package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryRefSarifid extends StObject {
  
  var parameters: QueryRefSarifid
  
  var responses: `200Content563`
}
object ParametersQueryRefSarifid {
  
  inline def apply(parameters: QueryRefSarifid, responses: `200Content563`): ParametersQueryRefSarifid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryRefSarifid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryRefSarifid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryRefSarifid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content563`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
