package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Quota extends js.Object {
  
  // Total space consumed by files in the recycle bin, in bytes. Read-only.
  var deleted: js.UndefOr[NullableOption[Double]] = js.native
  
  // Total space remaining before reaching the quota limit, in bytes. Read-only.
  var remaining: js.UndefOr[NullableOption[Double]] = js.native
  
  // Enumeration value that indicates the state of the storage space. Read-only.
  var state: js.UndefOr[NullableOption[String]] = js.native
  
  // Information about the drive's storage quota plans. Only in Personal OneDrive.
  var storagePlanInformation: js.UndefOr[NullableOption[StoragePlanInformation]] = js.native
  
  // Total allowed storage space, in bytes. Read-only.
  var total: js.UndefOr[NullableOption[Double]] = js.native
  
  // Total space used, in bytes. Read-only.
  var used: js.UndefOr[NullableOption[Double]] = js.native
}
object Quota {
  
  @scala.inline
  def apply(): Quota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quota]
  }
  
  @scala.inline
  implicit class QuotaOps[Self <: Quota] (val x: Self) extends AnyVal {
    
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
    def setDeleted(value: NullableOption[Double]): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setDeletedNull: Self = this.set("deleted", null)
    
    @scala.inline
    def setRemaining(value: NullableOption[Double]): Self = this.set("remaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemaining: Self = this.set("remaining", js.undefined)
    
    @scala.inline
    def setRemainingNull: Self = this.set("remaining", null)
    
    @scala.inline
    def setState(value: NullableOption[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateNull: Self = this.set("state", null)
    
    @scala.inline
    def setStoragePlanInformation(value: NullableOption[StoragePlanInformation]): Self = this.set("storagePlanInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoragePlanInformation: Self = this.set("storagePlanInformation", js.undefined)
    
    @scala.inline
    def setStoragePlanInformationNull: Self = this.set("storagePlanInformation", null)
    
    @scala.inline
    def setTotal(value: NullableOption[Double]): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
    
    @scala.inline
    def setTotalNull: Self = this.set("total", null)
    
    @scala.inline
    def setUsed(value: NullableOption[Double]): Self = this.set("used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsed: Self = this.set("used", js.undefined)
    
    @scala.inline
    def setUsedNull: Self = this.set("used", null)
  }
}
