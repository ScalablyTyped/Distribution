package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses526 extends StObject {
  
  var parameters: PathTeamslugStringQuery473
  
  var responses: `526`
}
object Responses526 {
  
  inline def apply(parameters: PathTeamslugStringQuery473, responses: `526`): Responses526 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses526]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses526] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslugStringQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `526`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
