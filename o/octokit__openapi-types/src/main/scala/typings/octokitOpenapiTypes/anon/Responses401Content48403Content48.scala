package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401Content48403Content48 extends StObject {
  
  var parameters: PathOrgPackagename
  
  var responses: `401Content48403Content48`
}
object Responses401Content48403Content48 {
  
  inline def apply(parameters: PathOrgPackagename, responses: `401Content48403Content48`): Responses401Content48403Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401Content48403Content48]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses401Content48403Content48] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgPackagename): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content48403Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
