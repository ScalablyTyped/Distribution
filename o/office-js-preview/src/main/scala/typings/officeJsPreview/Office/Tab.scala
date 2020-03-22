package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an individual tab and the state it should have.
  */
trait Tab extends js.Object {
  /**
    * Specifies the controls in the tab, such as menu items, buttons, etc.
    */
  var controls: js.UndefOr[js.Array[Control]] = js.undefined
  /**
    * Identifier of the tab as specified in the manifest.
    */
  var id: String
}

object Tab {
  @scala.inline
  def apply(id: String, controls: js.Array[Control] = null): Tab = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
}

