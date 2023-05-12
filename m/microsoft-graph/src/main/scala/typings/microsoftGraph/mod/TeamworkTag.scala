package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamworkTag
  extends StObject
     with Entity {
  
  /**
    * The description of the tag as it will appear to the user in Microsoft Teams. A teamworkTag can't have more than 200
    * teamworkTagMembers.
    */
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the tag as it will appear to the user in Microsoft Teams.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The number of users assigned to the tag.
  var memberCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Users assigned to the tag.
  var members: js.UndefOr[NullableOption[js.Array[TeamworkTagMember]]] = js.undefined
  
  // The type of the tag. Default is standard.
  var tagType: js.UndefOr[NullableOption[TeamworkTagType]] = js.undefined
  
  // ID of the team in which the tag is defined.
  var teamId: js.UndefOr[NullableOption[String]] = js.undefined
}
object TeamworkTag {
  
  inline def apply(): TeamworkTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamworkTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamworkTag] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMemberCount(value: NullableOption[Double]): Self = StObject.set(x, "memberCount", value.asInstanceOf[js.Any])
    
    inline def setMemberCountNull: Self = StObject.set(x, "memberCount", null)
    
    inline def setMemberCountUndefined: Self = StObject.set(x, "memberCount", js.undefined)
    
    inline def setMembers(value: NullableOption[js.Array[TeamworkTagMember]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersNull: Self = StObject.set(x, "members", null)
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: TeamworkTagMember*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setTagType(value: NullableOption[TeamworkTagType]): Self = StObject.set(x, "tagType", value.asInstanceOf[js.Any])
    
    inline def setTagTypeNull: Self = StObject.set(x, "tagType", null)
    
    inline def setTagTypeUndefined: Self = StObject.set(x, "tagType", js.undefined)
    
    inline def setTeamId(value: NullableOption[String]): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTeamIdNull: Self = StObject.set(x, "teamId", null)
    
    inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
  }
}
