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
    val __obj = js.Dynamic.literal(`type` = `type`, `x-attribsNamespace` = `x-attribsNamespace`, `x-attribsPrefix` = `x-attribsPrefix`)
    __obj.updateDynamic("attribs")(attribs)
    __obj.updateDynamic("childNodes")(childNodes)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("firstChild")(firstChild)
    __obj.updateDynamic("lastChild")(lastChild)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("nextSibling")(nextSibling)
    __obj.updateDynamic("nodeType")(nodeType)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("parentNode")(parentNode)
    __obj.updateDynamic("prev")(prev)
    __obj.updateDynamic("previousSibling")(previousSibling)
    __obj.updateDynamic("tagName")(tagName)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[Element]
  }
}

