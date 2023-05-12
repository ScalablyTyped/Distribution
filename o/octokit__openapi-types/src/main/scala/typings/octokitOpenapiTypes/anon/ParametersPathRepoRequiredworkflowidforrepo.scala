package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRequiredworkflowidforrepo extends StObject {
  
  var parameters: PathRepoRequiredworkflowidforrepo
  
  var responses: `200ContentApplicationjsonSourcerepository`
}
object ParametersPathRepoRequiredworkflowidforrepo {
  
  inline def apply(
    parameters: PathRepoRequiredworkflowidforrepo,
    responses: `200ContentApplicationjsonSourcerepository`
  ): ParametersPathRepoRequiredworkflowidforrepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRequiredworkflowidforrepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoRequiredworkflowidforrepo] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoRequiredworkflowidforrepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSourcerepository`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
