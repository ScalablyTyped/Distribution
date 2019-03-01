package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionDefinition extends ItemGroupDefinition {
  var info: js.UndefOr[postmanDashCollectionLib.Anon_Id] = js.undefined
  var variable: js.UndefOr[VariableDefinition] = js.undefined
}

object CollectionDefinition {
  @scala.inline
  def apply(
    auth: RequestAuthDefinition = null,
    description: java.lang.String | DescriptionDefinition = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    event: js.Array[EventDefinition] = null,
    id: java.lang.String = null,
    info: postmanDashCollectionLib.Anon_Id = null,
    item: js.Array[ItemDefinition | ItemGroupDefinition] = null,
    name: java.lang.String = null,
    variable: VariableDefinition = null
  ): CollectionDefinition = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (event != null) __obj.updateDynamic("event")(event)
    if (id != null) __obj.updateDynamic("id")(id)
    if (info != null) __obj.updateDynamic("info")(info)
    if (item != null) __obj.updateDynamic("item")(item)
    if (name != null) __obj.updateDynamic("name")(name)
    if (variable != null) __obj.updateDynamic("variable")(variable)
    __obj.asInstanceOf[CollectionDefinition]
  }
}

