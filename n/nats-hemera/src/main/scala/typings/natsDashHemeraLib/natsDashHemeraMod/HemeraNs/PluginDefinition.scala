package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginDefinition extends js.Object {
  var attributes: PluginDefinitionAttributes
  var options: js.Any
  var parentPluginName: java.lang.String
  var register: js.Any
}

object PluginDefinition {
  @scala.inline
  def apply(
    attributes: PluginDefinitionAttributes,
    options: js.Any,
    parentPluginName: java.lang.String,
    register: js.Any
  ): PluginDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("parentPluginName")(parentPluginName)
    __obj.updateDynamic("register")(register)
    __obj.asInstanceOf[PluginDefinition]
  }
}

