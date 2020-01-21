package typings.postmanCollection.mod

import typings.postmanCollection.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionDefinition extends ItemGroupDefinition {
  var info: js.UndefOr[AnonId] = js.undefined
  var variable: js.UndefOr[VariableDefinition] = js.undefined
}

object CollectionDefinition {
  @scala.inline
  def apply(
    auth: RequestAuthDefinition = null,
    description: String | DescriptionDefinition = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    event: js.Array[EventDefinition] = null,
    id: String = null,
    info: AnonId = null,
    item: js.Array[ItemDefinition | ItemGroupDefinition] = null,
    name: String = null,
    variable: VariableDefinition = null
  ): CollectionDefinition = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionDefinition]
  }
}

