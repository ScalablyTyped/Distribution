package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathFileshaOwner extends StObject {
  
  var parameters: PathFileshaOwner
  
  var responses: `200ContentApplicationjsonHighlightedcontent`
}
object ParametersPathFileshaOwner {
  
  inline def apply(parameters: PathFileshaOwner, responses: `200ContentApplicationjsonHighlightedcontent`): ParametersPathFileshaOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathFileshaOwner]
  }
  
  extension [Self <: ParametersPathFileshaOwner](x: Self) {
    
    inline def setParameters(value: PathFileshaOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonHighlightedcontent`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
