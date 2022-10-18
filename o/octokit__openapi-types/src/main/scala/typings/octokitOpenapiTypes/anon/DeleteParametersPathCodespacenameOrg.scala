package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathCodespacenameOrg extends StObject {
  
  /**
    * Deletes a user's codespace.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var delete: ParametersPathCodespacenameOrg
}
object DeleteParametersPathCodespacenameOrg {
  
  inline def apply(delete: ParametersPathCodespacenameOrg): DeleteParametersPathCodespacenameOrg = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathCodespacenameOrg]
  }
  
  extension [Self <: DeleteParametersPathCodespacenameOrg](x: Self) {
    
    inline def setDelete(value: ParametersPathCodespacenameOrg): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
