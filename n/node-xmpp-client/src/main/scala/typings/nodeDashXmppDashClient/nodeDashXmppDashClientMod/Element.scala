package typings.nodeDashXmppDashClient.nodeDashXmppDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  def attr(attr: js.Any, `val`: js.Any): js.Any = js.native
  def c(name: String): Element = js.native
  def c(name: String, attrs: js.Any): Element = js.native
  def cnode(child: Element): Element = js.native
  def findNS(prefix: String): String = js.native
  def getAttrs(): js.Any = js.native
  def getNS(): String = js.native
  def getName(): String = js.native
  def getXmlns(): String = js.native
  def is(name: String, xmlns: String): Boolean = js.native
  def remove(el: Element, xmnls: String): Element = js.native
  def setAttrs(attrs: js.Any): Unit = js.native
  def t(text: String): Element = js.native
  def toJSON(): js.Any = js.native
  def up(): Element = js.native
}

