package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content30 extends StObject {
  
  var parameters: PathGistidQuery
  
  var responses: `200Content30`
}
object Responses200Content30 {
  
  inline def apply(parameters: PathGistidQuery, responses: `200Content30`): Responses200Content30 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content30]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content30] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content30`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
