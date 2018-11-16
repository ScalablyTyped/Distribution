package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DefaultTreeCommentNode extends DefaultTreeNode {
  /**
       * Comment text.
       */
  var data: java.lang.String
  /**
       * The name of the node.
       */
  @JSName("nodeName")
  var nodeName_DefaultTreeCommentNode: parse5Lib.parse5LibStrings.`#comment`
  /**
       * Parent node.
       */
  var parentNode: DefaultTreeParentNode
  /**
       * Comment source code location info. Available if location info is enabled via {@link ParserOptions}.
       */
  var sourceCodeLocation: js.UndefOr[Location] = js.undefined
}

