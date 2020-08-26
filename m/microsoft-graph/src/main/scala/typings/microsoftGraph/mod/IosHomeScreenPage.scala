package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosHomeScreenPage extends js.Object {
  // Name of the page
  var displayName: js.UndefOr[String] = js.native
  // A list of apps and folders to appear on a page. This collection can contain a maximum of 500 elements.
  var icons: js.UndefOr[js.Array[IosHomeScreenItem]] = js.native
}

object IosHomeScreenPage {
  @scala.inline
  def apply(): IosHomeScreenPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosHomeScreenPage]
  }
  @scala.inline
  implicit class IosHomeScreenPageOps[Self <: IosHomeScreenPage] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setIconsVarargs(value: IosHomeScreenItem*): Self = this.set("icons", js.Array(value :_*))
    @scala.inline
    def setIcons(value: js.Array[IosHomeScreenItem]): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
  }
  
}

