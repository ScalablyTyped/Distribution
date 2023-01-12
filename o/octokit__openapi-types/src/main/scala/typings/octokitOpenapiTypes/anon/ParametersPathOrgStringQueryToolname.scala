package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringQueryToolname extends StObject {
  
  var parameters: PathOrgStringQueryToolname
  
  var responses: `200Content414`
}
object ParametersPathOrgStringQueryToolname {
  
  inline def apply(parameters: PathOrgStringQueryToolname, responses: `200Content414`): ParametersPathOrgStringQueryToolname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringQueryToolname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgStringQueryToolname] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgStringQueryToolname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content414`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
