package typings.postmanDashCollection.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemDefinition extends PropertyDefinition {
  var events: js.UndefOr[js.Array[EventDefinition]] = js.undefined
  var request: js.UndefOr[RequestDefinition] = js.undefined
  var responses: js.UndefOr[js.Array[ResponseDefinition]] = js.undefined
}

object ItemDefinition {
  @scala.inline
  def apply(
    description: String | DescriptionDefinition = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    events: js.Array[EventDefinition] = null,
    id: String = null,
    name: String = null,
    request: RequestDefinition = null,
    responses: js.Array[ResponseDefinition] = null
  ): ItemDefinition = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemDefinition]
  }
}

