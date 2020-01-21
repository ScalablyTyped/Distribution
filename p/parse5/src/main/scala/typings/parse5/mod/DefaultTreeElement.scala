package typings.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.parse5.mod.DefaultTreeNode because Already inherited
- typings.parse5.mod.DefaultTreeParentNode because var conflicts: nodeName. Inlined childNodes */ trait DefaultTreeElement extends DefaultTreeChildNode {
  /**
    * List of element attributes.
    */
  var attrs: js.Array[Attribute]
  /**
    * Child nodes.
    */
  var childNodes: js.Array[DefaultTreeNode]
  /**
    * Element namespace.
    */
  var namespaceURI: String
  /**
    * Element source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[ElementLocation] = js.undefined
  /**
    * Element tag name.
    */
  var tagName: String
}

object DefaultTreeElement {
  @scala.inline
  def apply(
    attrs: js.Array[Attribute],
    childNodes: js.Array[DefaultTreeNode],
    namespaceURI: String,
    nodeName: String,
    parentNode: DefaultTreeParentNode,
    tagName: String,
    sourceCodeLocation: ElementLocation = null
  ): DefaultTreeElement = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeElement]
  }
}

