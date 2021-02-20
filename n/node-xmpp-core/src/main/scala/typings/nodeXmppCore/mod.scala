package typings.nodeXmppCore

import org.scalablytyped.runtime.StringDictionary
import typings.ltx.elementMod.Node
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-xmpp-core", "Connection")
  @js.native
  class Connection () extends EventEmitter {
    def this(opts: js.Any) = this()
  }
  
  @JSImport("node-xmpp-core", "Element")
  @js.native
  class Element protected ()
    extends typings.ltx.mod.Element {
    def this(name: String) = this()
    def this(name: String, attrs: String) = this()
    def this(name: String, attrs: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("node-xmpp-core", "IQ")
  @js.native
  class IQ () extends Stanza {
    def this(attrs: js.Any) = this()
  }
  
  @JSImport("node-xmpp-core", "JID")
  @js.native
  class JID protected () extends StObject {
    def this(local: String) = this()
    def this(local: String, domain: String) = this()
    def this(local: String, domain: js.UndefOr[scala.Nothing], resource: String) = this()
    def this(local: String, domain: String, resource: String) = this()
    
    /**
      * Convenience method to distinguish users
      */
    def bare(): JID = js.native
    
    var domain: String = js.native
    
    /**
      * Comparison function
      */
    def equals(other: JID): Boolean = js.native
    
    def getDomain(): String = js.native
    
    def getLocal(): String = js.native
    def getLocal(unescape: js.Any): String = js.native
    
    def getResource(): String = js.native
    
    var local: String = js.native
    
    def parseJID(jid: String): Unit = js.native
    
    var resource: String = js.native
    
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
  
  @JSImport("node-xmpp-core", "Message")
  @js.native
  class Message () extends Stanza {
    def this(attrs: js.Any) = this()
  }
  
  @JSImport("node-xmpp-core", "Presence")
  @js.native
  class Presence () extends Stanza {
    def this(attrs: js.Any) = this()
  }
  
  object SRV {
    
    /**
      * returns a lazy iterator which can be restarted via connection.connect()
      */
    @JSImport("node-xmpp-core", "SRV.connect")
    @js.native
    def connect(): js.Any = js.native
    @JSImport("node-xmpp-core", "SRV.connect")
    @js.native
    def connect(opts: js.Any): js.Any = js.native
  }
  
  @JSImport("node-xmpp-core", "Stanza")
  @js.native
  class Stanza protected ()
    extends typings.ltx.mod.Element {
    def this(name: String) = this()
    def this(name: String, attrs: js.Any) = this()
    
    var from: String = js.native
    
    var id: String = js.native
    
    var to: String = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("node-xmpp-core", "createElement")
  @js.native
  def createElement(name: String, attrs: js.UndefOr[scala.Nothing], children: Node*): typings.ltx.elementMod.Element = js.native
  @JSImport("node-xmpp-core", "createElement")
  @js.native
  def createElement(name: String, attrs: String, children: Node*): typings.ltx.elementMod.Element = js.native
  @JSImport("node-xmpp-core", "createElement")
  @js.native
  def createElement(name: String, attrs: StringDictionary[js.Any], children: Node*): typings.ltx.elementMod.Element = js.native
  
  @JSImport("node-xmpp-core", "createStanza")
  @js.native
  def createStanza(name: String): typings.ltx.mod.Element = js.native
  @JSImport("node-xmpp-core", "createStanza")
  @js.native
  def createStanza(name: String, attrs: js.Any): typings.ltx.mod.Element = js.native
  
  @JSImport("node-xmpp-core", "escapeXML")
  @js.native
  def escapeXML(s: String): String = js.native
  
  @JSImport("node-xmpp-core", "escapeXMLText")
  @js.native
  def escapeXMLText(s: String): String = js.native
}
