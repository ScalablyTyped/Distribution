package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminAuditData extends StObject {
  
  /** The permission_delta when when creating or updating a Role. */
  var permissionDelta: js.UndefOr[PermissionDelta] = js.undefined
}
object AdminAuditData {
  
  inline def apply(): AdminAuditData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminAuditData]
  }
  
  extension [Self <: AdminAuditData](x: Self) {
    
    inline def setPermissionDelta(value: PermissionDelta): Self = StObject.set(x, "permissionDelta", value.asInstanceOf[js.Any])
    
    inline def setPermissionDeltaUndefined: Self = StObject.set(x, "permissionDelta", js.undefined)
  }
}
