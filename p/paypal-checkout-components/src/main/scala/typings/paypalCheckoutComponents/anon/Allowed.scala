package typings.paypalCheckoutComponents.anon

import typings.paypalCheckoutComponents.buttonMod.FundingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Allowed extends js.Object {
  
  var allowed: js.UndefOr[js.Array[FundingOption]] = js.native
  
  var disallowed: js.UndefOr[js.Array[FundingOption]] = js.native
}
object Allowed {
  
  @scala.inline
  def apply(): Allowed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allowed]
  }
  
  @scala.inline
  implicit class AllowedOps[Self <: Allowed] (val x: Self) extends AnyVal {
    
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
    def setAllowedVarargs(value: FundingOption*): Self = this.set("allowed", js.Array(value :_*))
    
    @scala.inline
    def setAllowed(value: js.Array[FundingOption]): Self = this.set("allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowed: Self = this.set("allowed", js.undefined)
    
    @scala.inline
    def setDisallowedVarargs(value: FundingOption*): Self = this.set("disallowed", js.Array(value :_*))
    
    @scala.inline
    def setDisallowed(value: js.Array[FundingOption]): Self = this.set("disallowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisallowed: Self = this.set("disallowed", js.undefined)
  }
}
