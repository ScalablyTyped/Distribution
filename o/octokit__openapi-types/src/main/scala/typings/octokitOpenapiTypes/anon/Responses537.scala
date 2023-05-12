package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses537 extends StObject {
  
  var parameters: PathTeamslugStringQuery473
  
  var responses: `537`
}
object Responses537 {
  
  inline def apply(parameters: PathTeamslugStringQuery473, responses: `537`): Responses537 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses537]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses537] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslugStringQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `537`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
