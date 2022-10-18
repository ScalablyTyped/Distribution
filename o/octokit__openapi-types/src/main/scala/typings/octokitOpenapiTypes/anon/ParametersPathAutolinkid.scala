package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAutolinkid extends StObject {
  
  var parameters: PathAutolinkid
  
  var responses: `20091`
}
object ParametersPathAutolinkid {
  
  inline def apply(parameters: PathAutolinkid, responses: `20091`): ParametersPathAutolinkid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAutolinkid]
  }
  
  extension [Self <: ParametersPathAutolinkid](x: Self) {
    
    inline def setParameters(value: PathAutolinkid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `20091`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
