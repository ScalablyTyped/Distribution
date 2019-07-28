package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Excel Runtime class.
  *
  * [Api set: ExcelApi 1.5]
  */
trait RuntimeLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Toggle JavaScript events in the current task pane or content add-in.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableEvents: js.UndefOr[Boolean] = js.undefined
}

object RuntimeLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[Boolean] = js.undefined, enableEvents: js.UndefOr[Boolean] = js.undefined): RuntimeLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(enableEvents)) __obj.updateDynamic("enableEvents")(enableEvents)
    __obj.asInstanceOf[RuntimeLoadOptions]
  }
}

