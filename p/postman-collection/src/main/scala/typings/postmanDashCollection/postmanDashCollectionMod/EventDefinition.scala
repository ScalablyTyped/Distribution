package typings.postmanDashCollection.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDefinition extends PropertyDefinition {
  var listen: js.UndefOr[String] = js.undefined
  var script: String | js.Array[String] | ScriptDefinition | Script
}

object EventDefinition {
  @scala.inline
  def apply(
    script: String | js.Array[String] | ScriptDefinition | Script,
    description: String | DescriptionDefinition = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    listen: String = null,
    name: String = null
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

