package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelContentOwnerDetails extends StObject {
  
  /** The ID of the content owner linked to the channel. */
  var contentOwner: js.UndefOr[String] = js.native
  
  /** The date and time of when the channel was linked to the content owner. The value is specified in ISO 8601 format. */
  var timeLinked: js.UndefOr[String] = js.native
}
object ChannelContentOwnerDetails {
  
  @scala.inline
  def apply(): ChannelContentOwnerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelContentOwnerDetails]
  }
  
  @scala.inline
  implicit class ChannelContentOwnerDetailsMutableBuilder[Self <: ChannelContentOwnerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentOwner(value: String): Self = StObject.set(x, "contentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentOwnerUndefined: Self = StObject.set(x, "contentOwner", js.undefined)
    
    @scala.inline
    def setTimeLinked(value: String): Self = StObject.set(x, "timeLinked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLinkedUndefined: Self = StObject.set(x, "timeLinked", js.undefined)
  }
}
