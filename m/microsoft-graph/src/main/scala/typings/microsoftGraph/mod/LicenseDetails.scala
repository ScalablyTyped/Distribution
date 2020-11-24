package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseDetails extends Entity {
  
  // Information about the service plans assigned with the license. Read-only, Not nullable
  var servicePlans: js.UndefOr[js.Array[ServicePlanInfo]] = js.native
  
  /**
    * Unique identifier (GUID) for the service SKU. Equal to the skuId property on the related SubscribedSku object.
    * Read-only
    */
  var skuId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Unique SKU display name. Equal to the skuPartNumber on the related SubscribedSku object; for example: 'AAD_Premium'.
    * Read-only
    */
  var skuPartNumber: js.UndefOr[NullableOption[String]] = js.native
}
object LicenseDetails {
  
  @scala.inline
  def apply(): LicenseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseDetails]
  }
  
  @scala.inline
  implicit class LicenseDetailsOps[Self <: LicenseDetails] (val x: Self) extends AnyVal {
    
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
    def setServicePlansVarargs(value: ServicePlanInfo*): Self = this.set("servicePlans", js.Array(value :_*))
    
    @scala.inline
    def setServicePlans(value: js.Array[ServicePlanInfo]): Self = this.set("servicePlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicePlans: Self = this.set("servicePlans", js.undefined)
    
    @scala.inline
    def setSkuId(value: NullableOption[String]): Self = this.set("skuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkuId: Self = this.set("skuId", js.undefined)
    
    @scala.inline
    def setSkuIdNull: Self = this.set("skuId", null)
    
    @scala.inline
    def setSkuPartNumber(value: NullableOption[String]): Self = this.set("skuPartNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkuPartNumber: Self = this.set("skuPartNumber", js.undefined)
    
    @scala.inline
    def setSkuPartNumberNull: Self = this.set("skuPartNumber", null)
  }
}
