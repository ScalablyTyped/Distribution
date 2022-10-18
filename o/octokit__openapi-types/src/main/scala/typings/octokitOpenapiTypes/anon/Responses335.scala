package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses335 extends StObject {
  
  var parameters: `303`
  
  var responses: `335`
}
object Responses335 {
  
  inline def apply(parameters: `303`, responses: `335`): Responses335 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses335]
  }
  
  extension [Self <: Responses335](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `335`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
