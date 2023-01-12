package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTagprotectionid extends StObject {
  
  var parameters: PathTagprotectionid
  
  var responses: `88`
}
object ParametersPathTagprotectionid {
  
  inline def apply(parameters: PathTagprotectionid, responses: `88`): ParametersPathTagprotectionid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTagprotectionid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTagprotectionid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTagprotectionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `88`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
