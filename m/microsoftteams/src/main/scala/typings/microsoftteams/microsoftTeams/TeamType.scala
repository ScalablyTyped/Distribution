package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TeamType extends StObject
/**
  * Indicates the team type, currently used to distinguish between different team
  * types in Office 365 for Education (team types 1, 2, 3, and 4).
  */
@JSGlobal("microsoftTeams.TeamType")
@js.native
object TeamType extends StObject {
  
  @js.native
  sealed trait Class
    extends StObject
       with TeamType
  
  @js.native
  sealed trait Edu
    extends StObject
       with TeamType
  
  @js.native
  sealed trait Plc
    extends StObject
       with TeamType
  
  @js.native
  sealed trait Staff
    extends StObject
       with TeamType
  
  @js.native
  sealed trait Standard
    extends StObject
       with TeamType
}
