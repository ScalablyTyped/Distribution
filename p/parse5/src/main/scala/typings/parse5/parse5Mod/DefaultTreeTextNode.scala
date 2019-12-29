package typings.parse5.parse5Mod

import typings.parse5.parse5Strings.Numbersigntext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeTextNode extends DefaultTreeChildNode {
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeTextNode: Numbersigntext
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
    nodeName: Numbersigntext,
    parentNode: DefaultTreeParentNode,
    value: String,
    sourceCodeLocation: Location = null
  ): DefaultTreeTextNode = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeTextNode]
  }
}

