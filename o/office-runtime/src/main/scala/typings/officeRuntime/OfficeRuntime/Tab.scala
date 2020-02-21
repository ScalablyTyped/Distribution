package typings.officeRuntime.OfficeRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an individual tab and the state it should have.
  * @beta
  */
trait Tab extends js.Object {
  /**
    * Represents an array of controls in the tab whose state is set with the call to `requestUpdate`.
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

