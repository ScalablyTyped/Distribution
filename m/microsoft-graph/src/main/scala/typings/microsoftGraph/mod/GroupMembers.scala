package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupMembers
  extends StObject
     with SubjectSet {
  
  // The name of the group in Azure AD. Read only.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The ID of the group in Azure AD.
  var groupId: js.UndefOr[NullableOption[String]] = js.undefined
}
object GroupMembers {
  
  inline def apply(): GroupMembers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupMembers]
  }
  
  extension [Self <: GroupMembers](x: Self) {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGroupId(value: NullableOption[String]): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdNull: Self = StObject.set(x, "groupId", null)
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
  }
}
