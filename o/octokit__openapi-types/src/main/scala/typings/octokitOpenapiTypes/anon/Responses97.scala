package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses97 extends StObject {
  
  var parameters: PathOrgQueryPage
  
  var responses: `97`
}
object Responses97 {
  
  inline def apply(parameters: PathOrgQueryPage, responses: `97`): Responses97 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses97]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses97] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `97`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
