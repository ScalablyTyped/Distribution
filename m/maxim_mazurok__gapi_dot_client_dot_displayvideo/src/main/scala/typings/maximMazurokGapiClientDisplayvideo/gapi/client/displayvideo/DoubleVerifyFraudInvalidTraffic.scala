package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleVerifyFraudInvalidTraffic extends js.Object {
  
  /** Insufficient Historical Fraud & IVT Stats. */
  var avoidInsufficientOption: js.UndefOr[Boolean] = js.native
  
  /** Avoid Sites and Apps with historical Fraud & IVT. */
  var avoidedFraudOption: js.UndefOr[String] = js.native
}
object DoubleVerifyFraudInvalidTraffic {
  
  @scala.inline
  def apply(): DoubleVerifyFraudInvalidTraffic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleVerifyFraudInvalidTraffic]
  }
  
  @scala.inline
  implicit class DoubleVerifyFraudInvalidTrafficOps[Self <: DoubleVerifyFraudInvalidTraffic] (val x: Self) extends AnyVal {
    
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
    def setAvoidInsufficientOption(value: Boolean): Self = this.set("avoidInsufficientOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidInsufficientOption: Self = this.set("avoidInsufficientOption", js.undefined)
    
    @scala.inline
    def setAvoidedFraudOption(value: String): Self = this.set("avoidedFraudOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidedFraudOption: Self = this.set("avoidedFraudOption", js.undefined)
  }
}
