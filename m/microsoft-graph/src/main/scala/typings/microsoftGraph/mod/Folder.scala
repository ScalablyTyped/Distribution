package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Folder extends js.Object {
  // Number of children contained immediately within this container.
  var childCount: js.UndefOr[Double] = js.native
  // A collection of properties defining the recommended view for the folder.
  var view: js.UndefOr[FolderView] = js.native
}

object Folder {
  @scala.inline
  def apply(): Folder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Folder]
  }
  @scala.inline
  implicit class FolderOps[Self <: Folder] (val x: Self) extends AnyVal {
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
    def setChildCount(value: Double): Self = this.set("childCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildCount: Self = this.set("childCount", js.undefined)
    @scala.inline
    def setView(value: FolderView): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

