package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses6 extends StObject {
  
  var parameters: PathInstallationid
  
  var responses: `6`
}
object Responses6 {
  
  inline def apply(parameters: PathInstallationid, responses: `6`): Responses6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses6]
  }
  
  extension [Self <: Responses6](x: Self) {
    
    inline def setParameters(value: PathInstallationid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
