package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content48 extends StObject {
  
  var parameters: PathInstallationidNumber
  
  var responses: `404Content48`
}
object Responses404Content48 {
  
  inline def apply(parameters: PathInstallationidNumber, responses: `404Content48`): Responses404Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content48]
  }
  
  extension [Self <: Responses404Content48](x: Self) {
    
    inline def setParameters(value: PathInstallationidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
