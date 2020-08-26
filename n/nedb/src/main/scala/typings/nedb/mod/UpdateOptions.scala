package typings.nedb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * multi (defaults to false) which allows the modification of several documents if set to true
  * upsert (defaults to false) if you want to insert a new document corresponding to the update rules if your query doesn't match anything
  */
@js.native
trait UpdateOptions extends js.Object {
  var multi: js.UndefOr[Boolean] = js.native
  var returnUpdatedDocs: js.UndefOr[Boolean] = js.native
  var upsert: js.UndefOr[Boolean] = js.native
}

object UpdateOptions {
  @scala.inline
  def apply(): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOptions]
  }
  @scala.inline
  implicit class UpdateOptionsOps[Self <: UpdateOptions] (val x: Self) extends AnyVal {
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
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    @scala.inline
    def setReturnUpdatedDocs(value: Boolean): Self = this.set("returnUpdatedDocs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnUpdatedDocs: Self = this.set("returnUpdatedDocs", js.undefined)
    @scala.inline
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
  }
  
}

