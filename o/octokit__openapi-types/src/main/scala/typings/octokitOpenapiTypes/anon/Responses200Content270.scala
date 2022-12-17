package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content270 extends StObject {
  
  var parameters: PathIssuenumberQueryPage
  
  var responses: `200Content270`
}
object Responses200Content270 {
  
  inline def apply(parameters: PathIssuenumberQueryPage, responses: `200Content270`): Responses200Content270 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content270]
  }
  
  extension [Self <: Responses200Content270](x: Self) {
    
    inline def setParameters(value: PathIssuenumberQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content270`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
