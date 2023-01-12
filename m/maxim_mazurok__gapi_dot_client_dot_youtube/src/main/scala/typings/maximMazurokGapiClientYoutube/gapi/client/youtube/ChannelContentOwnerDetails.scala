package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelContentOwnerDetails extends StObject {
  
  /** The ID of the content owner linked to the channel. */
  var contentOwner: js.UndefOr[String] = js.undefined
  
  /** The date and time when the channel was linked to the content owner. */
  var timeLinked: js.UndefOr[String] = js.undefined
}
object ChannelContentOwnerDetails {
  
  inline def apply(): ChannelContentOwnerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelContentOwnerDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelContentOwnerDetails] (val x: Self) extends AnyVal {
    
    inline def setContentOwner(value: String): Self = StObject.set(x, "contentOwner", value.asInstanceOf[js.Any])
    
    inline def setContentOwnerUndefined: Self = StObject.set(x, "contentOwner", js.undefined)
    
    inline def setTimeLinked(value: String): Self = StObject.set(x, "timeLinked", value.asInstanceOf[js.Any])
    
    inline def setTimeLinkedUndefined: Self = StObject.set(x, "timeLinked", js.undefined)
  }
}
