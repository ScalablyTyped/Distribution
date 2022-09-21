package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalGroup
  extends StObject
     with Entity {
  
  // The description of the external group. Optional.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The friendly name of the external group. Optional.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A member added to an externalGroup. You can add Azure Active Directory users, Azure Active Directory groups, or an
    * externalGroup as members.
    */
  var members: js.UndefOr[NullableOption[js.Array[Identity]]] = js.undefined
}
object ExternalGroup {
  
  inline def apply(): ExternalGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalGroup]
  }
  
  extension [Self <: ExternalGroup](x: Self) {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMembers(value: NullableOption[js.Array[Identity]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersNull: Self = StObject.set(x, "members", null)
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: Identity*): Self = StObject.set(x, "members", js.Array(value*))
  }
}
