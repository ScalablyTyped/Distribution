package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeCommentNode extends DefaultTreeChildNode {
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
    * Comment source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.undefined
}

object DefaultTreeCommentNode {
  @scala.inline
  def apply(
    data: java.lang.String,
    nodeName: parse5Lib.parse5LibStrings.`#comment`,
    parentNode: DefaultTreeParentNode,
    sourceCodeLocation: Location = null
  ): DefaultTreeCommentNode = {
    val __obj = js.Dynamic.literal(data = data, nodeName = nodeName, parentNode = parentNode)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[DefaultTreeCommentNode]
  }
}

