package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMilestonenumberQueryPage extends StObject {
  
  var parameters: PathMilestonenumberQueryPage
  
  var responses: `163`
}
object ParametersPathMilestonenumberQueryPage {
  
  inline def apply(parameters: PathMilestonenumberQueryPage, responses: `163`): ParametersPathMilestonenumberQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMilestonenumberQueryPage]
  }
  
  extension [Self <: ParametersPathMilestonenumberQueryPage](x: Self) {
    
    inline def setParameters(value: PathMilestonenumberQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `163`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
