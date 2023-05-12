package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses521 extends StObject {
  
  var parameters: PathOrgStringQuery473
  
  var responses: `521`
}
object Responses521 {
  
  inline def apply(parameters: PathOrgStringQuery473, responses: `521`): Responses521 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses521]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses521] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgStringQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `521`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
