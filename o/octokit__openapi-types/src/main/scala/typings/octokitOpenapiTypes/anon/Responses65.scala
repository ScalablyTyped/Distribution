package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses65 extends StObject {
  
  var parameters: QueryPagePerpage
  
  var responses: `65`
}
object Responses65 {
  
  inline def apply(parameters: QueryPagePerpage, responses: `65`): Responses65 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses65]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses65] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `65`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
