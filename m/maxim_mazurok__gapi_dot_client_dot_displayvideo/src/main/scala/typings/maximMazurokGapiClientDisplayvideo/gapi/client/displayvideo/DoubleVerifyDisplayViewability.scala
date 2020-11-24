package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleVerifyDisplayViewability extends js.Object {
  
  /** Target web and app inventory to maximize IAB viewable rate. */
  var iab: js.UndefOr[String] = js.native
  
  /** Target web and app inventory to maximize 100% viewable duration. */
  var viewableDuring: js.UndefOr[String] = js.native
}
object DoubleVerifyDisplayViewability {
  
  @scala.inline
  def apply(): DoubleVerifyDisplayViewability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleVerifyDisplayViewability]
  }
  
  @scala.inline
  implicit class DoubleVerifyDisplayViewabilityOps[Self <: DoubleVerifyDisplayViewability] (val x: Self) extends AnyVal {
    
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
    def setIab(value: String): Self = this.set("iab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIab: Self = this.set("iab", js.undefined)
    
    @scala.inline
    def setViewableDuring(value: String): Self = this.set("viewableDuring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewableDuring: Self = this.set("viewableDuring", js.undefined)
  }
}
