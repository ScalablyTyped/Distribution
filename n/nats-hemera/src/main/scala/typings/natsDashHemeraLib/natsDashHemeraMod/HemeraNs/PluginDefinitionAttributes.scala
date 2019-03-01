package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginDefinitionAttributes extends js.Object {
  var description: java.lang.String
  var name: java.lang.String
  var version: java.lang.String
}

object PluginDefinitionAttributes {
  @scala.inline
  def apply(description: java.lang.String, name: java.lang.String, version: java.lang.String): PluginDefinitionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PluginDefinitionAttributes]
  }
}

