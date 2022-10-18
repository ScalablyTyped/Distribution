package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters418 extends StObject {
  
  /**
    * Delete a specific workflow run. Anyone with write access to the repository can use this endpoint. If the repository is
    * private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:write` permission to use
    * this endpoint.
    */
  var delete: Parameters418
  
  /** Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. */
  var get: ParametersPathRepoRunid
}
object DeleteParameters418 {
  
  inline def apply(delete: Parameters418, get: ParametersPathRepoRunid): DeleteParameters418 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters418]
  }
  
  extension [Self <: DeleteParameters418](x: Self) {
    
    inline def setDelete(value: Parameters418): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathRepoRunid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
