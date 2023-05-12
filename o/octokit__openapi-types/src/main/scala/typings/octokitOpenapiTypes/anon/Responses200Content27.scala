package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content27 extends StObject {
  
  var parameters: PathGistidQueryPage
  
  var responses: `200Content27`
}
object Responses200Content27 {
  
  inline def apply(parameters: PathGistidQueryPage, responses: `200Content27`): Responses200Content27 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content27]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content27] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content27`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
