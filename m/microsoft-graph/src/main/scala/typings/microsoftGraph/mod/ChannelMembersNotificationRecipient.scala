package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMembersNotificationRecipient
  extends StObject
     with TeamworkNotificationRecipient {
  
  // The unique identifier for the channel whose members should receive the notification.
  var channelId: js.UndefOr[String] = js.undefined
  
  // The unique identifier for the team under which the channel resides.
  var teamId: js.UndefOr[String] = js.undefined
}
object ChannelMembersNotificationRecipient {
  
  inline def apply(): ChannelMembersNotificationRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMembersNotificationRecipient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelMembersNotificationRecipient] (val x: Self) extends AnyVal {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
  }
}
