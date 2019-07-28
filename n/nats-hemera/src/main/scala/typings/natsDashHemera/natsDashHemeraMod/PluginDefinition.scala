package typings.natsDashHemera.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginDefinition extends js.Object {
  var attributes: PluginDefinitionAttributes
  var options: js.Any
  var parentPluginName: String
  var register: js.Any
}

object PluginDefinition {
  @scala.inline
  def apply(
    attributes: PluginDefinitionAttributes,
    options: js.Any,
    parentPluginName: String,
    register: js.Any
  ): PluginDefinition = {
    val __obj = js.Dynamic.literal(attributes = attributes, options = options, parentPluginName = parentPluginName, register = register)
  
    __obj.asInstanceOf[PluginDefinition]
  }
}

