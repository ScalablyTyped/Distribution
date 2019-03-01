package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemGroupDefinition extends PropertyDefinition {
  var auth: js.UndefOr[RequestAuthDefinition] = js.undefined
  var event: js.UndefOr[js.Array[EventDefinition]] = js.undefined
  var item: js.UndefOr[js.Array[ItemDefinition | ItemGroupDefinition]] = js.undefined
}

object ItemGroupDefinition {
  @scala.inline
  def apply(
    auth: RequestAuthDefinition = null,
    description: java.lang.String | DescriptionDefinition = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    event: js.Array[EventDefinition] = null,
    id: java.lang.String = null,
    item: js.Array[ItemDefinition | ItemGroupDefinition] = null,
    name: java.lang.String = null
  ): ItemGroupDefinition = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (event != null) __obj.updateDynamic("event")(event)
    if (id != null) __obj.updateDynamic("id")(id)
    if (item != null) __obj.updateDynamic("item")(item)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ItemGroupDefinition]
  }
}

