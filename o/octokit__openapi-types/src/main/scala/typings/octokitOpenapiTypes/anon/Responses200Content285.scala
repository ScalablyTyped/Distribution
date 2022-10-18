package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content285 extends StObject {
  
  var parameters: PathLicenseString
  
  var responses: `200Content285`
}
object Responses200Content285 {
  
  inline def apply(parameters: PathLicenseString, responses: `200Content285`): Responses200Content285 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content285]
  }
  
  extension [Self <: Responses200Content285](x: Self) {
    
    inline def setParameters(value: PathLicenseString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content285`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
