package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateManyOptions extends CommonOptions {
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.native
  var upsert: js.UndefOr[Boolean] = js.native
}

object UpdateManyOptions {
  @scala.inline
  def apply(): UpdateManyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateManyOptions]
  }
  @scala.inline
  implicit class UpdateManyOptionsOps[Self <: UpdateManyOptions] (val x: Self) extends AnyVal {
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
    def setArrayFiltersVarargs(value: js.Object*): Self = this.set("arrayFilters", js.Array(value :_*))
    @scala.inline
    def setArrayFilters(value: js.Array[js.Object]): Self = this.set("arrayFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayFilters: Self = this.set("arrayFilters", js.undefined)
    @scala.inline
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
  }
  
}

