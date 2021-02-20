package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndeleteRoleRequest extends StObject {
  
  /** Used to perform a consistent read-modify-write. */
  var etag: js.UndefOr[String] = js.native
}
object UndeleteRoleRequest {
  
  @scala.inline
  def apply(): UndeleteRoleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeleteRoleRequest]
  }
  
  @scala.inline
  implicit class UndeleteRoleRequestMutableBuilder[Self <: UndeleteRoleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
  }
}
