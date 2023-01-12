package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses94 extends StObject {
  
  var parameters: PathOrg
  
  var responses: `94`
}
object Responses94 {
  
  inline def apply(parameters: PathOrg, responses: `94`): Responses94 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses94]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses94] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `94`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
