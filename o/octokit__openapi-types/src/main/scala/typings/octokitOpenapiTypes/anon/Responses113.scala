package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses113 extends StObject {
  
  var parameters: PathOrgQuery
  
  var responses: `113`
}
object Responses113 {
  
  inline def apply(parameters: PathOrgQuery, responses: `113`): Responses113 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses113]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses113] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `113`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
