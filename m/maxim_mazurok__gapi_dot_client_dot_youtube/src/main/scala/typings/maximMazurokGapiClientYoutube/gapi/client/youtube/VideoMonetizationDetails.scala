package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoMonetizationDetails extends js.Object {
  
  /** The value of access indicates whether the video can be monetized or not. */
  var access: js.UndefOr[AccessPolicy] = js.native
}
object VideoMonetizationDetails {
  
  @scala.inline
  def apply(): VideoMonetizationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoMonetizationDetails]
  }
  
  @scala.inline
  implicit class VideoMonetizationDetailsOps[Self <: VideoMonetizationDetails] (val x: Self) extends AnyVal {
    
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
    def setAccess(value: AccessPolicy): Self = this.set("access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
  }
}
