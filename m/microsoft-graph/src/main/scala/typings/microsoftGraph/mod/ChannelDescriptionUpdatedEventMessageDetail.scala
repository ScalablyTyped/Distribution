package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelDescriptionUpdatedEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // The updated description of the channel.
  var channelDescription: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique identifier of the channel.
  var channelId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Initiator of the event.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
}
object ChannelDescriptionUpdatedEventMessageDetail {
  
  inline def apply(): ChannelDescriptionUpdatedEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelDescriptionUpdatedEventMessageDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelDescriptionUpdatedEventMessageDetail] (val x: Self) extends AnyVal {
    
    inline def setChannelDescription(value: NullableOption[String]): Self = StObject.set(x, "channelDescription", value.asInstanceOf[js.Any])
    
    inline def setChannelDescriptionNull: Self = StObject.set(x, "channelDescription", null)
    
    inline def setChannelDescriptionUndefined: Self = StObject.set(x, "channelDescription", js.undefined)
    
    inline def setChannelId(value: NullableOption[String]): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdNull: Self = StObject.set(x, "channelId", null)
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
  }
}
