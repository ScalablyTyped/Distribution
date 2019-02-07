package typings
package polymerLib.polymerMod.Global.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomApi extends js.Object {
  var childNodes: js.Array[stdLib.Node] = js.native
  var children: js.Array[stdLib.Element] = js.native
  var firstChild: stdLib.Node = js.native
  var firstElementChild: stdLib.Element = js.native
  var innerHTML: java.lang.String = js.native
  var lastChild: stdLib.Node = js.native
  var lastElementChild: stdLib.Element = js.native
  var nextElementSibling: stdLib.Element = js.native
  var nextSibling: stdLib.Node = js.native
  var parentNode: stdLib.Node = js.native
  var previousElementSibling: stdLib.Element = js.native
  var previousSibling: stdLib.Node = js.native
  var textContent: java.lang.String = js.native
  def appendChild(node: stdLib.Node): stdLib.Node = js.native
  def getDestinationInsertionPoints(): js.Array[stdLib.Node] = js.native
  def getDistributedNodes(): js.Array[stdLib.Node] = js.native
  def getEffectiveChildNodes(): js.Array[stdLib.Node] = js.native
  def getOwnerRoot(): stdLib.Node = js.native
  def insertBefore(node: stdLib.Node): stdLib.Node = js.native
  def insertBefore(node: stdLib.Node, refNode: stdLib.Node): stdLib.Node = js.native
  def observeNodes(callback: js.Function1[/* info */ ObservedNodeInfo, scala.Unit]): js.Object = js.native
  def queryDistributedElements(selector: java.lang.String): js.Array[stdLib.Node] = js.native
  def querySelector(selector: java.lang.String): stdLib.Node = js.native
  def querySelectorAll(selector: java.lang.String): js.Array[stdLib.Node] = js.native
  def removeAttribute(name: java.lang.String): scala.Unit = js.native
  def removeChild(node: stdLib.Node): stdLib.Node = js.native
  def replaceChild(node: stdLib.Node, refNode: stdLib.Node): stdLib.Node = js.native
  def setAttribute(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def unobserveNodes(observer: js.Object): scala.Unit = js.native
}

