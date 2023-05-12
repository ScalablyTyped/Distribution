package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryExcludePage extends StObject {
  
  var parameters: QueryExcludePage
  
  var responses: `200Content518`
}
object ParametersQueryExcludePage {
  
  inline def apply(parameters: QueryExcludePage, responses: `200Content518`): ParametersQueryExcludePage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryExcludePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryExcludePage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryExcludePage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content518`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
