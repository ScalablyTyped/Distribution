package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content119404 extends StObject {
  
  var parameters: PathTeamidQueryPage
  
  var responses: `200Content119404`
}
object Responses200Content119404 {
  
  inline def apply(parameters: PathTeamidQueryPage, responses: `200Content119404`): Responses200Content119404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content119404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content119404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content119404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
