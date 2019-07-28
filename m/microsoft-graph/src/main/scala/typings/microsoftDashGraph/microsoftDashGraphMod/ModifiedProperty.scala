package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifiedProperty extends js.Object {
  // Indicates the property name of the target attribute that was changed.
  var displayName: js.UndefOr[String] = js.undefined
  // Indicates the updated value for the propery.
  var newValue: js.UndefOr[String] = js.undefined
  // Indicates the previous value (before the update) for the property.
  var oldValue: js.UndefOr[String] = js.undefined
}

object ModifiedProperty {
  @scala.inline
  def apply(displayName: String = null, newValue: String = null, oldValue: String = null): ModifiedProperty = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (newValue != null) __obj.updateDynamic("newValue")(newValue)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[ModifiedProperty]
  }
}

