package typings
package nodeDashXmppDashClientLib.nodeDashXmppDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  def attr(attr: js.Any, `val`: js.Any): js.Any = js.native
  def c(name: java.lang.String): Element = js.native
  def c(name: java.lang.String, attrs: js.Any): Element = js.native
  def cnode(child: Element): Element = js.native
  def findNS(prefix: java.lang.String): java.lang.String = js.native
  def getAttrs(): js.Any = js.native
  def getNS(): java.lang.String = js.native
  def getName(): java.lang.String = js.native
  def getXmlns(): java.lang.String = js.native
  def is(name: java.lang.String, xmlns: java.lang.String): scala.Boolean = js.native
  def remove(el: Element, xmnls: java.lang.String): Element = js.native
  def setAttrs(attrs: js.Any): scala.Unit = js.native
  def t(text: java.lang.String): Element = js.native
  def toJSON(): js.Any = js.native
  def up(): Element = js.native
}

