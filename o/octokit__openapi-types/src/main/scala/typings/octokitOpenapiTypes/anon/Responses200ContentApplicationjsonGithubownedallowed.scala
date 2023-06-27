package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonGithubownedallowed extends StObject {
  
  var parameters: `582`
  
  var responses: `200ContentApplicationjsonGithubownedallowed`
}
object Responses200ContentApplicationjsonGithubownedallowed {
  
  inline def apply(parameters: `582`, responses: `200ContentApplicationjsonGithubownedallowed`): Responses200ContentApplicationjsonGithubownedallowed = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonGithubownedallowed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonGithubownedallowed] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonGithubownedallowed`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
