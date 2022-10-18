package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters303Responses extends StObject {
  
  var parameters: `303`
}
object Parameters303Responses {
  
  inline def apply(parameters: `303`): Parameters303Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters303Responses]
  }
  
  extension [Self <: Parameters303Responses](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
