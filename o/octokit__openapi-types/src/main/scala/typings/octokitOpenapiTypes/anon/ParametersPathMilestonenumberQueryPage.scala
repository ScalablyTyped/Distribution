package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMilestonenumberQueryPage extends StObject {
  
  var parameters: PathMilestonenumberQueryPage
  
  var responses: `300`
}
object ParametersPathMilestonenumberQueryPage {
  
  inline def apply(parameters: PathMilestonenumberQueryPage, responses: `300`): ParametersPathMilestonenumberQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMilestonenumberQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathMilestonenumberQueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMilestonenumberQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `300`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
