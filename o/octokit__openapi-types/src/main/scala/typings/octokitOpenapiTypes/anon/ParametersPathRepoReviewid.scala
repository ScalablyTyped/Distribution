package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoReviewid extends StObject {
  
  var parameters: PathRepoReviewid
  
  var responses: `200ContentApplicationjsonBodytextCommitid404Content41`
}
object ParametersPathRepoReviewid {
  
  inline def apply(parameters: PathRepoReviewid, responses: `200ContentApplicationjsonBodytextCommitid404Content41`): ParametersPathRepoReviewid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoReviewid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoReviewid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBodytextCommitid404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
