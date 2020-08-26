package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryObject extends Entity {
  var deletedDateTime: js.UndefOr[String] = js.native
}

object DirectoryObject {
  @scala.inline
  def apply(): DirectoryObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryObject]
  }
  @scala.inline
  implicit class DirectoryObjectOps[Self <: DirectoryObject] (val x: Self) extends AnyVal {
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
    def setDeletedDateTime(value: String): Self = this.set("deletedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletedDateTime: Self = this.set("deletedDateTime", js.undefined)
  }
  
}

