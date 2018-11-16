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

