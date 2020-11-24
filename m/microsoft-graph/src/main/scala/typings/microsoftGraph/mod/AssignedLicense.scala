package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedLicense extends js.Object {
  
  // A collection of the unique identifiers for plans that have been disabled.
  var disabledPlans: js.UndefOr[js.Array[String]] = js.native
  
  // The unique identifier for the SKU.
  var skuId: js.UndefOr[NullableOption[String]] = js.native
}
object AssignedLicense {
  
  @scala.inline
  def apply(): AssignedLicense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedLicense]
  }
  
  @scala.inline
  implicit class AssignedLicenseOps[Self <: AssignedLicense] (val x: Self) extends AnyVal {
    
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
    def setDisabledPlansVarargs(value: String*): Self = this.set("disabledPlans", js.Array(value :_*))
    
    @scala.inline
    def setDisabledPlans(value: js.Array[String]): Self = this.set("disabledPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledPlans: Self = this.set("disabledPlans", js.undefined)
    
    @scala.inline
    def setSkuId(value: NullableOption[String]): Self = this.set("skuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkuId: Self = this.set("skuId", js.undefined)
    
    @scala.inline
    def setSkuIdNull: Self = this.set("skuId", null)
  }
}
