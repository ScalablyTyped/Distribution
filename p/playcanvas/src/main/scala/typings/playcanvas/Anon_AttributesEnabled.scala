package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributesEnabled extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object Anon_AttributesEnabled {
  @scala.inline
  def apply(attributes: js.Any = null, enabled: js.UndefOr[Boolean] = js.undefined): Anon_AttributesEnabled = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttributesEnabled]
  }
}

