package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies changes to the ribbon, such as the enabled or disabled status of a button.
  */
trait RibbonUpdaterData extends js.Object {
  /**
    * Collection of tabs whose state is set with the call of `requestUpdate`.
    */
  var tabs: js.Array[Tab]
}

object RibbonUpdaterData {
  @scala.inline
  def apply(tabs: js.Array[Tab]): RibbonUpdaterData = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RibbonUpdaterData]
  }
}

