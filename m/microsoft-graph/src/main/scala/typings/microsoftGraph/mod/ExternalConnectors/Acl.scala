package typings.microsoftGraph.mod.ExternalConnectors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acl extends StObject {
  
  // The access granted to the identity. Possible values are: grant, deny, unknownFutureValue.
  var accessType: js.UndefOr[AccessType] = js.undefined
  
  /**
    * The type of identity. Possible values are: user, group, everyone, everyoneExceptGuests, externalGroup,
    * unknownFutureValue.
    */
  var `type`: js.UndefOr[AclType] = js.undefined
  
  /**
    * The unique identifer of the identity. In case of Azure Active Directory identities, value is set to the object
    * identifier of the user, group or tenant for types user, group and everyone (and everyoneExceptGuests) respectively. In
    * case of external groups value is set to the ID of the externalGroup
    */
  var value: js.UndefOr[String] = js.undefined
}
object Acl {
  
  inline def apply(): Acl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Acl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Acl] (val x: Self) extends AnyVal {
    
    inline def setAccessType(value: AccessType): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
    
    inline def setAccessTypeUndefined: Self = StObject.set(x, "accessType", js.undefined)
    
    inline def setType(value: AclType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
