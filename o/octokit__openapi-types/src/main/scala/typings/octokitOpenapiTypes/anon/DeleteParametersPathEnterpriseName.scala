package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathEnterpriseName extends StObject {
  
  /**
    * Remove a custom label from a self-hosted runner configured
    * in an enterprise. Returns the remaining labels from the runner.
    *
    * This endpoint returns a `404 Not Found` status if the custom label is not
    * present on the runner.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var delete: ParametersPathEnterpriseName
}
object DeleteParametersPathEnterpriseName {
  
  inline def apply(delete: ParametersPathEnterpriseName): DeleteParametersPathEnterpriseName = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathEnterpriseName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathEnterpriseName] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathEnterpriseName): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
