package typings.microsoftteams.global.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates the various types of roles of a user in a team.
  */
@JSGlobal("microsoftTeams.UserTeamRole")
@js.native
object UserTeamRole extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.microsoftteams.microsoftTeams.UserTeamRole & Double] = js.native
  
  /* 0 */ val Admin: typings.microsoftteams.microsoftTeams.UserTeamRole.Admin & Double = js.native
  
  /* 2 */ val Guest: typings.microsoftteams.microsoftTeams.UserTeamRole.Guest & Double = js.native
  
  /* 1 */ val User: typings.microsoftteams.microsoftTeams.UserTeamRole.User & Double = js.native
}
