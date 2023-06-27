package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters639Responses extends StObject {
  
  var parameters: `639`
}
object Parameters639Responses {
  
  inline def apply(parameters: `639`): Parameters639Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters639Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters639Responses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
