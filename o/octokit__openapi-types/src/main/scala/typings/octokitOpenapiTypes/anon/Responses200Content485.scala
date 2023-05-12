package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content485 extends StObject {
  
  var parameters: PathGistidStringQuery473
  
  var responses: `200Content485`
}
object Responses200Content485 {
  
  inline def apply(parameters: PathGistidStringQuery473, responses: `200Content485`): Responses200Content485 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content485]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content485] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistidStringQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content485`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
