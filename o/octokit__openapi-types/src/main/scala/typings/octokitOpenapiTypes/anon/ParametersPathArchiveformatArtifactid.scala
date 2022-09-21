package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathArchiveformatArtifactid extends StObject {
  
  var parameters: PathArchiveformatArtifactid
  
  var responses: `410Content55`
}
object ParametersPathArchiveformatArtifactid {
  
  inline def apply(parameters: PathArchiveformatArtifactid, responses: `410Content55`): ParametersPathArchiveformatArtifactid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathArchiveformatArtifactid]
  }
  
  extension [Self <: ParametersPathArchiveformatArtifactid](x: Self) {
    
    inline def setParameters(value: PathArchiveformatArtifactid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `410Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
