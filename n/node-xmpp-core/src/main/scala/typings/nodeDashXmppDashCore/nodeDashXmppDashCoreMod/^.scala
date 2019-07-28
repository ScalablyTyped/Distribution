package typings.nodeDashXmppDashCore.nodeDashXmppDashCoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.ltx.libElementMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-xmpp-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createElement(name: String): typings.ltx.libElementMod.Element = js.native
  def createElement(name: String, attrs: String, children: Node*): typings.ltx.libElementMod.Element = js.native
  def createElement(name: String, attrs: StringDictionary[js.Any], children: Node*): typings.ltx.libElementMod.Element = js.native
  def createStanza(name: String): typings.ltx.ltxMod.Element = js.native
  def createStanza(name: String, attrs: js.Any): typings.ltx.ltxMod.Element = js.native
  def escapeXML(s: String): String = js.native
  def escapeXMLText(s: String): String = js.native
}

