package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeElement extends DefaultTreeParentNode {
  /**
    * List of element attributes.
    */
  var attrs: js.Array[Attribute]
  /**
    * Element namespace.
    */
  var namespaceURI: java.lang.String
  /**
    * The name of the node. Equals to element {@link tagName}.
    */
  var nodeName: java.lang.String
  /**
    * Parent node.
    */
  var parentNode: DefaultTreeParentNode
  /**
    * Element source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[ElementLocation] = js.undefined
  /**
    * Element tag name.
    */
  var tagName: java.lang.String
}

object DefaultTreeElement {
  @scala.inline
  def apply(
    attrs: js.Array[Attribute],
    childNodes: js.Array[DefaultTreeNode],
    namespaceURI: java.lang.String,
    nodeName: java.lang.String,
    parentNode: DefaultTreeParentNode,
    tagName: java.lang.String,
    sourceCodeLocation: ElementLocation = null
  ): DefaultTreeElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attrs")(attrs)
    __obj.updateDynamic("childNodes")(childNodes)
    __obj.updateDynamic("namespaceURI")(namespaceURI)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("parentNode")(parentNode)
    __obj.updateDynamic("tagName")(tagName)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[DefaultTreeElement]
  }
}

