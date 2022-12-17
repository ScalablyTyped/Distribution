package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters92 extends StObject {
  
  /** Deletes a previous migration archive. Migration archives are automatically deleted after seven days. */
  var delete: Parameters92
  
  /** Fetches the URL to a migration archive. */
  var get: Parameters92
}
object DeleteParameters92 {
  
  inline def apply(delete: Parameters92, get: Parameters92): DeleteParameters92 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters92]
  }
  
  extension [Self <: DeleteParameters92](x: Self) {
    
    inline def setDelete(value: Parameters92): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Parameters92): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
