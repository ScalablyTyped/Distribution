package typings.ngTable.dataSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataSettings extends js.Object {
  var applyFilter: js.UndefOr[Boolean] = js.native
  var applyPaging: js.UndefOr[Boolean] = js.native
  var applySort: js.UndefOr[Boolean] = js.native
}

object IDataSettings {
  @scala.inline
  def apply(): IDataSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataSettings]
  }
  @scala.inline
  implicit class IDataSettingsOps[Self <: IDataSettings] (val x: Self) extends AnyVal {
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
    def setApplyFilter(value: Boolean): Self = this.set("applyFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyFilter: Self = this.set("applyFilter", js.undefined)
    @scala.inline
    def setApplyPaging(value: Boolean): Self = this.set("applyPaging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyPaging: Self = this.set("applyPaging", js.undefined)
    @scala.inline
    def setApplySort(value: Boolean): Self = this.set("applySort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplySort: Self = this.set("applySort", js.undefined)
  }
  
}

