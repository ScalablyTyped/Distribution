package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses275 extends StObject {
  
  var parameters: Path273
  
  var responses: `275`
}
object Responses275 {
  
  inline def apply(parameters: Path273, responses: `275`): Responses275 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses275]
  }
  
  extension [Self <: Responses275](x: Self) {
    
    inline def setParameters(value: Path273): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `275`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
