package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403404422500 extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `403404422500`
}
object Responses403404422500 {
  
  inline def apply(parameters: PathOrgString, responses: `403404422500`): Responses403404422500 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403404422500]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403404422500] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404422500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
