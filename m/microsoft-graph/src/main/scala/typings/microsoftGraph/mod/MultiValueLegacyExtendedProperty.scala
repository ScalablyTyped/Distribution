package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiValueLegacyExtendedProperty extends Entity {
  // A collection of property values.
  var value: js.UndefOr[js.Array[String]] = js.undefined
}

object MultiValueLegacyExtendedProperty {
  @scala.inline
  def apply(id: String = null, value: js.Array[String] = null): MultiValueLegacyExtendedProperty = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiValueLegacyExtendedProperty]
  }
}

