package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses268 extends StObject {
  
  var parameters: PathIssuenumber
  
  var responses: `268`
}
object Responses268 {
  
  inline def apply(parameters: PathIssuenumber, responses: `268`): Responses268 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses268]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses268] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `268`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
