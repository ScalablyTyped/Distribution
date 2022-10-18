package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryArchivedstatePage extends StObject {
  
  var parameters: QueryArchivedstatePage
  
  var responses: `200Content388`
}
object ParametersQueryArchivedstatePage {
  
  inline def apply(parameters: QueryArchivedstatePage, responses: `200Content388`): ParametersQueryArchivedstatePage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryArchivedstatePage]
  }
  
  extension [Self <: ParametersQueryArchivedstatePage](x: Self) {
    
    inline def setParameters(value: QueryArchivedstatePage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content388`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
