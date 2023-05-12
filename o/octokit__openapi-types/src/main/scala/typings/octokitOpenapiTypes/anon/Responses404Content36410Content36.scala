package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content36410Content36 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var requestBody: js.UndefOr[Content284] = js.undefined
  
  var responses: `404Content36410Content36`
}
object Responses404Content36410Content36 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepo, responses: `404Content36410Content36`): Responses404Content36410Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content36410Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses404Content36410Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content284): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `404Content36410Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
