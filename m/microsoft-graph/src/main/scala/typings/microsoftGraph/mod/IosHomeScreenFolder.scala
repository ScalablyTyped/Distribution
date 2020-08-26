package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosHomeScreenFolder extends IosHomeScreenItem {
  /**
    * Pages of Home Screen Layout Icons which must be Application Type. This collection can contain a maximum of 500
    * elements.
    */
  var pages: js.UndefOr[js.Array[IosHomeScreenFolderPage]] = js.native
}

object IosHomeScreenFolder {
  @scala.inline
  def apply(): IosHomeScreenFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosHomeScreenFolder]
  }
  @scala.inline
  implicit class IosHomeScreenFolderOps[Self <: IosHomeScreenFolder] (val x: Self) extends AnyVal {
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
    def setPagesVarargs(value: IosHomeScreenFolderPage*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[IosHomeScreenFolderPage]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
  }
  
}

