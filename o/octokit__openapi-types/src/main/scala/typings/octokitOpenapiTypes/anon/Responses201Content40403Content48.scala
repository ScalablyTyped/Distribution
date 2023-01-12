package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content40403Content48 extends StObject {
  
  var parameters: PathJobidOwner
  
  var requestBody: Content143
  
  var responses: `201Content40403Content48`
}
object Responses201Content40403Content48 {
  
  inline def apply(parameters: PathJobidOwner, requestBody: Content143, responses: `201Content40403Content48`): Responses201Content40403Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content40403Content48]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201Content40403Content48] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathJobidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content143): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content40403Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
