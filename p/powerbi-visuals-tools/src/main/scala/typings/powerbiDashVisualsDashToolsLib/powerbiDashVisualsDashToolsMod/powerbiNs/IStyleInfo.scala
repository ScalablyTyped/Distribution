package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStyleInfo extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
}

object IStyleInfo {
  @scala.inline
  def apply(className: java.lang.String = null): IStyleInfo = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[IStyleInfo]
  }
}

