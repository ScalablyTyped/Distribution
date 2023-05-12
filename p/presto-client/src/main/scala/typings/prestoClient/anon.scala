package typings.prestoClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ca extends StObject {
    
    /**
      * An authority certificate or array of authority certificates to check
      * the remote host against
      */
    var ca: js.UndefOr[String] = js.undefined
    
    /**
      * Public x509 certificate to use
      */
    var cert: js.UndefOr[String] = js.undefined
    
    /**
      * Default cipher suite to use
      */
    var ciphers: js.UndefOr[String] = js.undefined
    
    /**
      * Private key to use for SSL
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * A string of passphrase for the private key or pfx
      */
    var passphrase: js.UndefOr[String] = js.undefined
    
    /**
      * Certificate, Private key and CA certificates to use for SSL
      */
    var pfx: js.UndefOr[String] = js.undefined
    
    /**
      * If not `false` the server will reject any connection which is not
      * authorized with the list of supplied CAs. This option only has an
      * effect if requestCert is `true`.
      * @default true
      */
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional SSL method to use. The possible values are listed as
      * SSL_METHODS, use the function names as strings. For example,
      * "SSLv3_method" to force SSL version 3.
      * @default "SSLv23_method"
      */
    var secureProtocol: js.UndefOr[String] = js.undefined
    
    /**
      * Server name for the SNI (Server Name Indication) TLS extension
      */
    var servername: js.UndefOr[String] = js.undefined
  }
  object Ca {
    
    inline def apply(): Ca = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ca]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ca] (val x: Self) extends AnyVal {
      
      inline def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      inline def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      inline def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      inline def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
    }
  }
  
  trait Parse extends StObject {
    
    def parse(data: Any): Any
  }
  object Parse {
    
    inline def apply(parse: Any => Any): Parse = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[Parse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parse] (val x: Self) extends AnyVal {
      
      inline def setParse(value: Any => Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
  
  trait Password extends StObject {
    
    var password: String
    
    var user: String
  }
  object Password {
    
    inline def apply(password: String, user: String): Password = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
