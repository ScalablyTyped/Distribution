package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters480 extends StObject {
  
  var parameters: `480`
  
  var responses: `200ContentApplicationvndgithubv3starjson`
}
object Parameters480 {
  
  inline def apply(parameters: `480`, responses: `200ContentApplicationvndgithubv3starjson`): Parameters480 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters480]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters480] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `480`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationvndgithubv3starjson`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
