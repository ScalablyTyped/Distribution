package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "runtime.toJSON()". */
trait RuntimeData extends js.Object {
  /**
    *
    * Toggle JavaScript events in the current task pane or content add-in.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableEvents: js.UndefOr[Boolean] = js.undefined
}

object RuntimeData {
  @scala.inline
  def apply(enableEvents: js.UndefOr[Boolean] = js.undefined): RuntimeData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableEvents)) __obj.updateDynamic("enableEvents")(enableEvents)
    __obj.asInstanceOf[RuntimeData]
  }
}

