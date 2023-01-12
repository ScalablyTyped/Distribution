package typings.nodemailerMailgunTransport

import typings.nodemailer.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): MailgunTransport = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[MailgunTransport]
  
  @JSImport("nodemailer-mailgun-transport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nodemailer-mailgun-transport", "MailgunTransport")
  @js.native
  open class MailgunTransport ()
    extends StObject
       with Transport[Any] {
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def send(
      mail: typings.nodemailer.libMailerMailMessageMod.^[Any],
      callback: js.Function2[/* err */ js.Error | Null, Any, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    var version: String = js.native
  }
  
  trait AliasAuthOptions extends StObject {
    
    var apiKey: String
    
    var domain: js.UndefOr[String] = js.undefined
  }
  object AliasAuthOptions {
    
    inline def apply(apiKey: String): AliasAuthOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[AliasAuthOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AliasAuthOptions] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    }
  }
  
  trait AuthOptions extends StObject {
    
    var api_key: String
    
    var domain: js.UndefOr[String] = js.undefined
  }
  object AuthOptions {
    
    inline def apply(api_key: String): AuthOptions = {
      val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthOptions] (val x: Self) extends AnyVal {
      
      inline def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    }
  }
  
  type Information = js.Object
  
  type MailOptions = typings.nodemailer.libMailerMod.Options
  
  trait Options extends StObject {
    
    var auth: AuthOptions | AliasAuthOptions
    
    var host: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var proxy: js.UndefOr[String | Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(auth: AuthOptions | AliasAuthOptions): Options = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: AuthOptions | AliasAuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setProxy(value: String | Boolean): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
}
