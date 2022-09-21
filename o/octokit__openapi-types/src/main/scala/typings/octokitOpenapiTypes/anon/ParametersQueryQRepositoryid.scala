package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryQRepositoryid extends StObject {
  
  var parameters: QueryQRepositoryid
  
  var responses: `200304403404422`
}
object ParametersQueryQRepositoryid {
  
  inline def apply(parameters: QueryQRepositoryid, responses: `200304403404422`): ParametersQueryQRepositoryid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryQRepositoryid]
  }
  
  extension [Self <: ParametersQueryQRepositoryid](x: Self) {
    
    inline def setParameters(value: QueryQRepositoryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
