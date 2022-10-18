package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content113 extends StObject {
  
  var parameters: PathCommitshaOwnerQueryPage
  
  var responses: `200Content113`
}
object Responses200Content113 {
  
  inline def apply(parameters: PathCommitshaOwnerQueryPage, responses: `200Content113`): Responses200Content113 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content113]
  }
  
  extension [Self <: Responses200Content113](x: Self) {
    
    inline def setParameters(value: PathCommitshaOwnerQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content113`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
