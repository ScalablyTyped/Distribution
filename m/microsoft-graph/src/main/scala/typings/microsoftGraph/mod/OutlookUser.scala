package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutlookUser extends Entity {
  // A list of categories defined for the user.
  var masterCategories: js.UndefOr[js.Array[OutlookCategory]] = js.native
}

object OutlookUser {
  @scala.inline
  def apply(): OutlookUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlookUser]
  }
  @scala.inline
  implicit class OutlookUserOps[Self <: OutlookUser] (val x: Self) extends AnyVal {
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
    def setMasterCategoriesVarargs(value: OutlookCategory*): Self = this.set("masterCategories", js.Array(value :_*))
    @scala.inline
    def setMasterCategories(value: js.Array[OutlookCategory]): Self = this.set("masterCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterCategories: Self = this.set("masterCategories", js.undefined)
  }
  
}

