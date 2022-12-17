package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathRunnerid extends StObject {
  
  /**
    * Removes a self-hosted runner from a group configured in an enterprise. The runner is then returned to the default group.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var delete: ParametersPathRunnerid
  
  /**
    * Adds a self-hosted runner to a runner group configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise`
    * scope to use this endpoint.
    */
  var put: ParametersPathRunnerid
}
object DeleteParametersPathRunnerid {
  
  inline def apply(delete: ParametersPathRunnerid, put: ParametersPathRunnerid): DeleteParametersPathRunnerid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathRunnerid]
  }
  
  extension [Self <: DeleteParametersPathRunnerid](x: Self) {
    
    inline def setDelete(value: ParametersPathRunnerid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathRunnerid): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
