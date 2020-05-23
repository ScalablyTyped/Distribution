package typings.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ListItem object, for use in "listItem.set({ ... })". */
trait ListItemUpdateData extends js.Object {
  /**
    *
    * Gets or sets the level of the item in the list.
    *
    * [Api set: WordApi 1.3]
    */
  var level: js.UndefOr[Double] = js.undefined
}

object ListItemUpdateData {
  @scala.inline
  def apply(level: js.UndefOr[Double] = js.undefined): ListItemUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemUpdateData]
  }
}

