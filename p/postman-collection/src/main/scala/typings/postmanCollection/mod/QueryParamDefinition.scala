package typings.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParamDefinition extends PropertyDefinition {
  var key: String | Null
  var system: js.UndefOr[Boolean] = js.undefined
  var value: String | Null
}

object QueryParamDefinition {
  @scala.inline
  def apply(
    description: String | DescriptionDefinition = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    key: String = null,
    name: String = null,
    system: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): QueryParamDefinition = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(system)) __obj.updateDynamic("system")(system.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParamDefinition]
  }
}

