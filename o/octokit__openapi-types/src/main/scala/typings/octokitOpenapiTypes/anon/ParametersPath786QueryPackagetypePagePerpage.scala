package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath786QueryPackagetypePagePerpage extends StObject {
  
  var parameters: Path786QueryPackagetypePagePerpage
  
  var responses: `200400401`
}
object ParametersPath786QueryPackagetypePagePerpage {
  
  inline def apply(parameters: Path786QueryPackagetypePagePerpage, responses: `200400401`): ParametersPath786QueryPackagetypePagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath786QueryPackagetypePagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath786QueryPackagetypePagePerpage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path786QueryPackagetypePagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200400401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
