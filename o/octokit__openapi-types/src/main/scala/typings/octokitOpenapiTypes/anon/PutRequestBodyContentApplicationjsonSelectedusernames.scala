package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRequestBodyContentApplicationjsonSelectedusernames extends StObject {
  
  /**
    * Manage access control for organization codespaces
    * @description Sets which users can access codespaces in an organization. This is synonymous with granting or revoking codespaces billing permissions for users according to the visibility.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var put: RequestBodyContentApplicationjsonSelectedusernames
}
object PutRequestBodyContentApplicationjsonSelectedusernames {
  
  inline def apply(put: RequestBodyContentApplicationjsonSelectedusernames): PutRequestBodyContentApplicationjsonSelectedusernames = {
    val __obj = js.Dynamic.literal(put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRequestBodyContentApplicationjsonSelectedusernames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRequestBodyContentApplicationjsonSelectedusernames] (val x: Self) extends AnyVal {
    
    inline def setPut(value: RequestBodyContentApplicationjsonSelectedusernames): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
