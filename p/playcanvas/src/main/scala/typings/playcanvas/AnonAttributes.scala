package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributes extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object AnonAttributes {
  @scala.inline
  def apply(attributes: js.Any = null, enabled: js.UndefOr[Boolean] = js.undefined): AnonAttributes = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributes]
  }
}

