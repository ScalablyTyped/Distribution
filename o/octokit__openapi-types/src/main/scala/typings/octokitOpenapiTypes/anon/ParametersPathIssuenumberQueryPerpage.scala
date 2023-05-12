package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberQueryPerpage extends StObject {
  
  var parameters: PathIssuenumberQueryPerpage
  
  var responses: `200404410`
}
object ParametersPathIssuenumberQueryPerpage {
  
  inline def apply(parameters: PathIssuenumberQueryPerpage, responses: `200404410`): ParametersPathIssuenumberQueryPerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberQueryPerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumberQueryPerpage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberQueryPerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
