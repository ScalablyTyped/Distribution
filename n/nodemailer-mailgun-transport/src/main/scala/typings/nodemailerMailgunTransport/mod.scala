package typings.nodemailerMailgunTransport

import typings.nodemailer.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nodemailer-mailgun-transport", JSImport.Namespace)
  @js.native
  def apply(options: Options): MailgunTransport = js.native
  
  @JSImport("nodemailer-mailgun-transport", "MailgunTransport")
  @js.native
  class MailgunTransport () extends Transport
  
  @js.native
  trait AliasAuthOptions extends StObject {
    
    var apiKey: String = js.native
    
    var domain: js.UndefOr[String] = js.native
  }
  object AliasAuthOptions {
    
    @scala.inline
    def apply(apiKey: String): AliasAuthOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[AliasAuthOptions]
    }
    
    @scala.inline
    implicit class AliasAuthOptionsMutableBuilder[Self <: AliasAuthOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    }
  }
  
  @js.native
  trait AuthOptions extends StObject {
    
    var api_key: String = js.native
    
    var domain: js.UndefOr[String] = js.native
  }
  object AuthOptions {
    
    @scala.inline
    def apply(api_key: String): AuthOptions = {
      val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthOptions]
    }
    
    @scala.inline
    implicit class AuthOptionsMutableBuilder[Self <: AuthOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    }
  }
  
  type Information = js.Object
  
  type MailOptions = typings.nodemailer.mailerMod.Options
  
  @js.native
  trait Options extends StObject {
    
    var auth: AuthOptions | AliasAuthOptions = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var proxy: js.UndefOr[String | Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(auth: AuthOptions | AliasAuthOptions): Options = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: AuthOptions | AliasAuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setProxy(value: String | Boolean): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
}
