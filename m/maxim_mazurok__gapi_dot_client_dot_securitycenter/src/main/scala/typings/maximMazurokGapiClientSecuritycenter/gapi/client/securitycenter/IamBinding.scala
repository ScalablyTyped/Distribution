package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamBinding extends StObject {
  
  /** The action that was performed on a Binding. */
  var action: js.UndefOr[String] = js.undefined
  
  /** A single identity requesting access for a Cloud Platform resource, e.g. "foo@google.com". */
  var member: js.UndefOr[String] = js.undefined
  
  /** Role that is assigned to "members". For example, "roles/viewer", "roles/editor", or "roles/owner". */
  var role: js.UndefOr[String] = js.undefined
}
object IamBinding {
  
  inline def apply(): IamBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamBinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IamBinding] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setMember(value: String): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
