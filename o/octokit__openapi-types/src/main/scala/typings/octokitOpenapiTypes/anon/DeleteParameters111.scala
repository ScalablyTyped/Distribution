package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters111 extends StObject {
  
  /**
    * Delete an organization migration archive
    * @description Deletes a previous migration archive. Migration archives are automatically deleted after seven days.
    */
  var delete: Parameters111
  
  /**
    * Download an organization migration archive
    * @description Fetches the URL to a migration archive.
    */
  var get: Parameters111
}
object DeleteParameters111 {
  
  inline def apply(delete: Parameters111, get: Parameters111): DeleteParameters111 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters111]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParameters111] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters111): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Parameters111): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
