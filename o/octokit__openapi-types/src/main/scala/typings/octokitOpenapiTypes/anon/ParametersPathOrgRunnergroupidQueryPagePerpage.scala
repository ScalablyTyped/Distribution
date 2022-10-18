package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRunnergroupidQueryPagePerpage extends StObject {
  
  var parameters: PathOrgRunnergroupidQueryPagePerpage
  
  var responses: `39`
}
object ParametersPathOrgRunnergroupidQueryPagePerpage {
  
  inline def apply(parameters: PathOrgRunnergroupidQueryPagePerpage, responses: `39`): ParametersPathOrgRunnergroupidQueryPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRunnergroupidQueryPagePerpage]
  }
  
  extension [Self <: ParametersPathOrgRunnergroupidQueryPagePerpage](x: Self) {
    
    inline def setParameters(value: PathOrgRunnergroupidQueryPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `39`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
