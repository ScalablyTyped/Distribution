package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hide from docs
  * --------
  * Information on userJoined Teams
  */
trait UserJoinedTeamsInformation extends StObject {
  
  /**
    * List of team information
    */
  var userJoinedTeams: js.Array[TeamInformation]
}
object UserJoinedTeamsInformation {
  
  inline def apply(userJoinedTeams: js.Array[TeamInformation]): UserJoinedTeamsInformation = {
    val __obj = js.Dynamic.literal(userJoinedTeams = userJoinedTeams.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserJoinedTeamsInformation]
  }
  
  extension [Self <: UserJoinedTeamsInformation](x: Self) {
    
    inline def setUserJoinedTeams(value: js.Array[TeamInformation]): Self = StObject.set(x, "userJoinedTeams", value.asInstanceOf[js.Any])
    
    inline def setUserJoinedTeamsVarargs(value: TeamInformation*): Self = StObject.set(x, "userJoinedTeams", js.Array(value*))
  }
}
