package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRequestBody extends StObject {
  
  var parameters: PathRepo
  
  var requestBody: js.UndefOr[ContentApplicationjson128] = js.undefined
}
object ParametersPathRepoRequestBody {
  
  inline def apply(parameters: PathRepo): ParametersPathRepoRequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoRequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson128): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
