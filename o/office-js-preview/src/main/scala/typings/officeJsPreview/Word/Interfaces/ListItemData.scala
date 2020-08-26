package typings.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `listItem.toJSON()`. */
@js.native
trait ListItemData extends js.Object {
  /**
    *
    * Gets or sets the level of the item in the list.
    *
    * [Api set: WordApi 1.3]
    */
  var level: js.UndefOr[Double] = js.native
  /**
    *
    * Gets the list item bullet, number, or picture as a string. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var listString: js.UndefOr[String] = js.native
  /**
    *
    * Gets the list item order number in relation to its siblings. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var siblingIndex: js.UndefOr[Double] = js.native
}

object ListItemData {
  @scala.inline
  def apply(): ListItemData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemData]
  }
  @scala.inline
  implicit class ListItemDataOps[Self <: ListItemData] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setListString(value: String): Self = this.set("listString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListString: Self = this.set("listString", js.undefined)
    @scala.inline
    def setSiblingIndex(value: Double): Self = this.set("siblingIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiblingIndex: Self = this.set("siblingIndex", js.undefined)
  }
  
}

