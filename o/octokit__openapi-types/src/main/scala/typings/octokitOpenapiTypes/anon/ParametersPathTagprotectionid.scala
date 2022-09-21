package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTagprotectionid extends StObject {
  
  var parameters: PathTagprotectionid
  
  var responses: `96`
}
object ParametersPathTagprotectionid {
  
  inline def apply(parameters: PathTagprotectionid, responses: `96`): ParametersPathTagprotectionid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTagprotectionid]
  }
  
  extension [Self <: ParametersPathTagprotectionid](x: Self) {
    
    inline def setParameters(value: PathTagprotectionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `96`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
