package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents Team Information
  */
trait TeamInformation extends StObject {
  
  /**
    * The Office 365 group ID for the team with which the content is associated.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * The archived status of the team
    */
  var isTeamArchived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The locked status of the team
    */
  var isTeamLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Team description
    */
  var teamDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Id of the team
    */
  var teamId: String
  
  /**
    * Team display name
    */
  var teamName: String
  
  /**
    * The type of the team.
    */
  var teamType: js.UndefOr[TeamType] = js.undefined
  
  /**
    * Thumbnail Uri
    */
  var thumbnailUri: js.UndefOr[String] = js.undefined
  
  /**
    * Role of current user in the team
    */
  var userTeamRole: js.UndefOr[UserTeamRole] = js.undefined
}
object TeamInformation {
  
  inline def apply(teamId: String, teamName: String): TeamInformation = {
    val __obj = js.Dynamic.literal(teamId = teamId.asInstanceOf[js.Any], teamName = teamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamInformation]
  }
  
  extension [Self <: TeamInformation](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setIsTeamArchived(value: Boolean): Self = StObject.set(x, "isTeamArchived", value.asInstanceOf[js.Any])
    
    inline def setIsTeamArchivedUndefined: Self = StObject.set(x, "isTeamArchived", js.undefined)
    
    inline def setIsTeamLocked(value: Boolean): Self = StObject.set(x, "isTeamLocked", value.asInstanceOf[js.Any])
    
    inline def setIsTeamLockedUndefined: Self = StObject.set(x, "isTeamLocked", js.undefined)
    
    inline def setTeamDescription(value: String): Self = StObject.set(x, "teamDescription", value.asInstanceOf[js.Any])
    
    inline def setTeamDescriptionUndefined: Self = StObject.set(x, "teamDescription", js.undefined)
    
    inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTeamName(value: String): Self = StObject.set(x, "teamName", value.asInstanceOf[js.Any])
    
    inline def setTeamType(value: TeamType): Self = StObject.set(x, "teamType", value.asInstanceOf[js.Any])
    
    inline def setTeamTypeUndefined: Self = StObject.set(x, "teamType", js.undefined)
    
    inline def setThumbnailUri(value: String): Self = StObject.set(x, "thumbnailUri", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUriUndefined: Self = StObject.set(x, "thumbnailUri", js.undefined)
    
    inline def setUserTeamRole(value: UserTeamRole): Self = StObject.set(x, "userTeamRole", value.asInstanceOf[js.Any])
    
    inline def setUserTeamRoleUndefined: Self = StObject.set(x, "userTeamRole", js.undefined)
  }
}
