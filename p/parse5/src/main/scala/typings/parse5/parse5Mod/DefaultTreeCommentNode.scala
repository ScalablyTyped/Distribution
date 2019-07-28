package typings.parse5.parse5Mod

import typings.parse5.parse5Strings.`#comment`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeCommentNode extends DefaultTreeChildNode {
  /**
    * Comment text.
    */
  var data: String
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeCommentNode: `#comment`
  /**
    * Comment source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.undefined
}

object DefaultTreeCommentNode {
  @scala.inline
  def apply(
    data: String,
    nodeName: `#comment`,
    parentNode: DefaultTreeParentNode,
    sourceCodeLocation: Location = null
  ): DefaultTreeCommentNode = {
    val __obj = js.Dynamic.literal(data = data, nodeName = nodeName, parentNode = parentNode)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[DefaultTreeCommentNode]
  }
}

