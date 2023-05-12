package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAttemptnumberOwner extends StObject {
  
  var parameters: PathAttemptnumberOwner
  
  var responses: `200ContentApplicationjsonHeadrepositoryid`
}
object ParametersPathAttemptnumberOwner {
  
  inline def apply(parameters: PathAttemptnumberOwner, responses: `200ContentApplicationjsonHeadrepositoryid`): ParametersPathAttemptnumberOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAttemptnumberOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAttemptnumberOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAttemptnumberOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonHeadrepositoryid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
