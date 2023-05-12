package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamMembersNotificationRecipient
  extends StObject
     with TeamworkNotificationRecipient {
  
  // The unique identifier for the team whose members should receive the notification.
  var teamId: js.UndefOr[String] = js.undefined
}
object TeamMembersNotificationRecipient {
  
  inline def apply(): TeamMembersNotificationRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamMembersNotificationRecipient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamMembersNotificationRecipient] (val x: Self) extends AnyVal {
    
    inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
  }
}
