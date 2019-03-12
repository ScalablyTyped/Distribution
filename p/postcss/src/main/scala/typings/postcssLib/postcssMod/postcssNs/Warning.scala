package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a plugin warning. It can be created using Result#warn().
  */
trait Warning extends js.Object {
  /**
    * Column in the input file with this warning's source.
    */
  var column: scala.Double
  /**
    * The line in the input file with this warning's source.
    */
  var line: scala.Double
  /**
    * The CSS node that caused the warning.
    */
  var node: Node
  /**
    * Contains the name of the plugin that created this warning. When you
    * call Result#warn(), it will fill this property automatically.
    */
  var plugin: java.lang.String
  /**
    * Contains the warning message.
    */
  var text: java.lang.String
}

object Warning {
  @scala.inline
  def apply(
    column: scala.Double,
    line: scala.Double,
    node: Node,
    plugin: java.lang.String,
    text: java.lang.String,
    toString: () => java.lang.String
  ): Warning = {
    val __obj = js.Dynamic.literal(column = column, line = line, node = node, plugin = plugin, text = text, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Warning]
  }
}

