package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath649QueryPackagetypePagePerpage extends StObject {
  
  var parameters: Path649QueryPackagetypePagePerpage
  
  var responses: `200400401`
}
object ParametersPath649QueryPackagetypePagePerpage {
  
  inline def apply(parameters: Path649QueryPackagetypePagePerpage, responses: `200400401`): ParametersPath649QueryPackagetypePagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath649QueryPackagetypePagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath649QueryPackagetypePagePerpage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path649QueryPackagetypePagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200400401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
