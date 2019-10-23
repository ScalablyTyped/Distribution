package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TimelineStyle object, for use in `timelineStyle.set({ ... })`. */
trait TimelineStyleUpdateData extends js.Object {
  /**
    *
    * Gets the name of the TimelineStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.undefined
}

object TimelineStyleUpdateData {
  @scala.inline
  def apply(name: String = null): TimelineStyleUpdateData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[TimelineStyleUpdateData]
  }
}

