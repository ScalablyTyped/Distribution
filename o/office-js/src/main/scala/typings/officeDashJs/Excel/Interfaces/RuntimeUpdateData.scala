package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Runtime object, for use in `runtime.set({ ... })`. */
trait RuntimeUpdateData extends js.Object {
  /**
    *
    * Toggle JavaScript events in the current task pane or content add-in.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableEvents: js.UndefOr[Boolean] = js.undefined
}

object RuntimeUpdateData {
  @scala.inline
  def apply(enableEvents: js.UndefOr[Boolean] = js.undefined): RuntimeUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableEvents)) __obj.updateDynamic("enableEvents")(enableEvents)
    __obj.asInstanceOf[RuntimeUpdateData]
  }
}

