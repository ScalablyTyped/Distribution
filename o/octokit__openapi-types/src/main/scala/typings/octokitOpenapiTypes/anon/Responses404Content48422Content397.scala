package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content48422Content397 extends StObject {
  
  var parameters: PathTeamidNumber
  
  var responses: `404Content48422Content397`
}
object Responses404Content48422Content397 {
  
  inline def apply(parameters: PathTeamidNumber, responses: `404Content48422Content397`): Responses404Content48422Content397 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content48422Content397]
  }
  
  extension [Self <: Responses404Content48422Content397](x: Self) {
    
    inline def setParameters(value: PathTeamidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content48422Content397`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
