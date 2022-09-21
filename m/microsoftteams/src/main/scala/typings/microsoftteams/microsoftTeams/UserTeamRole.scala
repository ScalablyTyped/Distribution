package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserTeamRole extends StObject
/**
  * Indicates the various types of roles of a user in a team.
  */
@JSGlobal("microsoftTeams.UserTeamRole")
@js.native
object UserTeamRole extends StObject {
  
  @js.native
  sealed trait Admin
    extends StObject
       with UserTeamRole
  
  @js.native
  sealed trait Guest
    extends StObject
       with UserTeamRole
  
  @js.native
  sealed trait User
    extends StObject
       with UserTeamRole
}
