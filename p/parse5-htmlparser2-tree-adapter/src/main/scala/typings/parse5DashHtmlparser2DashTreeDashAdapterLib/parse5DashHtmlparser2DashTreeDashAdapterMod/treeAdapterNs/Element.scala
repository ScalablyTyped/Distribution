package typings
package parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterMod.treeAdapterNs

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
  var attribs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * The name of the node. Equals to element {@link tagName}.
    */
  var name: java.lang.String
  /**
    * Element namespace.
    */
  var namespace: java.lang.String
  /**
    * Element source code location info. Available if location info is enabled via ParserOptions.
    */
  var sourceCodeLocation: js.UndefOr[parse5Lib.parse5Mod.ElementLocation] = js.undefined
  /**
    * Element tag name.
    */
  var tagName: java.lang.String
  /**
    * Element attribute namespaces.
    */
  var `x-attribsNamespace`: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Element attribute namespace-related prefixes.
    */
  var `x-attribsPrefix`: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object Element {
  @scala.inline
  def apply(
    attribs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    childNodes: js.Array[Node],
    children: js.Array[Node],
    firstChild: Node,
    lastChild: Node,
    name: java.lang.String,
    namespace: java.lang.String,
    next: Node,
    nextSibling: Node,
    nodeType: scala.Double,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    tagName: java.lang.String,
    `type`: java.lang.String,
    `x-attribsNamespace`: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    `x-attribsPrefix`: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    sourceCodeLocation: parse5Lib.parse5Mod.ElementLocation = null
  ): Element = {
    val __obj = js.Dynamic.literal(attribs = attribs, childNodes = childNodes, children = children, firstChild = firstChild, lastChild = lastChild, name = name, namespace = namespace, next = next, nextSibling = nextSibling, nodeType = nodeType, parent = parent, parentNode = parentNode, prev = prev, previousSibling = previousSibling, tagName = tagName)
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("x-attribsNamespace")(`x-attribsNamespace`)
    __obj.updateDynamic("x-attribsPrefix")(`x-attribsPrefix`)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[Element]
  }
}

