package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelIdentity extends StObject {
  
  // The identity of the channel in which the message was posted.
  var channelId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The identity of the team in which the message was posted.
  var teamId: js.UndefOr[NullableOption[String]] = js.undefined
}
object ChannelIdentity {
  
  inline def apply(): ChannelIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelIdentity]
  }
  
  extension [Self <: ChannelIdentity](x: Self) {
    
    inline def setChannelId(value: NullableOption[String]): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdNull: Self = StObject.set(x, "channelId", null)
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setTeamId(value: NullableOption[String]): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTeamIdNull: Self = StObject.set(x, "teamId", null)
    
    inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
  }
}
