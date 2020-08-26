package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quota extends js.Object {
  // Total space consumed by files in the recycle bin, in bytes. Read-only.
  var deleted: js.UndefOr[Double] = js.native
  // Total space remaining before reaching the quota limit, in bytes. Read-only.
  var remaining: js.UndefOr[Double] = js.native
  // Enumeration value that indicates the state of the storage space. Read-only.
  var state: js.UndefOr[String] = js.native
  // Information about the drive's storage quota plans. Only in Personal OneDrive.
  var storagePlanInformation: js.UndefOr[StoragePlanInformation] = js.native
  // Total allowed storage space, in bytes. Read-only.
  var total: js.UndefOr[Double] = js.native
  // Total space used, in bytes. Read-only.
  var used: js.UndefOr[Double] = js.native
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
    def setDeleted(value: Double): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setRemaining(value: Double): Self = this.set("remaining", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemaining: Self = this.set("remaining", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStoragePlanInformation(value: StoragePlanInformation): Self = this.set("storagePlanInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoragePlanInformation: Self = this.set("storagePlanInformation", js.undefined)
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
    @scala.inline
    def setUsed(value: Double): Self = this.set("used", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsed: Self = this.set("used", js.undefined)
  }
  
}

