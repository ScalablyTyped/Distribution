package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses99 extends StObject {
  
  var parameters: PathPackagename
  
  var responses: `99`
}
object Responses99 {
  
  inline def apply(parameters: PathPackagename, responses: `99`): Responses99 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses99]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses99] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagename): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `99`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
