package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalAssignment extends StObject {
  
  /**
    * The identities the role is assigned to. It can have the following values: * `{user_email}`: An email address that represents a specific Google account. For example:
    * `alice@gmail.com`. * `{group_email}`: An email address that represents a Google group. For example, `viewers@gmail.com`.
    */
  var members: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. Role that is assigned to `members`. */
  var role: js.UndefOr[String] = js.undefined
}
object SasPortalAssignment {
  
  inline def apply(): SasPortalAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalAssignment]
  }
  
  extension [Self <: SasPortalAssignment](x: Self) {
    
    inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
