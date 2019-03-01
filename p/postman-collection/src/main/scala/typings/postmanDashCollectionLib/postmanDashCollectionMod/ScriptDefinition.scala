package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptDefinition extends PropertyDefinition {
  var exec: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var src: js.UndefOr[java.lang.String | Url] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ScriptDefinition {
  @scala.inline
  def apply(
    description: java.lang.String | DescriptionDefinition = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    exec: java.lang.String | js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    src: java.lang.String | Url = null,
    `type`: java.lang.String = null
  ): ScriptDefinition = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (exec != null) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ScriptDefinition]
  }
}

