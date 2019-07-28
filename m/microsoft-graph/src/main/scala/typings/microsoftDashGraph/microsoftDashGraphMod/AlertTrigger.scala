package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertTrigger extends js.Object {
  // Name of the property serving as a detection trigger.
  var name: js.UndefOr[String] = js.undefined
  // Type of the property in the key:value pair for interpretation. For example, String, Boolean, etc.
  var `type`: js.UndefOr[String] = js.undefined
  // Value of the property serving as a detection trigger.
  var value: js.UndefOr[String] = js.undefined
}

object AlertTrigger {
  @scala.inline
  def apply(name: String = null, `type`: String = null, value: String = null): AlertTrigger = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AlertTrigger]
  }
}

