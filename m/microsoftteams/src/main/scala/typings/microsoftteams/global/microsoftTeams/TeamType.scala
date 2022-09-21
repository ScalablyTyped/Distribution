package typings.microsoftteams.global.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates the team type, currently used to distinguish between different team
  * types in Office 365 for Education (team types 1, 2, 3, and 4).
  */
@JSGlobal("microsoftTeams.TeamType")
@js.native
object TeamType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.microsoftteams.microsoftTeams.TeamType & Double] = js.native
  
  /* 2 */ val Class: typings.microsoftteams.microsoftTeams.TeamType.Class & Double = js.native
  
  /* 1 */ val Edu: typings.microsoftteams.microsoftTeams.TeamType.Edu & Double = js.native
  
  /* 3 */ val Plc: typings.microsoftteams.microsoftTeams.TeamType.Plc & Double = js.native
  
  /* 4 */ val Staff: typings.microsoftteams.microsoftTeams.TeamType.Staff & Double = js.native
  
  /* 0 */ val Standard: typings.microsoftteams.microsoftTeams.TeamType.Standard & Double = js.native
}
