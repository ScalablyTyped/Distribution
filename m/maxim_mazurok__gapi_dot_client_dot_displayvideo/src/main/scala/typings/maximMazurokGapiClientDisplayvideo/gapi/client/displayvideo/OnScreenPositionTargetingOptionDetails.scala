package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnScreenPositionTargetingOptionDetails extends js.Object {
  
  /** Output only. The on screen position. */
  var onScreenPosition: js.UndefOr[String] = js.native
}
object OnScreenPositionTargetingOptionDetails {
  
  @scala.inline
  def apply(): OnScreenPositionTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnScreenPositionTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class OnScreenPositionTargetingOptionDetailsOps[Self <: OnScreenPositionTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setOnScreenPosition(value: String): Self = this.set("onScreenPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScreenPosition: Self = this.set("onScreenPosition", js.undefined)
  }
}
