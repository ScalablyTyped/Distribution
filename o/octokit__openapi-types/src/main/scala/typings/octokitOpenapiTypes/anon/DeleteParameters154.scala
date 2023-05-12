package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters154 extends StObject {
  
  /**
    * Delete a workflow run
    * @description Delete a specific workflow run. Anyone with write access to the repository can use this endpoint. If the repository is
    * private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:write` permission to use
    * this endpoint.
    */
  var delete: Parameters154
  
  /**
    * Get a workflow run
    * @description Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersPathRunid
}
object DeleteParameters154 {
  
  inline def apply(delete: Parameters154, get: ParametersPathRunid): DeleteParameters154 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters154]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParameters154] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters154): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathRunid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
