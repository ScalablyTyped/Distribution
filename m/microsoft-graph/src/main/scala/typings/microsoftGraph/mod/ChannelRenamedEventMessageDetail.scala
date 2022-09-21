package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelRenamedEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // The updated name of the channel.
  var channelDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique identifier of the channel.
  var channelId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Initiator of the event.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
}
object ChannelRenamedEventMessageDetail {
  
  inline def apply(): ChannelRenamedEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelRenamedEventMessageDetail]
  }
  
  extension [Self <: ChannelRenamedEventMessageDetail](x: Self) {
    
    inline def setChannelDisplayName(value: NullableOption[String]): Self = StObject.set(x, "channelDisplayName", value.asInstanceOf[js.Any])
    
    inline def setChannelDisplayNameNull: Self = StObject.set(x, "channelDisplayName", null)
    
    inline def setChannelDisplayNameUndefined: Self = StObject.set(x, "channelDisplayName", js.undefined)
    
    inline def setChannelId(value: NullableOption[String]): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdNull: Self = StObject.set(x, "channelId", null)
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
  }
}
