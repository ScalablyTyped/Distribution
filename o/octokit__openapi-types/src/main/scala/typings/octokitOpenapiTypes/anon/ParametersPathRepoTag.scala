package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoTag extends StObject {
  
  var parameters: PathRepoTag
  
  var responses: `200572404Content55`
}
object ParametersPathRepoTag {
  
  inline def apply(parameters: PathRepoTag, responses: `200572404Content55`): ParametersPathRepoTag = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoTag]
  }
  
  extension [Self <: ParametersPathRepoTag](x: Self) {
    
    inline def setParameters(value: PathRepoTag): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200572404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
