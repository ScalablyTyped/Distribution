package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedWithChannelTeamInfo
  extends StObject
     with TeamInfo {
  
  // A collection of team members who have access to the shared channel.
  var allowedMembers: js.UndefOr[NullableOption[js.Array[ConversationMember]]] = js.undefined
  
  // Indicates whether the team is the host of the channel.
  var isHostTeam: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object SharedWithChannelTeamInfo {
  
  inline def apply(): SharedWithChannelTeamInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedWithChannelTeamInfo]
  }
  
  extension [Self <: SharedWithChannelTeamInfo](x: Self) {
    
    inline def setAllowedMembers(value: NullableOption[js.Array[ConversationMember]]): Self = StObject.set(x, "allowedMembers", value.asInstanceOf[js.Any])
    
    inline def setAllowedMembersNull: Self = StObject.set(x, "allowedMembers", null)
    
    inline def setAllowedMembersUndefined: Self = StObject.set(x, "allowedMembers", js.undefined)
    
    inline def setAllowedMembersVarargs(value: ConversationMember*): Self = StObject.set(x, "allowedMembers", js.Array(value*))
    
    inline def setIsHostTeam(value: NullableOption[Boolean]): Self = StObject.set(x, "isHostTeam", value.asInstanceOf[js.Any])
    
    inline def setIsHostTeamNull: Self = StObject.set(x, "isHostTeam", null)
    
    inline def setIsHostTeamUndefined: Self = StObject.set(x, "isHostTeam", js.undefined)
  }
}
