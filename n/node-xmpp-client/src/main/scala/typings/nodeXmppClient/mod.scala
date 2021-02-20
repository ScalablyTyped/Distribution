package typings.nodeXmppClient

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-xmpp-client", "Client")
  @js.native
  class Client protected () extends StObject {
    def this(options: XmppOptions) = this()
    
    def connect(): Unit = js.native
    
    def disconnect(): Unit = js.native
    
    def on(event: String, c: js.Function2[/* e */ js.Any, /* d */ js.Any, _]): Unit = js.native
    
    def send(stanza: js.Any): Unit = js.native
  }
  /* static members */
  object Client {
    
    @JSImport("node-xmpp-client", "Client")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-xmpp-client", "Client.Stanza")
    @js.native
    def Stanza: typings.nodeXmppClient.mod.Stanza = js.native
    @scala.inline
    def Stanza_=(x: Stanza): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stanza")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Bosh extends StObject {
    
    var prebind: js.UndefOr[js.Function2[/* error */ js.Any, /* data */ js.Any, Unit]] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Bosh {
    
    @scala.inline
    def apply(): Bosh = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bosh]
    }
    
    @scala.inline
    implicit class BoshMutableBuilder[Self <: Bosh] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrebind(value: (/* error */ js.Any, /* data */ js.Any) => Unit): Self = StObject.set(x, "prebind", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrebindUndefined: Self = StObject.set(x, "prebind", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Element extends StObject {
    
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
  
  @js.native
  trait Stanza
    extends Element
       with // This has to be used for the static class initializer new Client.Stanza(..). If there is a better way feel free to
  // contribute.
  // tslint:disable-next-line:no-misused-new
  Instantiable2[/* name */ String, /* attr */ js.Any, Stanza] {
    
    var from: String = js.native
    
    var id: String = js.native
    
    var to: String = js.native
    
    var `type`: String = js.native
  }
  
  @js.native
  trait XmppOptions extends StObject {
    
    // Dictionary (optional) - TLS or SSL key and certificate credentials
    var actAs: js.UndefOr[String] = js.native
    
    var autostart: js.UndefOr[Boolean] = js.native
    
    // Preferred SASL mechanism to use
    var bosh: js.UndefOr[Bosh] = js.native
    
    // connect to the legacy SSL port, requires at least the host to be specified
    var credentials: js.UndefOr[js.Any] = js.native
    
    // if admin user act on behalf of another user (just user)
    var disallowTLS: js.UndefOr[Boolean] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var jid: String = js.native
    
    // register account before authentication
    var legacySSL: js.UndefOr[Boolean] = js.native
    
    var password: String = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    // prevent upgrading the connection to a secure one via TLS
    var preferred: js.UndefOr[String] = js.native
    
    var reconnect: js.UndefOr[Boolean] = js.native
    
    // if we start connecting to a given port
    var register: js.UndefOr[Boolean] = js.native
  }
  object XmppOptions {
    
    @scala.inline
    def apply(jid: String, password: String): XmppOptions = {
      val __obj = js.Dynamic.literal(jid = jid.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmppOptions]
    }
    
    @scala.inline
    implicit class XmppOptionsMutableBuilder[Self <: XmppOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActAs(value: String): Self = StObject.set(x, "actAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActAsUndefined: Self = StObject.set(x, "actAs", js.undefined)
      
      @scala.inline
      def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
      
      @scala.inline
      def setBosh(value: Bosh): Self = StObject.set(x, "bosh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoshUndefined: Self = StObject.set(x, "bosh", js.undefined)
      
      @scala.inline
      def setCredentials(value: js.Any): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setDisallowTLS(value: Boolean): Self = StObject.set(x, "disallowTLS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallowTLSUndefined: Self = StObject.set(x, "disallowTLS", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setJid(value: String): Self = StObject.set(x, "jid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegacySSL(value: Boolean): Self = StObject.set(x, "legacySSL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegacySSLUndefined: Self = StObject.set(x, "legacySSL", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPreferred(value: String): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
      
      @scala.inline
      def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      @scala.inline
      def setRegister(value: Boolean): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
    }
  }
}
