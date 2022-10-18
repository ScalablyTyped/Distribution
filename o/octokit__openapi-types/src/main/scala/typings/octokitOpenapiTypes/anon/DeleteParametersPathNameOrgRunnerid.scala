package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathNameOrgRunnerid extends StObject {
  
  /**
    * Remove a custom label from a self-hosted runner configured
    * in an organization. Returns the remaining labels from the runner.
    *
    * This endpoint returns a `404 Not Found` status if the custom label is not
    * present on the runner.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var delete: ParametersPathNameOrgRunnerid
}
object DeleteParametersPathNameOrgRunnerid {
  
  inline def apply(delete: ParametersPathNameOrgRunnerid): DeleteParametersPathNameOrgRunnerid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathNameOrgRunnerid]
  }
  
  extension [Self <: DeleteParametersPathNameOrgRunnerid](x: Self) {
    
    inline def setDelete(value: ParametersPathNameOrgRunnerid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
