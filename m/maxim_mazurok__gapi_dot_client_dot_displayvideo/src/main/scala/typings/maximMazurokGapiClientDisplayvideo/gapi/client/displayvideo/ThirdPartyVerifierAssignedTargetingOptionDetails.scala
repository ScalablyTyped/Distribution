package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThirdPartyVerifierAssignedTargetingOptionDetails extends js.Object {
  
  /** Third party brand verifier -- Adloox. */
  var adloox: js.UndefOr[Adloox] = js.native
  
  /** Third party brand verifier -- DoubleVerify. */
  var doubleVerify: js.UndefOr[DoubleVerify] = js.native
  
  /** Third party brand verifier -- Integral Ad Science. */
  var integralAdScience: js.UndefOr[IntegralAdScience] = js.native
}
object ThirdPartyVerifierAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): ThirdPartyVerifierAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyVerifierAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ThirdPartyVerifierAssignedTargetingOptionDetailsOps[Self <: ThirdPartyVerifierAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setAdloox(value: Adloox): Self = this.set("adloox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdloox: Self = this.set("adloox", js.undefined)
    
    @scala.inline
    def setDoubleVerify(value: DoubleVerify): Self = this.set("doubleVerify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleVerify: Self = this.set("doubleVerify", js.undefined)
    
    @scala.inline
    def setIntegralAdScience(value: IntegralAdScience): Self = this.set("integralAdScience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegralAdScience: Self = this.set("integralAdScience", js.undefined)
  }
}
