package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutParametersPathRepoWorkflowidResponses extends StObject {
  
  /**
    * Enables a workflow and sets the `state` of the workflow to `active`. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  var put: ParametersPathRepoWorkflowidResponses
}
object PutParametersPathRepoWorkflowidResponses {
  
  inline def apply(put: ParametersPathRepoWorkflowidResponses): PutParametersPathRepoWorkflowidResponses = {
    val __obj = js.Dynamic.literal(put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutParametersPathRepoWorkflowidResponses]
  }
  
  extension [Self <: PutParametersPathRepoWorkflowidResponses](x: Self) {
    
    inline def setPut(value: ParametersPathRepoWorkflowidResponses): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
