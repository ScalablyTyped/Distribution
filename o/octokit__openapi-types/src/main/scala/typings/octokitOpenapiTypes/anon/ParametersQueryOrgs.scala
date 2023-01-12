package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryOrgs extends StObject {
  
  var parameters: QueryOrgs
  
  var responses: `304404422`
}
object ParametersQueryOrgs {
  
  inline def apply(parameters: QueryOrgs, responses: `304404422`): ParametersQueryOrgs = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryOrgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryOrgs] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryOrgs): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
