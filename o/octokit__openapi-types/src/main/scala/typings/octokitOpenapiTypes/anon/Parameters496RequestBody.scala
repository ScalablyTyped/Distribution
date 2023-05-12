package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters496RequestBody extends StObject {
  
  var parameters: `496`
  
  var requestBody: js.UndefOr[ContentApplicationjsonGithubownedallowed] = js.undefined
}
object Parameters496RequestBody {
  
  inline def apply(parameters: `496`): Parameters496RequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters496RequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters496RequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `496`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonGithubownedallowed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
