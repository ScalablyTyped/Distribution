package typings.nodePgMigrate.viewsMaterializedTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshMaterializedViewOptions extends js.Object {
  var concurrently: js.UndefOr[Boolean] = js.native
  var data: js.UndefOr[Boolean] = js.native
}

object RefreshMaterializedViewOptions {
  @scala.inline
  def apply(): RefreshMaterializedViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshMaterializedViewOptions]
  }
  @scala.inline
  implicit class RefreshMaterializedViewOptionsOps[Self <: RefreshMaterializedViewOptions] (val x: Self) extends AnyVal {
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
    def setConcurrently(value: Boolean): Self = this.set("concurrently", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrently: Self = this.set("concurrently", js.undefined)
    @scala.inline
    def setData(value: Boolean): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

