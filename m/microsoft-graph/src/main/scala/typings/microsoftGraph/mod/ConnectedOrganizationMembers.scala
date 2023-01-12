package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectedOrganizationMembers
  extends StObject
     with SubjectSet {
  
  // The ID of the connected organization in entitlement management.
  var connectedOrganizationId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the connected organization.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
}
object ConnectedOrganizationMembers {
  
  inline def apply(): ConnectedOrganizationMembers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectedOrganizationMembers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectedOrganizationMembers] (val x: Self) extends AnyVal {
    
    inline def setConnectedOrganizationId(value: NullableOption[String]): Self = StObject.set(x, "connectedOrganizationId", value.asInstanceOf[js.Any])
    
    inline def setConnectedOrganizationIdNull: Self = StObject.set(x, "connectedOrganizationId", null)
    
    inline def setConnectedOrganizationIdUndefined: Self = StObject.set(x, "connectedOrganizationId", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
