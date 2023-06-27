package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters808 extends StObject {
  
  var parameters: `808`
  
  var responses: `200ContentApplicationjsonApplicationvndgithubv3starjson`
}
object Parameters808 {
  
  inline def apply(parameters: `808`, responses: `200ContentApplicationjsonApplicationvndgithubv3starjson`): Parameters808 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters808]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters808] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `808`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonApplicationvndgithubv3starjson`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
