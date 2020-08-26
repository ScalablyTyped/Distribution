package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosHomeScreenFolderPage extends js.Object {
  // A list of apps to appear on a page within a folder. This collection can contain a maximum of 500 elements.
  var apps: js.UndefOr[js.Array[IosHomeScreenApp]] = js.native
  // Name of the folder page
  var displayName: js.UndefOr[String] = js.native
}

object IosHomeScreenFolderPage {
  @scala.inline
  def apply(): IosHomeScreenFolderPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosHomeScreenFolderPage]
  }
  @scala.inline
  implicit class IosHomeScreenFolderPageOps[Self <: IosHomeScreenFolderPage] (val x: Self) extends AnyVal {
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
    def setAppsVarargs(value: IosHomeScreenApp*): Self = this.set("apps", js.Array(value :_*))
    @scala.inline
    def setApps(value: js.Array[IosHomeScreenApp]): Self = this.set("apps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApps: Self = this.set("apps", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
  }
  
}

