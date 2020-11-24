package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InAppPurchasesFound extends js.Object {
  
  /** The total number of in-app purchases flows explored: how many times the robo tries to buy a SKU. */
  var inAppPurchasesFlowsExplored: js.UndefOr[Double] = js.native
  
  /** The total number of in-app purchases flows started. */
  var inAppPurchasesFlowsStarted: js.UndefOr[Double] = js.native
}
object InAppPurchasesFound {
  
  @scala.inline
  def apply(): InAppPurchasesFound = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InAppPurchasesFound]
  }
  
  @scala.inline
  implicit class InAppPurchasesFoundOps[Self <: InAppPurchasesFound] (val x: Self) extends AnyVal {
    
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
    def setInAppPurchasesFlowsExplored(value: Double): Self = this.set("inAppPurchasesFlowsExplored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInAppPurchasesFlowsExplored: Self = this.set("inAppPurchasesFlowsExplored", js.undefined)
    
    @scala.inline
    def setInAppPurchasesFlowsStarted(value: Double): Self = this.set("inAppPurchasesFlowsStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInAppPurchasesFlowsStarted: Self = this.set("inAppPurchasesFlowsStarted", js.undefined)
  }
}
