package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathIssuenumberNameOwner extends StObject {
  
  /** Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a `404 Not Found` status if the label does not exist. */
  var delete: ParametersPathIssuenumberNameOwner
}
object DeleteParametersPathIssuenumberNameOwner {
  
  inline def apply(delete: ParametersPathIssuenumberNameOwner): DeleteParametersPathIssuenumberNameOwner = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathIssuenumberNameOwner]
  }
  
  extension [Self <: DeleteParametersPathIssuenumberNameOwner](x: Self) {
    
    inline def setDelete(value: ParametersPathIssuenumberNameOwner): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
