package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content6 extends StObject {
  
  var parameters: PathInstallationid
  
  var responses: `404Content6`
}
object Responses404Content6 {
  
  inline def apply(parameters: PathInstallationid, responses: `404Content6`): Responses404Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content6]
  }
  
  extension [Self <: Responses404Content6](x: Self) {
    
    inline def setParameters(value: PathInstallationid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
