package typings.officeRuntime.OfficeRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the parts of the ribbon that the call to `requestUpdate` will change.
  * @beta
  */
trait RibbonUpdaterData extends js.Object {
  /**
    * Array of the tabs whose state is set with a call to `requestUpdate`.
    */
  var tabs: js.UndefOr[js.Array[Tab]] = js.undefined
}

object RibbonUpdaterData {
  @scala.inline
  def apply(tabs: js.Array[Tab] = null): RibbonUpdaterData = {
    val __obj = js.Dynamic.literal()
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RibbonUpdaterData]
  }
}

