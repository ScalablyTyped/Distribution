package typings.postmanDashCollection.postmanDashCollectionMod

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
    description: String | DescriptionDefinition = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    event: js.Array[EventDefinition] = null,
    id: String = null,
    item: js.Array[ItemDefinition | ItemGroupDefinition] = null,
    name: String = null
  ): ItemGroupDefinition = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemGroupDefinition]
  }
}

