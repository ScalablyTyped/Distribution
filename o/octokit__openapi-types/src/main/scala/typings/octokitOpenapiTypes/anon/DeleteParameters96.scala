package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters96 extends StObject {
  
  /**
    * Delete an organization migration archive
    * @description Deletes a previous migration archive. Migration archives are automatically deleted after seven days.
    */
  var delete: Parameters96
  
  /**
    * Download an organization migration archive
    * @description Fetches the URL to a migration archive.
    */
  var get: Parameters96
}
object DeleteParameters96 {
  
  inline def apply(delete: Parameters96, get: Parameters96): DeleteParameters96 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters96]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParameters96] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters96): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Parameters96): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
