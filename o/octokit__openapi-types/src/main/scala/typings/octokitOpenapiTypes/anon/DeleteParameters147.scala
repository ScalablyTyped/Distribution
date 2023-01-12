package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters147 extends StObject {
  
  /**
    * Delete a specific workflow run. Anyone with write access to the repository can use this endpoint. If the repository is
    * private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:write` permission to use
    * this endpoint.
    */
  var delete: Parameters147
  
  /** Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. */
  var get: ParametersPathRunid
}
object DeleteParameters147 {
  
  inline def apply(delete: Parameters147, get: ParametersPathRunid): DeleteParameters147 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters147]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParameters147] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters147): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathRunid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
