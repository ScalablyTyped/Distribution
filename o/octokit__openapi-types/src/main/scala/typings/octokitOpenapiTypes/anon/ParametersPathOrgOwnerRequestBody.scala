package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgOwnerRequestBody extends StObject {
  
  var parameters: PathOrgOwner
  
  var requestBody: js.UndefOr[ContentApplicationjson128] = js.undefined
}
object ParametersPathOrgOwnerRequestBody {
  
  inline def apply(parameters: PathOrgOwner): ParametersPathOrgOwnerRequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgOwnerRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgOwnerRequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson128): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
