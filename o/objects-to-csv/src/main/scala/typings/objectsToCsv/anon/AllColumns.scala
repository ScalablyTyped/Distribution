package typings.objectsToCsv.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllColumns extends js.Object {
  var allColumns: js.UndefOr[Boolean] = js.native
  var append: js.UndefOr[Boolean] = js.native
  var bom: js.UndefOr[Boolean] = js.native
}

object AllColumns {
  @scala.inline
  def apply(): AllColumns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllColumns]
  }
  @scala.inline
  implicit class AllColumnsOps[Self <: AllColumns] (val x: Self) extends AnyVal {
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
    def setAllColumns(value: Boolean): Self = this.set("allColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllColumns: Self = this.set("allColumns", js.undefined)
    @scala.inline
    def setAppend(value: Boolean): Self = this.set("append", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    @scala.inline
    def setBom(value: Boolean): Self = this.set("bom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBom: Self = this.set("bom", js.undefined)
  }
  
}

