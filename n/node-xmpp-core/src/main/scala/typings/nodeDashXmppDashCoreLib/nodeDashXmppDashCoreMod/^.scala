package typings
package nodeDashXmppDashCoreLib.nodeDashXmppDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-xmpp-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createElement(name: java.lang.String): ltxLib.libElementMod.Element = js.native
  def createElement(name: java.lang.String, attrs: java.lang.String, children: ltxLib.libElementMod.Node*): ltxLib.libElementMod.Element = js.native
  def createElement(
    name: java.lang.String,
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    children: ltxLib.libElementMod.Node*
  ): ltxLib.libElementMod.Element = js.native
  def createStanza(name: java.lang.String): ltxLib.ltxMod.Element = js.native
  def createStanza(name: java.lang.String, attrs: js.Any): ltxLib.ltxMod.Element = js.native
  def escapeXML(s: java.lang.String): java.lang.String = js.native
  def escapeXMLText(s: java.lang.String): java.lang.String = js.native
}

