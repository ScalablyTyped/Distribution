package typings
package parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterMod.treeAdapterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * htmlparser2 tree adapter ParentNode interface.
  */
trait ParentNode extends Node {
  /**
    * Same as {@link children}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
    */
  var childNodes: js.Array[Node]
  /**
    * Child nodes.
    */
  var children: js.Array[Node]
  /**
    * First child of the node.
    */
  var firstChild: Node
  /**
    * Last child of the node.
    */
  var lastChild: Node
}

