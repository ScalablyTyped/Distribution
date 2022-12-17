package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathIssuenumberName extends StObject {
  
  /** Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a `404 Not Found` status if the label does not exist. */
  var delete: ParametersPathIssuenumberName
}
object DeleteParametersPathIssuenumberName {
  
  inline def apply(delete: ParametersPathIssuenumberName): DeleteParametersPathIssuenumberName = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathIssuenumberName]
  }
  
  extension [Self <: DeleteParametersPathIssuenumberName](x: Self) {
    
    inline def setDelete(value: ParametersPathIssuenumberName): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
