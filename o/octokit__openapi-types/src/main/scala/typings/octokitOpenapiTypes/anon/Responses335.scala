package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses335 extends StObject {
  
  var parameters: PathIssuenumber
  
  var responses: `335`
}
object Responses335 {
  
  inline def apply(parameters: PathIssuenumber, responses: `335`): Responses335 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses335]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses335] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `335`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
