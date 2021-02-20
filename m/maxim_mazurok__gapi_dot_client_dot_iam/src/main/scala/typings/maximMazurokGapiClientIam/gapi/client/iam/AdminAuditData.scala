package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminAuditData extends StObject {
  
  /** The permission_delta when when creating or updating a Role. */
  var permissionDelta: js.UndefOr[PermissionDelta] = js.native
}
object AdminAuditData {
  
  @scala.inline
  def apply(): AdminAuditData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminAuditData]
  }
  
  @scala.inline
  implicit class AdminAuditDataMutableBuilder[Self <: AdminAuditData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissionDelta(value: PermissionDelta): Self = StObject.set(x, "permissionDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionDeltaUndefined: Self = StObject.set(x, "permissionDelta", js.undefined)
  }
}
