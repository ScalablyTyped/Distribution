package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletedCount extends js.Object {
  var deletedCount: js.UndefOr[Double] = js.native
}

object DeletedCount {
  @scala.inline
  def apply(): DeletedCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletedCount]
  }
  @scala.inline
  implicit class DeletedCountOps[Self <: DeletedCount] (val x: Self) extends AnyVal {
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
    def setDeletedCount(value: Double): Self = this.set("deletedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletedCount: Self = this.set("deletedCount", js.undefined)
  }
  
}

