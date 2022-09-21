package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses410Content55 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var responses: `410Content55`
}
object Responses410Content55 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepo, responses: `410Content55`): Responses410Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses410Content55]
  }
  
  extension [Self <: Responses410Content55](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `410Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
