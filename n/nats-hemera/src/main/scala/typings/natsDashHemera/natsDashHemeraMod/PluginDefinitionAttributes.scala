package typings.natsDashHemera.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginDefinitionAttributes extends js.Object {
  var description: String
  var name: String
  var version: String
}

object PluginDefinitionAttributes {
  @scala.inline
  def apply(description: String, name: String, version: String): PluginDefinitionAttributes = {
    val __obj = js.Dynamic.literal(description = description, name = name, version = version)
  
    __obj.asInstanceOf[PluginDefinitionAttributes]
  }
}

