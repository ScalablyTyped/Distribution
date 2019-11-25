package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleValueLegacyExtendedProperty extends Entity {
  // A property value.
  var value: js.UndefOr[String] = js.undefined
}

object SingleValueLegacyExtendedProperty {
  @scala.inline
  def apply(id: String = null, value: String = null): SingleValueLegacyExtendedProperty = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleValueLegacyExtendedProperty]
  }
}

