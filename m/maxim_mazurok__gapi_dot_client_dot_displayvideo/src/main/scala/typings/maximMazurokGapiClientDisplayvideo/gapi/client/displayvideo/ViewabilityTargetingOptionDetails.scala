package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewabilityTargetingOptionDetails extends js.Object {
  
  /** Output only. The predicted viewability percentage. */
  var viewability: js.UndefOr[String] = js.native
}
object ViewabilityTargetingOptionDetails {
  
  @scala.inline
  def apply(): ViewabilityTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewabilityTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ViewabilityTargetingOptionDetailsOps[Self <: ViewabilityTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setViewability(value: String): Self = this.set("viewability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewability: Self = this.set("viewability", js.undefined)
  }
}
