package typings.nodemailerSmtpTransport

import typings.node.tlsMod.ConnectionOptions
import typings.nodemailer.mod.Transport
import typings.nodemailerSmtpTransport.anon.MaxConnections
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: SmtpOptions): Transport[Any] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transport[Any]]
  
  @JSImport("nodemailer-smtp-transport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AuthOptions extends StObject {
    
    /** is the access token for the user. Required only if refreshToken is not available and there is no token refresh callback specified */
    var accessToken: js.UndefOr[String] = js.undefined
    
    /** is an optional HTTP endpoint for requesting new access tokens. This value defaults to Gmail */
    var accessUrl: js.UndefOr[String] = js.undefined
    
    /** is the registered client id of the application */
    var clientId: js.UndefOr[String] = js.undefined
    
    /** is the registered client secret of the application */
    var clientSecret: js.UndefOr[String] = js.undefined
    
    /** is an optional expiration time for the current accessToken */
    var expires: js.UndefOr[Double] = js.undefined
    
    /** is the password for the user if normal login is used */
    var pass: js.UndefOr[String] = js.undefined
    
    /** is the private key contents, you can find it from the “private_key” field in the service key file */
    var privateKey: js.UndefOr[String] = js.undefined
    
    /** is an optional refresh token. If it is provided then Nodemailer tries to generate a new access token if existing one expires or fails */
    var refreshToken: js.UndefOr[String] = js.undefined
    
    /** service client id, you can find it from the “client_id” field in the service key file */
    var serviceClient: js.UndefOr[String] = js.undefined
    
    /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ */
    var `type`: js.UndefOr[Any] = js.undefined
    
    /** is the username */
    var user: js.UndefOr[String] = js.undefined
  }
  object AuthOptions {
    
    inline def apply(): AuthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthOptions]
    }
    
    extension [Self <: AuthOptions](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setAccessUrl(value: String): Self = StObject.set(x, "accessUrl", value.asInstanceOf[js.Any])
      
      inline def setAccessUrlUndefined: Self = StObject.set(x, "accessUrl", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      inline def setServiceClient(value: String): Self = StObject.set(x, "serviceClient", value.asInstanceOf[js.Any])
      
      inline def setServiceClientUndefined: Self = StObject.set(x, "serviceClient", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait SmtpOptions extends StObject {
    
    /**
      * defines authentication data (see authentication section below)
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
      * if true, then does not allow to use files as content. Use it when you want to use JSON data from untrusted source as the email. If an attachment or message node tries to fetch something from a file the sending returns an error
      */
    var disableFileAccess: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  if true, then does not allow to use Urls as content
      */
    var disableUrlAccess: js.UndefOr[Boolean] = js.undefined
    
    /**
      * how many milliseconds to wait for the greeting after connection is established
      */
    var greetingTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * is the hostname or IP address to connect to (defaults to 'localhost')
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * if this is true and secure is false then TLS is not used even if the server supports STARTTLS extension
      */
    var ignoreTLS: js.UndefOr[Boolean] = js.undefined
    
    /**
      * is the local interface to bind to for network connections
      */
    var localAddress: js.UndefOr[String] = js.undefined
    
    /**
      * optional bunyan compatible logger instance. If set to true then logs to console. If value is not set or is false then nothing is logged
      */
    var logger: js.UndefOr[Boolean] = js.undefined
    
    /**
      * optional hostname of the client, used for identifying to the server
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * see Pooled SMTP for details about connection pooling
      */
    var pool: js.UndefOr[MaxConnections] = js.undefined
    
    /**
      * is the port to connect to (defaults to 25 or 465)
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      *  a proxy URL
      */
    var proxy: js.UndefOr[String] = js.undefined
    
    /**
      * if this is true and secure is false then Nodemailer tries to use STARTTLS even if the server does not advertise support for it. If the connection can not be encrypted then message is not sent
      */
    var requireTLS: js.UndefOr[Boolean] = js.undefined
    
    /**
      * defines if the connection should use SSL (if true) or not (if false)
      */
    var secure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Fills in certain SMTP configurations options (e.g. 'host', 'port', and 'secure') for
      * well-known services. Possible values:
      *   - '1und1'
      *   - 'AOL'
      *   - 'DebugMail.io'
      *   - 'DynectEmail'
      *   - 'FastMail'
      *   - 'GandiMail'
      *   - 'Gmail'
      *   - 'Godaddy'
      *   - 'GodaddyAsia'
      *   - 'GodaddyEurope'
      *   - 'hot.ee'
      *   - 'Hotmail'
      *   - 'iCloud'
      *   - 'mail.ee'
      *   - 'Mail.ru'
      *   - 'Mailgun'
      *   - 'Mailjet'
      *   - 'Mandrill'
      *   - 'Naver'
      *   - 'Postmark'
      *   - 'QQ'
      *   - 'QQex'
      *   - 'SendCloud'
      *   - 'SendGrid'
      *   - 'SES'
      *   - 'Sparkpost'
      *   - 'Yahoo'
      *   - 'Yandex'
      *   - 'Zoho'
      */
    var service: js.UndefOr[String] = js.undefined
    
    /**
      * how many milliseconds of inactivity to allow
      */
    var socketTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * defines additional options to be passed to the socket constructor, eg. {rejectUnauthorized: true}
      */
    var tls: js.UndefOr[ConnectionOptions] = js.undefined
  }
  object SmtpOptions {
    
    inline def apply(): SmtpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmtpOptions]
    }
    
    extension [Self <: SmtpOptions](x: Self) {
      
      inline def setAuth(value: AuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthMethod(value: String): Self = StObject.set(x, "authMethod", value.asInstanceOf[js.Any])
      
      inline def setAuthMethodUndefined: Self = StObject.set(x, "authMethod", js.undefined)
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDisableFileAccess(value: Boolean): Self = StObject.set(x, "disableFileAccess", value.asInstanceOf[js.Any])
      
      inline def setDisableFileAccessUndefined: Self = StObject.set(x, "disableFileAccess", js.undefined)
      
      inline def setDisableUrlAccess(value: Boolean): Self = StObject.set(x, "disableUrlAccess", value.asInstanceOf[js.Any])
      
      inline def setDisableUrlAccessUndefined: Self = StObject.set(x, "disableUrlAccess", js.undefined)
      
      inline def setGreetingTimeout(value: Double): Self = StObject.set(x, "greetingTimeout", value.asInstanceOf[js.Any])
      
      inline def setGreetingTimeoutUndefined: Self = StObject.set(x, "greetingTimeout", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIgnoreTLS(value: Boolean): Self = StObject.set(x, "ignoreTLS", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTLSUndefined: Self = StObject.set(x, "ignoreTLS", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLogger(value: Boolean): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPool(value: MaxConnections): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setRequireTLS(value: Boolean): Self = StObject.set(x, "requireTLS", value.asInstanceOf[js.Any])
      
      inline def setRequireTLSUndefined: Self = StObject.set(x, "requireTLS", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
      
      inline def setTls(value: ConnectionOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    }
  }
}
