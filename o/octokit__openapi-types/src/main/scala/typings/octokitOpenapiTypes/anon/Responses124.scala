package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses124 extends StObject {
  
  var parameters: PathTeamslugQueryPage
  
  var responses: `124`
}
object Responses124 {
  
  inline def apply(parameters: PathTeamslugQueryPage, responses: `124`): Responses124 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses124]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses124] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslugQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `124`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
