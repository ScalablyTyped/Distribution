package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathCodespacename extends StObject {
  
  /**
    * Delete a codespace from the organization
    * @description Deletes a user's codespace.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var delete: ParametersPathCodespacename
}
object DeleteParametersPathCodespacename {
  
  inline def apply(delete: ParametersPathCodespacename): DeleteParametersPathCodespacename = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathCodespacename]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathCodespacename] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathCodespacename): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
