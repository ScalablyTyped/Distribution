package typings.nextAuth

import typings.nextAuth.coreTypesMod.Awaitable
import typings.nextAuth.coreTypesMod.Theme
import typings.nextAuth.nextAuthStrings.Email
import typings.nextAuth.nextAuthStrings.email_
import typings.nextAuth.providersMod.CommonProviderOptions
import typings.nodemailer.libSmtpTransportMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersEmailMod {
  
  @JSImport("next-auth/providers/email", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: EmailUserConfig): EmailConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[EmailConfig]
  
  trait EmailConfig
    extends StObject
       with CommonProviderOptions {
    
    /** @default "NextAuth <no-reply@example.com>" */
    var from: js.UndefOr[String] = js.undefined
    
    /**
      * By default, we are generating a random verification token.
      * You can make it predictable or modify it as you like with this method.
      * @example
      * ```js
      *  Providers.Email({
      *    async generateVerificationToken() {
      *      return "ABC123"
      *    }
      *  })
      * ```
      * [Documentation](https://next-auth.js.org/providers/email#customising-the-verification-token)
      */
    var generateVerificationToken: js.UndefOr[js.Function0[Awaitable[String]]] = js.undefined
    
    /**
      * How long until the e-mail can be used to log the user in,
      * in seconds. Defaults to 1 day
      * @default 86400
      */
    var maxAge: js.UndefOr[Double] = js.undefined
    
    /**
      * Normalizes the user input before sending the verification request.
      *
      * ⚠️ Always make sure this method returns a single email address.
      *
      * @note Technically, the part of the email address local mailbox element
      * (everything before the `@` symbol) should be treated as 'case sensitive'
      * according to RFC 2821, but in practice this causes more problems than
      * it solves, e.g.: when looking up users by e-mail from databases.
      * By default, we treat email addresses as all lower case,
      * but you can override this function to change this behavior.
      *
      * [Documentation](https://next-auth.js.org/providers/email#normalizing-the-e-mail-address) | [RFC 2821](https://tools.ietf.org/html/rfc2821) | [Email syntax](https://en.wikipedia.org/wiki/Email_address#Syntax)
      */
    var normalizeIdentifier: js.UndefOr[js.Function1[/* identifier */ String, String]] = js.undefined
    
    @JSName("options")
    var options_EmailConfig: EmailUserConfig
    
    /** If defined, it is used to hash the verification token when saving to the database . */
    var secret: js.UndefOr[String] = js.undefined
    
    /** [Documentation](https://next-auth.js.org/providers/email#customizing-emails) */
    def sendVerificationRequest(params: SendVerificationRequestParams): Awaitable[Unit]
    
    var server: String | Options
    
    @JSName("type")
    var type_EmailConfig: email_
  }
  object EmailConfig {
    
    inline def apply(
      id: String,
      name: String,
      options: EmailUserConfig,
      sendVerificationRequest: SendVerificationRequestParams => Awaitable[Unit],
      server: String | Options
    ): EmailConfig = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sendVerificationRequest = js.Any.fromFunction1(sendVerificationRequest), server = server.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("email")
      __obj.asInstanceOf[EmailConfig]
    }
    
    extension [Self <: EmailConfig](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGenerateVerificationToken(value: () => Awaitable[String]): Self = StObject.set(x, "generateVerificationToken", js.Any.fromFunction0(value))
      
      inline def setGenerateVerificationTokenUndefined: Self = StObject.set(x, "generateVerificationToken", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setNormalizeIdentifier(value: /* identifier */ String => String): Self = StObject.set(x, "normalizeIdentifier", js.Any.fromFunction1(value))
      
      inline def setNormalizeIdentifierUndefined: Self = StObject.set(x, "normalizeIdentifier", js.undefined)
      
      inline def setOptions(value: EmailUserConfig): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setSendVerificationRequest(value: SendVerificationRequestParams => Awaitable[Unit]): Self = StObject.set(x, "sendVerificationRequest", js.Any.fromFunction1(value))
      
      inline def setServer(value: String | Options): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setType(value: email_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type EmailProvider = js.Function1[/* options */ EmailUserConfig, EmailConfig]
  
  type EmailProviderType = Email
  
  /* Inlined std.Partial<std.Omit<next-auth.next-auth/providers/email.EmailConfig, 'options'>> */
  trait EmailUserConfig extends StObject {
    
    var from: js.UndefOr[String] = js.undefined
    
    var generateVerificationToken: js.UndefOr[js.Function0[Awaitable[String]]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var normalizeIdentifier: js.UndefOr[js.Function1[/* identifier */ String, String]] = js.undefined
    
    var secret: js.UndefOr[String] = js.undefined
    
    var sendVerificationRequest: js.UndefOr[js.Function1[/* params */ SendVerificationRequestParams, Awaitable[Unit]]] = js.undefined
    
    var server: js.UndefOr[String | Options] = js.undefined
    
    var `type`: js.UndefOr[email_] = js.undefined
  }
  object EmailUserConfig {
    
    inline def apply(): EmailUserConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailUserConfig]
    }
    
    extension [Self <: EmailUserConfig](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGenerateVerificationToken(value: () => Awaitable[String]): Self = StObject.set(x, "generateVerificationToken", js.Any.fromFunction0(value))
      
      inline def setGenerateVerificationTokenUndefined: Self = StObject.set(x, "generateVerificationToken", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNormalizeIdentifier(value: /* identifier */ String => String): Self = StObject.set(x, "normalizeIdentifier", js.Any.fromFunction1(value))
      
      inline def setNormalizeIdentifierUndefined: Self = StObject.set(x, "normalizeIdentifier", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setSendVerificationRequest(value: /* params */ SendVerificationRequestParams => Awaitable[Unit]): Self = StObject.set(x, "sendVerificationRequest", js.Any.fromFunction1(value))
      
      inline def setSendVerificationRequestUndefined: Self = StObject.set(x, "sendVerificationRequest", js.undefined)
      
      inline def setServer(value: String | Options): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setType(value: email_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SendVerificationRequestParams extends StObject {
    
    var expires: js.Date
    
    var identifier: String
    
    var provider: EmailConfig
    
    var theme: Theme
    
    var token: String
    
    var url: String
  }
  object SendVerificationRequestParams {
    
    inline def apply(
      expires: js.Date,
      identifier: String,
      provider: EmailConfig,
      theme: Theme,
      token: String,
      url: String
    ): SendVerificationRequestParams = {
      val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendVerificationRequestParams]
    }
    
    extension [Self <: SendVerificationRequestParams](x: Self) {
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: EmailConfig): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
