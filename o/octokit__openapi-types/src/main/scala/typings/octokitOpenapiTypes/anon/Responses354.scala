package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses354 extends StObject {
  
  var parameters: PathOrgPackagename
  
  var responses: `354`
}
object Responses354 {
  
  inline def apply(parameters: PathOrgPackagename, responses: `354`): Responses354 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses354]
  }
  
  extension [Self <: Responses354](x: Self) {
    
    inline def setParameters(value: PathOrgPackagename): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `354`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
