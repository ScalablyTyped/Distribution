package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentalStatusTargetingOptionDetails extends js.Object {
  
  /** Output only. The parental status of an audience. */
  var parentalStatus: js.UndefOr[String] = js.native
}
object ParentalStatusTargetingOptionDetails {
  
  @scala.inline
  def apply(): ParentalStatusTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentalStatusTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ParentalStatusTargetingOptionDetailsOps[Self <: ParentalStatusTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setParentalStatus(value: String): Self = this.set("parentalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentalStatus: Self = this.set("parentalStatus", js.undefined)
  }
}
