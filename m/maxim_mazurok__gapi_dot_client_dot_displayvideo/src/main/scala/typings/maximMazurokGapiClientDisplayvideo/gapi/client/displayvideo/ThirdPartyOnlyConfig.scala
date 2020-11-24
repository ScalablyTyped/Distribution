package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThirdPartyOnlyConfig extends js.Object {
  
  /** Whether or not order ID reporting for pixels is enabled. This value cannot be changed once set to `true`. */
  var pixelOrderIdReportingEnabled: js.UndefOr[Boolean] = js.native
}
object ThirdPartyOnlyConfig {
  
  @scala.inline
  def apply(): ThirdPartyOnlyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyOnlyConfig]
  }
  
  @scala.inline
  implicit class ThirdPartyOnlyConfigOps[Self <: ThirdPartyOnlyConfig] (val x: Self) extends AnyVal {
    
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
    def setPixelOrderIdReportingEnabled(value: Boolean): Self = this.set("pixelOrderIdReportingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelOrderIdReportingEnabled: Self = this.set("pixelOrderIdReportingEnabled", js.undefined)
  }
}
