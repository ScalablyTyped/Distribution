package typings.oauthSignature

import org.scalablytyped.runtime.StringDictionary
import typings.oauthSignature.mod.OauthSignature_.GenerateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object oauthSignature {
    
    @JSGlobal("oauthSignature")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("oauthSignature.HmacSha1")
    @js.native
    open class HmacSha1 ()
      extends typings.oauthSignature.mod.HmacSha1 {
      def this(text: String) = this()
      def this(text: String, key: String) = this()
      def this(text: Unit, key: String) = this()
    }
    
    @JSGlobal("oauthSignature.HmacSha1Signature")
    @js.native
    open class HmacSha1Signature protected ()
      extends typings.oauthSignature.mod.HmacSha1Signature {
      def this(signatureBaseString: String) = this()
      def this(signatureBaseString: String, consumerSecret: String) = this()
      def this(signatureBaseString: String, consumerSecret: String, tokenSecret: String) = this()
      def this(signatureBaseString: String, consumerSecret: Unit, tokenSecret: String) = this()
    }
    
    @JSGlobal("oauthSignature.HttpMethodElement")
    @js.native
    open class HttpMethodElement protected ()
      extends typings.oauthSignature.mod.HttpMethodElement {
      def this(httpMethod: String) = this()
    }
    
    @JSGlobal("oauthSignature.ParametersElement")
    @js.native
    open class ParametersElement protected ()
      extends typings.oauthSignature.mod.ParametersElement {
      def this(parameters: StringDictionary[Any]) = this()
    }
    
    @JSGlobal("oauthSignature.ParametersLoader")
    @js.native
    open class ParametersLoader protected ()
      extends typings.oauthSignature.mod.ParametersLoader {
      def this(parameters: StringDictionary[Any]) = this()
    }
    
    @JSGlobal("oauthSignature.Rfc3986")
    @js.native
    open class Rfc3986 ()
      extends typings.oauthSignature.mod.Rfc3986
    
    @JSGlobal("oauthSignature.SignatureBaseString")
    @js.native
    open class SignatureBaseString protected ()
      extends typings.oauthSignature.mod.SignatureBaseString {
      def this(httpMethod: String, url: String, parameters: StringDictionary[Any]) = this()
    }
    
    @JSGlobal("oauthSignature.UrlElement")
    @js.native
    open class UrlElement protected ()
      extends typings.oauthSignature.mod.UrlElement {
      def this(url: String) = this()
    }
    
    inline def generate(httpMethod: String, url: String, parameters: StringDictionary[Any], consumerSecret: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(httpMethod.asInstanceOf[js.Any], url.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], consumerSecret.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generate(
      httpMethod: String,
      url: String,
      parameters: StringDictionary[Any],
      consumerSecret: String,
      tokenSecret: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(httpMethod.asInstanceOf[js.Any], url.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], consumerSecret.asInstanceOf[js.Any], tokenSecret.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generate(
      httpMethod: String,
      url: String,
      parameters: StringDictionary[Any],
      consumerSecret: String,
      tokenSecret: String,
      options: GenerateOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(httpMethod.asInstanceOf[js.Any], url.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], consumerSecret.asInstanceOf[js.Any], tokenSecret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generate(
      httpMethod: String,
      url: String,
      parameters: StringDictionary[Any],
      consumerSecret: String,
      tokenSecret: Unit,
      options: GenerateOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(httpMethod.asInstanceOf[js.Any], url.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], consumerSecret.asInstanceOf[js.Any], tokenSecret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
