package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses283 extends StObject {
  
  var parameters: PathIssuenumber
  
  var responses: `283`
}
object Responses283 {
  
  inline def apply(parameters: PathIssuenumber, responses: `283`): Responses283 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses283]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses283] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `283`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
