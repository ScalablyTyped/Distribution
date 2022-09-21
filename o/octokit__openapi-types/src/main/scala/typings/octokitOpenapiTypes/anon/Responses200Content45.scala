package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content45 extends StObject {
  
  var parameters: PathGistidQueryPage
  
  var responses: `200Content45`
}
object Responses200Content45 {
  
  inline def apply(parameters: PathGistidQueryPage, responses: `200Content45`): Responses200Content45 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content45]
  }
  
  extension [Self <: Responses200Content45](x: Self) {
    
    inline def setParameters(value: PathGistidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content45`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
