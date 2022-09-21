package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200422500 extends StObject {
  
  var parameters: PathPullnumberQueryPage
  
  var responses: `200422500`
}
object Responses200422500 {
  
  inline def apply(parameters: PathPullnumberQueryPage, responses: `200422500`): Responses200422500 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200422500]
  }
  
  extension [Self <: Responses200422500](x: Self) {
    
    inline def setParameters(value: PathPullnumberQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200422500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
