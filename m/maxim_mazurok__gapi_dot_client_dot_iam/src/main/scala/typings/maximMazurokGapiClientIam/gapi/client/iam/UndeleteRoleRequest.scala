package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UndeleteRoleRequest extends StObject {
  
  /** Used to perform a consistent read-modify-write. */
  var etag: js.UndefOr[String] = js.undefined
}
object UndeleteRoleRequest {
  
  inline def apply(): UndeleteRoleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeleteRoleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UndeleteRoleRequest] (val x: Self) extends AnyVal {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
  }
}
