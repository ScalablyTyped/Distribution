package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAssetid extends StObject {
  
  var parameters: PathAssetid
  
  var responses: `302404`
}
object ParametersPathAssetid {
  
  inline def apply(parameters: PathAssetid, responses: `302404`): ParametersPathAssetid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAssetid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAssetid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAssetid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `302404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
