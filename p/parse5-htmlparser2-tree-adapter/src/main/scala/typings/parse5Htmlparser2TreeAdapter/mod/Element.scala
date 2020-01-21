package typings.parse5Htmlparser2TreeAdapter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.parse5.mod.ElementLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * htmlparser2 tree adapter Element interface.
  */
trait Element extends ParentNode {
  /**
    * Element attributes.
    */
  var attribs: StringDictionary[String]
  /**
    * The name of the node. Equals to element {@link tagName}.
    */
  var name: String
  /**
    * Element namespace.
    */
  var namespace: String
  /**
    * Element source code location info. Available if location info is enabled via ParserOptions.
    */
  var sourceCodeLocation: js.UndefOr[ElementLocation] = js.undefined
  /**
    * Element tag name.
    */
  var tagName: String
  /**
    * Element attribute namespaces.
    */
  var `x-attribsNamespace`: StringDictionary[String]
  /**
    * Element attribute namespace-related prefixes.
    */
  var `x-attribsPrefix`: StringDictionary[String]
}

object Element {
  @scala.inline
  def apply(
    attribs: StringDictionary[String],
    childNodes: js.Array[Node],
    children: js.Array[Node],
    firstChild: Node,
    lastChild: Node,
    name: String,
    namespace: String,
    next: Node,
    nextSibling: Node,
    nodeType: Double,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    tagName: String,
    `type`: String,
    `x-attribsNamespace`: StringDictionary[String],
    `x-attribsPrefix`: StringDictionary[String],
    sourceCodeLocation: ElementLocation = null
  ): Element = {
    val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-attribsNamespace")(`x-attribsNamespace`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-attribsPrefix")(`x-attribsPrefix`.asInstanceOf[js.Any])
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

