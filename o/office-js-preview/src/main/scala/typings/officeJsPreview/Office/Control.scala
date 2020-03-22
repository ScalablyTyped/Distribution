package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an individual control or command and the state it should have.
  */
trait Control extends js.Object {
  /**
    * Indicates whether the control should be enabled or disabled. The default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Identifier of the control as specified in the manifest.
    */
  var id: String
  /**
    * Indicates whether the control should be visible or hidden. The default is true.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Control {
  @scala.inline
  def apply(
    id: String,
    enabled: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Control = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
}

