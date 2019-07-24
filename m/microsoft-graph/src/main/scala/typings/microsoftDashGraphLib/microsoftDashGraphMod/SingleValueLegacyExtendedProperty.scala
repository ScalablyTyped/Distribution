package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleValueLegacyExtendedProperty extends Entity {
  // A property value.
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object SingleValueLegacyExtendedProperty {
  @scala.inline
  def apply(id: java.lang.String = null, value: java.lang.String = null): SingleValueLegacyExtendedProperty = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SingleValueLegacyExtendedProperty]
  }
}

