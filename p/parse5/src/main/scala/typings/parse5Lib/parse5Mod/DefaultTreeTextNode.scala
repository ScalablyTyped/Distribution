package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeTextNode extends DefaultTreeNode {
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeTextNode: parse5Lib.parse5LibStrings.`#text`
  /**
    * Parent node.
    */
  var parentNode: DefaultTreeParentNode
  /**
    * Text node source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.undefined
  /**
    * Text content.
    */
  var value: java.lang.String
}

object DefaultTreeTextNode {
  @scala.inline
  def apply(
    nodeName: parse5Lib.parse5LibStrings.`#text`,
    parentNode: DefaultTreeParentNode,
    value: java.lang.String,
    sourceCodeLocation: Location = null
  ): DefaultTreeTextNode = {
    val __obj = js.Dynamic.literal(nodeName = nodeName, parentNode = parentNode, value = value)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[DefaultTreeTextNode]
  }
}

