package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201401403404422 extends StObject {
  
  var parameters: PathCodespacenameString
  
  var requestBody: ContentApplicationjsonNamePrivate
  
  var responses: `201401403404422`
}
object Responses201401403404422 {
  
  inline def apply(
    parameters: PathCodespacenameString,
    requestBody: ContentApplicationjsonNamePrivate,
    responses: `201401403404422`
  ): Responses201401403404422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201401403404422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201401403404422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCodespacenameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNamePrivate): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201401403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
