package typings.nodeXmppCore

import org.scalablytyped.runtime.StringDictionary
import typings.ltx.elementMod.Node
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-xmpp-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    def this(local: String, domain: String, resource: String) = this()
    def this(local: String, domain: Unit, resource: String) = this()
    
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
    
    @JSImport("node-xmpp-core", "SRV")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * returns a lazy iterator which can be restarted via connection.connect()
      */
    inline def connect(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[js.Any]
    inline def connect(opts: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]
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
  
  inline def createElement(name: String, attrs: String, children: Node*): typings.ltx.elementMod.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.ltx.elementMod.Element]
  inline def createElement(name: String, attrs: StringDictionary[js.Any], children: Node*): typings.ltx.elementMod.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.ltx.elementMod.Element]
  inline def createElement(name: String, attrs: Unit, children: Node*): typings.ltx.elementMod.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.ltx.elementMod.Element]
  
  inline def createStanza(name: String): typings.ltx.mod.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("createStanza")(name.asInstanceOf[js.Any]).asInstanceOf[typings.ltx.mod.Element]
  inline def createStanza(name: String, attrs: js.Any): typings.ltx.mod.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createStanza")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[typings.ltx.mod.Element]
  
  inline def escapeXML(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeXML")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeXMLText(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeXMLText")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
