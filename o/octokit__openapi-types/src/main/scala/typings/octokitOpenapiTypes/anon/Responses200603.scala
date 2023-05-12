package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200603 extends StObject {
  
  var parameters: PathNameStringOwnerString
  
  var responses: `200603`
}
object Responses200603 {
  
  inline def apply(parameters: PathNameStringOwnerString, responses: `200603`): Responses200603 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200603]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200603] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameStringOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200603`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
