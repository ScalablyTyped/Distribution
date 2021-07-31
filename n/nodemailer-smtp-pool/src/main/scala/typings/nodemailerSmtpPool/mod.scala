package typings.nodemailerSmtpPool

import typings.node.tlsMod.ConnectionOptions
import typings.nodemailer.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(options: SmtpPoolOptions): Transport = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transport]
  
  @JSImport("nodemailer-smtp-pool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AuthOptions extends StObject {
    
    var pass: js.UndefOr[String] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
    
    var xoauth2: js.UndefOr[js.Any] = js.undefined
  }
  object AuthOptions {
    
    @scala.inline
    def apply(): AuthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthOptions]
    }
    
    @scala.inline
    implicit class AuthOptionsMutableBuilder[Self <: AuthOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      @scala.inline
      def setXoauth2(value: js.Any): Self = StObject.set(x, "xoauth2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXoauth2Undefined: Self = StObject.set(x, "xoauth2", js.undefined)
    }
  }
  
  trait SmtpPoolOptions extends StObject {
    
    /**
      *  defines authentication data (see authentication section below)
      */
    var auth: js.UndefOr[AuthOptions] = js.undefined
    
    /**
      * defines preferred authentication method, eg. 'PLAIN'
      */
    var authMethod: js.UndefOr[String] = js.undefined
    
    /**
      * how many milliseconds to wait for the connection to establish
      */
    var connectionTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * if true, the connection emits all traffic between client and server as 'log' events
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * how many milliseconds to wait for the greeting after connection is established
      */
    var greetingTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * is the hostname or IP address to connect to (defaults to 'localhost')
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      *  turns off STARTTLS support if true
      */
    var ignoreTLS: js.UndefOr[Boolean] = js.undefined
    
    /**
      * is the local interface to bind to for network connections
      */
    var localAddress: js.UndefOr[String] = js.undefined
    
    /**
      * (defaults to 5) is the count of maximum simultaneous connections to make against the SMTP server
      */
    var maxConnections: js.UndefOr[Double] = js.undefined
    
    /**
      * (defaults to 100) limits the message count to be sent using a single connection. After maxMessages messages the connection is dropped and a new one is created for the following messages
      */
    var maxMessages: js.UndefOr[Double] = js.undefined
    
    /**
      * optional hostname of the client, used for identifying to the server
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * is the port to connect to (defaults to 25 or 465)
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * defines if the connection should use SSL (if true) or not (if false)
      */
    var secure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * how many milliseconds of inactivity to allow
      */
    var socketTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      *  defines additional options to be passed to the socket constructor, eg. {rejectUnauthorized: true}
      */
    var tls: js.UndefOr[ConnectionOptions] = js.undefined
  }
  object SmtpPoolOptions {
    
    @scala.inline
    def apply(): SmtpPoolOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmtpPoolOptions]
    }
    
    @scala.inline
    implicit class SmtpPoolOptionsMutableBuilder[Self <: SmtpPoolOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: AuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthMethod(value: String): Self = StObject.set(x, "authMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthMethodUndefined: Self = StObject.set(x, "authMethod", js.undefined)
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setGreetingTimeout(value: Double): Self = StObject.set(x, "greetingTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreetingTimeoutUndefined: Self = StObject.set(x, "greetingTimeout", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setIgnoreTLS(value: Boolean): Self = StObject.set(x, "ignoreTLS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTLSUndefined: Self = StObject.set(x, "ignoreTLS", js.undefined)
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      @scala.inline
      def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
      
      @scala.inline
      def setTls(value: ConnectionOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    }
  }
}
