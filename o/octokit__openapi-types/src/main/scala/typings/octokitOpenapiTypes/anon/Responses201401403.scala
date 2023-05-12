package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201401403 extends StObject {
  
  var parameters: PathInstallationidNumber
  
  var requestBody: js.UndefOr[ContentApplicationjsonRepositoryids] = js.undefined
  
  var responses: `201401403`
}
object Responses201401403 {
  
  inline def apply(parameters: PathInstallationidNumber, responses: `201401403`): Responses201401403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201401403]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201401403] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInstallationidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `201401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
