package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters extends StObject {
  
  var parameters: Path
  
  var responses: `201`
}
object Parameters {
  
  inline def apply(parameters: Path, responses: `201`): Parameters = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
