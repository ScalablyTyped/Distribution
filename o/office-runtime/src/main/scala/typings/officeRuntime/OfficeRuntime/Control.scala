package typings.officeRuntime.OfficeRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represent an individual control or command whose state is set with the call to `requestUpdate`.
  * @beta
  */
trait Control extends js.Object {
  /**
    * Indicates whether the control should be enabled (default) or disabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Identifier of the control as specified in the manifest.
    */
  var id: String
}

object Control {
  @scala.inline
  def apply(id: String, enabled: js.UndefOr[Boolean] = js.undefined): Control = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
}

