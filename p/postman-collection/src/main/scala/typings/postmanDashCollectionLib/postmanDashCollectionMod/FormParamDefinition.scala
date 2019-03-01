package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormParamDefinition extends PropertyDefinition {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object FormParamDefinition {
  @scala.inline
  def apply(
    description: java.lang.String | DescriptionDefinition = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    key: java.lang.String = null,
    name: java.lang.String = null,
    value: js.Any = null
  ): FormParamDefinition = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (key != null) __obj.updateDynamic("key")(key)
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FormParamDefinition]
  }
}

