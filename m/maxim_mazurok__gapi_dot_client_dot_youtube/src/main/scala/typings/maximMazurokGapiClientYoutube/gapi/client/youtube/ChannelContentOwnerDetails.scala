package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelContentOwnerDetails extends js.Object {
  
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
  implicit class ChannelContentOwnerDetailsOps[Self <: ChannelContentOwnerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentOwner(value: String): Self = this.set("contentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentOwner: Self = this.set("contentOwner", js.undefined)
    
    @scala.inline
    def setTimeLinked(value: String): Self = this.set("timeLinked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeLinked: Self = this.set("timeLinked", js.undefined)
  }
}
