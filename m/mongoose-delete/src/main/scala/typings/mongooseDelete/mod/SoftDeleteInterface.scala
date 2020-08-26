package typings.mongooseDelete.mod

import typings.mongoose.mod.Document
import typings.mongoose.mod.Types.ObjectId
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftDeleteInterface extends js.Object {
  var deleteAt: js.UndefOr[Date] = js.native
  /** Soft deleted ? */
  var deleted: js.UndefOr[Boolean] = js.native
  var deletedBy: js.UndefOr[ObjectId | String | Document] = js.native
}

object SoftDeleteInterface {
  @scala.inline
  def apply(): SoftDeleteInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftDeleteInterface]
  }
  @scala.inline
  implicit class SoftDeleteInterfaceOps[Self <: SoftDeleteInterface] (val x: Self) extends AnyVal {
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
    def setDeleteAt(value: Date): Self = this.set("deleteAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteAt: Self = this.set("deleteAt", js.undefined)
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setDeletedBy(value: ObjectId | String | Document): Self = this.set("deletedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletedBy: Self = this.set("deletedBy", js.undefined)
  }
  
}

