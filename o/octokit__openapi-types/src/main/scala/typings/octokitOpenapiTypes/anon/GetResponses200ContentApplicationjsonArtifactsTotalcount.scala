package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonArtifactsTotalcount extends StObject {
  
  /** Lists all artifacts for a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. */
  var get: Responses200ContentApplicationjsonArtifactsTotalcount
}
object GetResponses200ContentApplicationjsonArtifactsTotalcount {
  
  inline def apply(get: Responses200ContentApplicationjsonArtifactsTotalcount): GetResponses200ContentApplicationjsonArtifactsTotalcount = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonArtifactsTotalcount]
  }
  
  extension [Self <: GetResponses200ContentApplicationjsonArtifactsTotalcount](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjsonArtifactsTotalcount): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
