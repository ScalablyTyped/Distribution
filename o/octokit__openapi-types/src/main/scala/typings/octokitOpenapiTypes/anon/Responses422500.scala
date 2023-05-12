package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses422500 extends StObject {
  
  var parameters: PathOrg
  
  var responses: `422500`
}
object Responses422500 {
  
  inline def apply(parameters: PathOrg, responses: `422500`): Responses422500 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses422500]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses422500] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
