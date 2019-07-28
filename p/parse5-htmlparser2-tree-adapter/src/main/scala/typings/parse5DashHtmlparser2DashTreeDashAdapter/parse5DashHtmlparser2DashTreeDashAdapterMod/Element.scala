package typings.parse5DashHtmlparser2DashTreeDashAdapter.parse5DashHtmlparser2DashTreeDashAdapterMod

import org.scalablytyped.runtime.StringDictionary
import typings.parse5.parse5Mod.ElementLocation
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
    val __obj = js.Dynamic.literal(attribs = attribs, childNodes = childNodes, children = children, firstChild = firstChild, lastChild = lastChild, name = name, namespace = namespace, next = next, nextSibling = nextSibling, nodeType = nodeType, parent = parent, parentNode = parentNode, prev = prev, previousSibling = previousSibling, tagName = tagName)
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("x-attribsNamespace")(`x-attribsNamespace`)
    __obj.updateDynamic("x-attribsPrefix")(`x-attribsPrefix`)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[Element]
  }
}

