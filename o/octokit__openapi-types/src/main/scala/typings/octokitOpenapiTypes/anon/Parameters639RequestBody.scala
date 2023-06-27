package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters639RequestBody extends StObject {
  
  var parameters: `639`
  
  var requestBody: js.UndefOr[ContentApplicationjsonGithubownedallowed] = js.undefined
}
object Parameters639RequestBody {
  
  inline def apply(parameters: `639`): Parameters639RequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters639RequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters639RequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonGithubownedallowed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
