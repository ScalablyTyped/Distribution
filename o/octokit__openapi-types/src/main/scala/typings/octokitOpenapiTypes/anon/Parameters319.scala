package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters319 extends StObject {
  
  var parameters: `319`
  
  var responses: `301404422`
}
object Parameters319 {
  
  inline def apply(parameters: `319`, responses: `301404422`): Parameters319 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters319]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters319] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `319`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `301404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
