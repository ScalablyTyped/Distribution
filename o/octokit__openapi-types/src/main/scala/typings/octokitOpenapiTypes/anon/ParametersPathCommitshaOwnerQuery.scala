package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommitshaOwnerQuery extends StObject {
  
  var parameters: PathCommitshaOwnerQuery
  
  var responses: `200Content677`
}
object ParametersPathCommitshaOwnerQuery {
  
  inline def apply(parameters: PathCommitshaOwnerQuery, responses: `200Content677`): ParametersPathCommitshaOwnerQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommitshaOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommitshaOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommitshaOwnerQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content677`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
