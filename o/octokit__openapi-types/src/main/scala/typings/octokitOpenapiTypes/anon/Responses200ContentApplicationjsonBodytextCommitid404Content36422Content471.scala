package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBodytextCommitid404Content36422Content471 extends StObject {
  
  var parameters: PathRepoReviewid
  
  var responses: `200ContentApplicationjsonBodytextCommitid404Content36422Content471`
}
object Responses200ContentApplicationjsonBodytextCommitid404Content36422Content471 {
  
  inline def apply(
    parameters: PathRepoReviewid,
    responses: `200ContentApplicationjsonBodytextCommitid404Content36422Content471`
  ): Responses200ContentApplicationjsonBodytextCommitid404Content36422Content471 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBodytextCommitid404Content36422Content471]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonBodytextCommitid404Content36422Content471] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBodytextCommitid404Content36422Content471`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
