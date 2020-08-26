package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a new folder.
  */
@js.native
trait INewFolder extends js.Object {
  /**
    * A description of the folder.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of the folder.
    */
  var name: String = js.native
  /**
    * Sorts the items to specify the following criteria: updated, name,
    * size, or default.
    */
  var sort_by: js.UndefOr[String] = js.native
}

object INewFolder {
  @scala.inline
  def apply(name: String): INewFolder = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewFolder]
  }
  @scala.inline
  implicit class INewFolderOps[Self <: INewFolder] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setSort_by(value: String): Self = this.set("sort_by", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort_by: Self = this.set("sort_by", js.undefined)
  }
  
}

