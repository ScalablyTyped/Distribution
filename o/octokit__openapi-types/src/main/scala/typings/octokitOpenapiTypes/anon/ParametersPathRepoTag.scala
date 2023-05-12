package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoTag extends StObject {
  
  var parameters: PathRepoTag
  
  var responses: `200621404Content36`
}
object ParametersPathRepoTag {
  
  inline def apply(parameters: PathRepoTag, responses: `200621404Content36`): ParametersPathRepoTag = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoTag] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoTag): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200621404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
