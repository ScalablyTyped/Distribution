package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// intentionally blank interfaces since this is not part of the public API
trait ISemanticFilter extends js.Object {
  var whereItems: js.UndefOr[js.Object] = js.undefined
}

object ISemanticFilter {
  @scala.inline
  def apply(whereItems: js.Object = null): ISemanticFilter = {
    val __obj = js.Dynamic.literal()
    if (whereItems != null) __obj.updateDynamic("whereItems")(whereItems)
    __obj.asInstanceOf[ISemanticFilter]
  }
}

