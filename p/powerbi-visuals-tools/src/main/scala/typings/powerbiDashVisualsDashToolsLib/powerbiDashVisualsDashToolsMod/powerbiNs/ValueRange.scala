package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueRange[T] extends js.Object {
  var max: js.UndefOr[T] = js.undefined
  var min: js.UndefOr[T] = js.undefined
}

object ValueRange {
  @scala.inline
  def apply[T](max: T = null, min: T = null): ValueRange[T] = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueRange[T]]
  }
}

