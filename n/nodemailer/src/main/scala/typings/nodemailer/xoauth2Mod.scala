package typings.nodemailer

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.nodemailer.anon.Key
import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.nodemailerStrings.end
import typings.nodemailer.nodemailerStrings.error
import typings.nodemailer.nodemailerStrings.token
import typings.nodemailer.sharedMod.Logger
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xoauth2Mod {
  
  @JSImport("nodemailer/lib/xoauth2", JSImport.Namespace)
  @js.native
  class ^ () extends XOAuth2 {
    def this(options: Options) = this()
    def this(options: Unit, logger: Logger) = this()
    def this(options: Options, logger: Logger) = this()
  }
  
  trait Options extends StObject {
    
    /** An existing valid accessToken */
    var accessToken: js.UndefOr[String] = js.undefined
    
    /** Endpoint for token generation, defaults to 'https://accounts.google.com/o/oauth2/token' */
    var accessUrl: js.UndefOr[String] = js.undefined
    
    /** Client ID value */
    var clientId: js.UndefOr[String] = js.undefined
    
    /** Client secret value */
    var clientSecret: js.UndefOr[String] = js.undefined
    
    /** Optional Access Token expire time in ms */
    var expires: js.UndefOr[ms] = js.undefined
    
    /** Private key for JSW */
    var privateKey: js.UndefOr[String | Key] = js.undefined
    
    /** Function to run when a new access token is required */
    var provisionCallback: js.UndefOr[
        js.Function3[
          /* user */ String, 
          /* renew */ Boolean, 
          /* callback */ js.Function3[/* err */ Error | Null, /* accessToken */ String, /* expires */ Double, Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** Refresh token for an user */
    var refreshToken: js.UndefOr[String] = js.undefined
    
    var serviceClient: js.UndefOr[String] = js.undefined
    
    /** Optional TTL for Access Token in seconds */
    var timeout: js.UndefOr[s] = js.undefined
    
    /** User e-mail address */
    var user: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      @scala.inline
      def setAccessUrl(value: String): Self = StObject.set(x, "accessUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessUrlUndefined: Self = StObject.set(x, "accessUrl", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      @scala.inline
      def setExpires(value: ms): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: String | Key): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      @scala.inline
      def setProvisionCallback(
        value: (/* user */ String, /* renew */ Boolean, /* callback */ js.Function3[/* err */ Error | Null, /* accessToken */ String, /* expires */ Double, Unit]) => Unit
      ): Self = StObject.set(x, "provisionCallback", js.Any.fromFunction3(value))
      
      @scala.inline
      def setProvisionCallbackUndefined: Self = StObject.set(x, "provisionCallback", js.undefined)
      
      @scala.inline
      def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      @scala.inline
      def setServiceClient(value: String): Self = StObject.set(x, "serviceClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceClientUndefined: Self = StObject.set(x, "serviceClient", js.undefined)
      
      @scala.inline
      def setTimeout(value: s): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait RequestParams extends StObject {
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  }
  object RequestParams {
    
    @scala.inline
    def apply(): RequestParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestParams]
    }
    
    @scala.inline
    implicit class RequestParamsMutableBuilder[Self <: RequestParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    }
  }
  
  trait Token extends StObject {
    
    var accessToken: String
    
    var expires: Double
    
    var user: String
  }
  object Token {
    
    @scala.inline
    def apply(accessToken: String, expires: Double, user: String): Token = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XOAuth2 extends Stream {
    
    var accessToken: String | `false` = js.native
    
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_token(event: token, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
    
    /** Converts an access_token and user id into a base64 encoded XOAuth2 token */
    def buildXOAuth2Token(accessToken: String): String = js.native
    
    @JSName("emit")
    def emit_error(event: error, error: Error): Boolean = js.native
    @JSName("emit")
    def emit_token(event: token, token: Token): Boolean = js.native
    
    var expires: Double = js.native
    
    /** Generates a new XOAuth2 token with the credentials provided at initialization */
    def generateToken(callback: js.Function2[/* err */ Error | Null, /* accessToken */ String, Unit]): Unit = js.native
    
    /** Returns or generates (if previous has expired) a XOAuth2 token */
    def getToken(renew: Boolean, callback: js.Function2[/* err */ Error | Null, /* accessToken */ String, Unit]): Unit = js.native
    
    /** Creates a JSON Web Token signed with RS256 (SHA256 + RSA) */
    def jwtSignRS256(payload: js.Object): String = js.native
    
    @JSName("listeners")
    def listeners_end(event: end): js.Array[js.Function1[/* token */ Token, Unit]] = js.native
    @JSName("listeners")
    def listeners_error(event: error): js.Array[js.Function1[/* err */ Error, Unit]] = js.native
    
    var logger: Logger = js.native
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_token(event: token, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
    
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_token(event: token, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
    
    var options: Options = js.native
    
    /**
      * Custom POST request handler.
      * This is only needed to keep paths short in Windows – usually this module
      * is a dependency of a dependency and if it tries to require something
      * like the request module the paths get way too long to handle for Windows.
      * As we do only a simple POST request we do not actually require complicated
      * logic support (no redirects, no nothing) anyway.
      */
    def postRequest(
      url: String,
      payload: String,
      params: RequestParams,
      callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]
    ): Unit = js.native
    def postRequest(
      url: String,
      payload: StringDictionary[String],
      params: RequestParams,
      callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]
    ): Unit = js.native
    def postRequest(
      url: String,
      payload: Buffer,
      params: RequestParams,
      callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]
    ): Unit = js.native
    def postRequest(
      url: String,
      payload: Readable,
      params: RequestParams,
      callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]
    ): Unit = js.native
    
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    def toBase64URL(data: String): String = js.native
    /** Encodes a buffer or a string into Base64url format */
    def toBase64URL(data: Buffer): String = js.native
    
    /** Updates token values */
    def updateToken(accessToken: String, timeout: s): Token = js.native
  }
  
  type ms = Double
  
  type s = Double
}
