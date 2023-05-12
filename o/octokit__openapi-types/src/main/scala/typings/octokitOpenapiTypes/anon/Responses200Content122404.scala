package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content122404 extends StObject {
  
  var parameters: PathTeamidUsername
  
  var responses: `200Content122404`
}
object Responses200Content122404 {
  
  inline def apply(parameters: PathTeamidUsername, responses: `200Content122404`): Responses200Content122404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content122404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content122404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content122404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
