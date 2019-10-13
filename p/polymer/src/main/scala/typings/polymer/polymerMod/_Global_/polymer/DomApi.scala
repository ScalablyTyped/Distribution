package typings.polymer.polymerMod._Global_.polymer

import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomApi extends js.Object {
  var childNodes: js.Array[Node] = js.native
  var children: js.Array[Element] = js.native
  var firstChild: Node = js.native
  var firstElementChild: Element = js.native
  var innerHTML: String = js.native
  var lastChild: Node = js.native
  var lastElementChild: Element = js.native
  var nextElementSibling: Element = js.native
  var nextSibling: Node = js.native
  var parentNode: Node = js.native
  var previousElementSibling: Element = js.native
  var previousSibling: Node = js.native
  var textContent: String = js.native
  def appendChild(node: Node): Node = js.native
  def getDestinationInsertionPoints(): js.Array[Node] = js.native
  def getDistributedNodes(): js.Array[Node] = js.native
  def getEffectiveChildNodes(): js.Array[Node] = js.native
  def getOwnerRoot(): Node = js.native
  def insertBefore(node: Node): Node = js.native
  def insertBefore(node: Node, refNode: Node): Node = js.native
  def observeNodes(callback: js.Function1[/* info */ ObservedNodeInfo, Unit]): js.Object = js.native
  def queryDistributedElements(selector: String): js.Array[Node] = js.native
  def querySelector(selector: String): Node = js.native
  def querySelectorAll(selector: String): js.Array[Node] = js.native
  def removeAttribute(name: String): Unit = js.native
  def removeChild(node: Node): Node = js.native
  def replaceChild(node: Node, refNode: Node): Node = js.native
  def setAttribute(name: String, value: js.Any): Unit = js.native
  def unobserveNodes(observer: js.Object): Unit = js.native
}

