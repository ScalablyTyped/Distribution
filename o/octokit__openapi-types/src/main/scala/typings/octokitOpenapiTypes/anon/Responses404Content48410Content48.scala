package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content48410Content48 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var requestBody: Content269
  
  var responses: `404Content48410Content48`
}
object Responses404Content48410Content48 {
  
  inline def apply(
    parameters: PathIssuenumberOwnerRepo,
    requestBody: Content269,
    responses: `404Content48410Content48`
  ): Responses404Content48410Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content48410Content48]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses404Content48410Content48] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content269): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content48410Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
