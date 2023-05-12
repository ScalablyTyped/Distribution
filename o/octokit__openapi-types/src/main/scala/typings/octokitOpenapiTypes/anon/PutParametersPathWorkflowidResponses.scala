package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutParametersPathWorkflowidResponses extends StObject {
  
  /**
    * Enable a workflow
    * @description Enables a workflow and sets the `state` of the workflow to `active`. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  var put: ParametersPathWorkflowidResponses
}
object PutParametersPathWorkflowidResponses {
  
  inline def apply(put: ParametersPathWorkflowidResponses): PutParametersPathWorkflowidResponses = {
    val __obj = js.Dynamic.literal(put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutParametersPathWorkflowidResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutParametersPathWorkflowidResponses] (val x: Self) extends AnyVal {
    
    inline def setPut(value: ParametersPathWorkflowidResponses): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
