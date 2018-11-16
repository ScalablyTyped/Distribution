package typings
package microsoftteamsLib.microsoftTeamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TeamType extends js.Object

@JSGlobal("microsoftTeams.TeamType")
@js.native
object TeamType extends js.Object {
  @js.native
  sealed trait Class
    extends microsoftteamsLib.microsoftTeamsNs.TeamType
  
  @js.native
  sealed trait Edu
    extends microsoftteamsLib.microsoftTeamsNs.TeamType
  
  @js.native
  sealed trait Plc
    extends microsoftteamsLib.microsoftTeamsNs.TeamType
  
  @js.native
  sealed trait Staff
    extends microsoftteamsLib.microsoftTeamsNs.TeamType
  
  @js.native
  sealed trait Standard
    extends microsoftteamsLib.microsoftTeamsNs.TeamType
  
  /* 2 */ val Class: Class with scala.Double = js.native
  /* 1 */ val Edu: Edu with scala.Double = js.native
  /* 3 */ val Plc: Plc with scala.Double = js.native
  /* 4 */ val Staff: Staff with scala.Double = js.native
  /* 0 */ val Standard: Standard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[microsoftteamsLib.microsoftTeamsNs.TeamType with scala.Double] = js.native
}

