package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectorsByColumn extends js.Object {
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object SelectorsByColumn {
  @scala.inline
  def apply(key: java.lang.String = null): SelectorsByColumn = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[SelectorsByColumn]
  }
}

