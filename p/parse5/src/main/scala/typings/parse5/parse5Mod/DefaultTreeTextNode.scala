package typings.parse5.parse5Mod

import typings.parse5.parse5Strings.`#text`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeTextNode extends DefaultTreeChildNode {
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeTextNode: `#text`
  /**
    * Text node source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.undefined
  /**
    * Text content.
    */
  var value: String
}

object DefaultTreeTextNode {
  @scala.inline
  def apply(
    nodeName: `#text`,
    parentNode: DefaultTreeParentNode,
    value: String,
    sourceCodeLocation: Location = null
  ): DefaultTreeTextNode = {
    val __obj = js.Dynamic.literal(nodeName = nodeName, parentNode = parentNode, value = value)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[DefaultTreeTextNode]
  }
}

