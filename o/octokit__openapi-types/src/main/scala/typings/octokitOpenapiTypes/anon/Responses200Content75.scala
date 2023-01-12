package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content75 extends StObject {
  
  var parameters: PathOrg
  
  var responses: `200Content75`
}
object Responses200Content75 {
  
  inline def apply(parameters: PathOrg, responses: `200Content75`): Responses200Content75 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content75]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content75] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content75`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
