package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Attributes {
  @scala.inline
  def apply(attributes: js.Object = null, enabled: js.UndefOr[scala.Boolean] = js.undefined): Anon_Attributes = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[Anon_Attributes]
  }
}

