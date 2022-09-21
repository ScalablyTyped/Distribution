package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200534 extends StObject {
  
  var parameters: PathCommitshaOwner
  
  var responses: `200534`
}
object Responses200534 {
  
  inline def apply(parameters: PathCommitshaOwner, responses: `200534`): Responses200534 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200534]
  }
  
  extension [Self <: Responses200534](x: Self) {
    
    inline def setParameters(value: PathCommitshaOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200534`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
