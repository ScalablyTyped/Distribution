package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters348 extends StObject {
  
  /** Deletes a previous migration archive. Migration archives are automatically deleted after seven days. */
  var delete: Parameters348
  
  /** Fetches the URL to a migration archive. */
  var get: Parameters348
}
object DeleteParameters348 {
  
  inline def apply(delete: Parameters348, get: Parameters348): DeleteParameters348 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters348]
  }
  
  extension [Self <: DeleteParameters348](x: Self) {
    
    inline def setDelete(value: Parameters348): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Parameters348): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
