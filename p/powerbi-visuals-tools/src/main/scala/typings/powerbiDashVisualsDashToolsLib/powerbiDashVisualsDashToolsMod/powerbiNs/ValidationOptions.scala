package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptions extends js.Object {
  var numberRange: js.UndefOr[NumberRange] = js.undefined
}

object ValidationOptions {
  @scala.inline
  def apply(numberRange: NumberRange = null): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    if (numberRange != null) __obj.updateDynamic("numberRange")(numberRange)
    __obj.asInstanceOf[ValidationOptions]
  }
}

