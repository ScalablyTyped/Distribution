package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content91 extends StObject {
  
  var parameters: PathOrgQuery
  
  var responses: `200Content91`
}
object Responses200Content91 {
  
  inline def apply(parameters: PathOrgQuery, responses: `200Content91`): Responses200Content91 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content91]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content91] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content91`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
