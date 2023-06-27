package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathArchiveformatArtifactid extends StObject {
  
  var parameters: PathArchiveformatArtifactid
  
  var responses: `410Content41`
}
object ParametersPathArchiveformatArtifactid {
  
  inline def apply(parameters: PathArchiveformatArtifactid, responses: `410Content41`): ParametersPathArchiveformatArtifactid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathArchiveformatArtifactid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathArchiveformatArtifactid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathArchiveformatArtifactid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `410Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
