package typings.officeDashJsDashPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Table object, for use in "table.set({ ... })". */
trait TableUpdateData extends js.Object {
  /**
    *
    * Gets or sets whether the borders are visible or not. True if they are visible, false if they are hidden.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var borderVisible: js.UndefOr[Boolean] = js.undefined
}

object TableUpdateData {
  @scala.inline
  def apply(borderVisible: js.UndefOr[Boolean] = js.undefined): TableUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderVisible)) __obj.updateDynamic("borderVisible")(borderVisible)
    __obj.asInstanceOf[TableUpdateData]
  }
}

