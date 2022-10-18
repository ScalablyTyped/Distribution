package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200126 extends StObject {
  
  var parameters: PathCommitshaOwner
  
  var responses: `200126`
}
object Responses200126 {
  
  inline def apply(parameters: PathCommitshaOwner, responses: `200126`): Responses200126 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200126]
  }
  
  extension [Self <: Responses200126](x: Self) {
    
    inline def setParameters(value: PathCommitshaOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200126`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
