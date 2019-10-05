package typings.nodeDashXmppDashCore

import org.scalablytyped.runtime.StringDictionary
import typings.ltx.libElementMod.Node
import typings.node.eventsMod.EventEmitter
import typings.nodeDashXmppDashCore.nodeDashXmppDashCoreMod.JID
import typings.nodeDashXmppDashCore.nodeDashXmppDashCoreMod.Stanza
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-xmpp-core", JSImport.Namespace)
@js.native
object nodeDashXmppDashCoreMod extends js.Object {
  @js.native
  class Connection () extends EventEmitter {
    def this(opts: js.Any) = this()
  }
  
  @js.native
  class Element protected ()
    extends typings.ltx.ltxMod.Element {
    def this(name: String) = this()
    def this(name: String, attrs: String) = this()
    def this(name: String, attrs: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class IQ () extends Stanza {
    def this(attrs: js.Any) = this()
  }
  
  @js.native
  class JID protected () extends js.Object {
    def this(local: String) = this()
    def this(local: String, domain: String) = this()
    def this(local: String, domain: String, resource: String) = this()
    var domain: String = js.native
    var local: String = js.native
    var resource: String = js.native
    /**
      * Convenience method to distinguish users
      */
    def bare(): JID = js.native
    /**
      * Comparison function
      */
    def equals(other: JID): Boolean = js.native
    def getDomain(): String = js.native
    def getLocal(): String = js.native
    def getLocal(unescape: js.Any): String = js.native
    def getResource(): String = js.native
    def parseJID(jid: String): Unit = js.native
    /**
      * http://xmpp.org/rfcs/rfc6122.html#addressing-domain
      */
    def setDomain(value: String): Unit = js.native
    /**
      * http://xmpp.org/rfcs/rfc6122.html#addressing-localpart
      */
    def setLocal(local: String): Unit = js.native
    def setLocal(local: String, escape: js.Any): Unit = js.native
    /**
      * http://xmpp.org/rfcs/rfc6122.html#addressing-resourcepart
      */
    def setResource(value: String): Unit = js.native
    def toString(unescape: js.Any): String = js.native
  }
  
  @js.native
  class Message () extends Stanza {
    def this(attrs: js.Any) = this()
  }
  
  @js.native
  class Presence () extends Stanza {
    def this(attrs: js.Any) = this()
  }
  
  @js.native
  class Stanza protected ()
    extends typings.ltx.ltxMod.Element {
    def this(name: String) = this()
    def this(name: String, attrs: js.Any) = this()
    var from: String = js.native
    var id: String = js.native
    var to: String = js.native
    var `type`: String = js.native
  }
  
  def createElement(name: String): typings.ltx.libElementMod.Element = js.native
  def createElement(name: String, attrs: String, children: Node*): typings.ltx.libElementMod.Element = js.native
  def createElement(name: String, attrs: StringDictionary[js.Any], children: Node*): typings.ltx.libElementMod.Element = js.native
  def createStanza(name: String): typings.ltx.ltxMod.Element = js.native
  def createStanza(name: String, attrs: js.Any): typings.ltx.ltxMod.Element = js.native
  def escapeXML(s: String): String = js.native
  def escapeXMLText(s: String): String = js.native
  @js.native
  object SRV extends js.Object {
    /**
      * returns a lazy iterator which can be restarted via connection.connect()
      */
    def connect(): js.Any = js.native
    def connect(opts: js.Any): js.Any = js.native
  }
  
}

