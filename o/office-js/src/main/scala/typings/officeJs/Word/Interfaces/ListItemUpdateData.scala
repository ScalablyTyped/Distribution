package typings.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ListItem object, for use in `listItem.set({ ... })`. */
@js.native
trait ListItemUpdateData extends js.Object {
  /**
    *
    * Gets or sets the level of the item in the list.
    *
    * [Api set: WordApi 1.3]
    */
  var level: js.UndefOr[Double] = js.native
}

object ListItemUpdateData {
  @scala.inline
  def apply(): ListItemUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemUpdateData]
  }
  @scala.inline
  implicit class ListItemUpdateDataOps[Self <: ListItemUpdateData] (val x: Self) extends AnyVal {
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
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
  
}

