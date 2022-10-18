package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonSinglefile extends StObject {
  
  var parameters: PathEnterprise
  
  var responses: `201ContentApplicationjsonSinglefile`
}
object Responses201ContentApplicationjsonSinglefile {
  
  inline def apply(parameters: PathEnterprise, responses: `201ContentApplicationjsonSinglefile`): Responses201ContentApplicationjsonSinglefile = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonSinglefile]
  }
  
  extension [Self <: Responses201ContentApplicationjsonSinglefile](x: Self) {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonSinglefile`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
