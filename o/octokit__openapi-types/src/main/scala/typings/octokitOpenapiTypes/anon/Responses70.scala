package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses70 extends StObject {
  
  var parameters: PathOrgRunnerid
  
  var responses: `70`
}
object Responses70 {
  
  inline def apply(parameters: PathOrgRunnerid, responses: `70`): Responses70 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses70]
  }
  
  extension [Self <: Responses70](x: Self) {
    
    inline def setParameters(value: PathOrgRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `70`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
