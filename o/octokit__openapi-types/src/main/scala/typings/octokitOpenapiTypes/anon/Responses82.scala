package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses82 extends StObject {
  
  var parameters: PathTeamid
  
  var responses: `82`
}
object Responses82 {
  
  inline def apply(parameters: PathTeamid, responses: `82`): Responses82 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses82]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses82] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `82`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
