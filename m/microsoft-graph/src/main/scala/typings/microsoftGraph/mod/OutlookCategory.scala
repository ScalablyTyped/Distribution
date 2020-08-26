package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutlookCategory extends Entity {
  /**
    * A pre-set color constant that characterizes a category, and that is mapped to one of 25 predefined colors. See the note
    * below.
    */
  var color: js.UndefOr[CategoryColor] = js.native
  /**
    * A unique name that identifies a category in the user's mailbox. After a category is created, the name cannot be
    * changed. Read-only.
    */
  var displayName: js.UndefOr[String] = js.native
}

object OutlookCategory {
  @scala.inline
  def apply(): OutlookCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlookCategory]
  }
  @scala.inline
  implicit class OutlookCategoryOps[Self <: OutlookCategory] (val x: Self) extends AnyVal {
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
    def setColor(value: CategoryColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
  }
  
}

