package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppTargeting extends js.Object {
  
  /** Lists of included and excluded mobile app categories as defined in https://developers.google.com/adwords/api/docs/appendix/mobileappcategories.csv. */
  var mobileAppCategoryTargeting: js.UndefOr[NumericTargetingDimension] = js.native
  
  /** Targeted app IDs. App IDs can refer to those found in an app store or ones that are not published in an app store. A maximum of 30,000 app IDs can be targeted. */
  var mobileAppTargeting: js.UndefOr[StringTargetingDimension] = js.native
}
object AppTargeting {
  
  @scala.inline
  def apply(): AppTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppTargeting]
  }
  
  @scala.inline
  implicit class AppTargetingOps[Self <: AppTargeting] (val x: Self) extends AnyVal {
    
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
    def setMobileAppCategoryTargeting(value: NumericTargetingDimension): Self = this.set("mobileAppCategoryTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileAppCategoryTargeting: Self = this.set("mobileAppCategoryTargeting", js.undefined)
    
    @scala.inline
    def setMobileAppTargeting(value: StringTargetingDimension): Self = this.set("mobileAppTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileAppTargeting: Self = this.set("mobileAppTargeting", js.undefined)
  }
}
