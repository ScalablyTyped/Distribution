package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelSetAsFavoriteByDefaultEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // Unique identifier of the channel.
  var channelId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Initiator of the event.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
}
object ChannelSetAsFavoriteByDefaultEventMessageDetail {
  
  inline def apply(): ChannelSetAsFavoriteByDefaultEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSetAsFavoriteByDefaultEventMessageDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelSetAsFavoriteByDefaultEventMessageDetail] (val x: Self) extends AnyVal {
    
    inline def setChannelId(value: NullableOption[String]): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdNull: Self = StObject.set(x, "channelId", null)
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
  }
}
