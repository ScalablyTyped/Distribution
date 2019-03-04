package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDefinition extends PropertyDefinition {
  var listen: js.UndefOr[java.lang.String] = js.undefined
  var script: java.lang.String | js.Array[java.lang.String] | ScriptDefinition | Script
}

object EventDefinition {
  @scala.inline
  def apply(
    script: java.lang.String | js.Array[java.lang.String] | ScriptDefinition | Script,
    description: java.lang.String | DescriptionDefinition = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    listen: java.lang.String = null,
    name: java.lang.String = null
  ): EventDefinition = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (listen != null) __obj.updateDynamic("listen")(listen)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[EventDefinition]
  }
}

