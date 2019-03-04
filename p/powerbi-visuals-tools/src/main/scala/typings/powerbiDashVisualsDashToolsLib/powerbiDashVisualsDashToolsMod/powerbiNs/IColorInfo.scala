package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorInfo extends IStyleInfo {
  var value: java.lang.String
}

object IColorInfo {
  @scala.inline
  def apply(value: java.lang.String, className: java.lang.String = null): IColorInfo = {
    val __obj = js.Dynamic.literal(value = value)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[IColorInfo]
  }
}

