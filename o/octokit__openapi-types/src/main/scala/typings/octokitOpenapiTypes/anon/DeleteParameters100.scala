package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters100 extends StObject {
  
  /** Deletes a previous migration archive. Migration archives are automatically deleted after seven days. */
  var delete: Parameters100
  
  /** Fetches the URL to a migration archive. */
  var get: Parameters100
}
object DeleteParameters100 {
  
  inline def apply(delete: Parameters100, get: Parameters100): DeleteParameters100 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters100]
  }
  
  extension [Self <: DeleteParameters100](x: Self) {
    
    inline def setDelete(value: Parameters100): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Parameters100): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
