package typings.oauthSignature

import org.scalablytyped.runtime.StringDictionary
import typings.oauthSignature.mod.OauthSignature_.GenerateOptions
import typings.oauthSignature.mod.OauthSignature_.ParsedUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("oauth-signature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("oauth-signature", "HmacSha1")
  @js.native
  open class HmacSha1 ()
    extends StObject
       with typings.oauthSignature.mod.OauthSignature_.HmacSha1 {
    def this(text: String) = this()
    def this(text: String, key: String) = this()
    def this(text: Unit, key: String) = this()
    
    /* CompleteClass */
    override def getBase64EncodedHash(): String = js.native
  }
  
  @JSImport("oauth-signature", "HmacSha1Signature")
  @js.native
  open class HmacSha1Signature protected ()
    extends StObject
       with typings.oauthSignature.mod.OauthSignature_.HmacSha1Signature {
    def this(signatureBaseString: String) = this()
    def this(signatureBaseString: String, consumerSecret: String) = this()
    def this(signatureBaseString: String, consumerSecret: String, tokenSecret: String) = this()
    def this(signatureBaseString: String, consumerSecret: Unit, tokenSecret: String) = this()
  }
  
  @JSImport("oauth-signature", "HttpMethodElement")
  @js.native
  open class HttpMethodElement protected ()
    extends StObject
       with typings.oauthSignature.mod.OauthSignature_.HttpMethodElement {
    def this(httpMethod: String) = this()
    
    /* CompleteClass */
    override def get(): String = js.native
  }
  
  @JSImport("oauth-signature", "ParametersElement")
  @js.native
  open class ParametersElement protected ()
    extends StObject
       with typings.oauthSignature.mod.OauthSignature_.ParametersElement {
    def this(parameters: StringDictionary[Any]) = this()
    
    /* CompleteClass */
    override def get(): String = js.native
  }
  
  @JSImport("oauth-signature", "ParametersLoader")
  @js.native
  open class ParametersLoader protected ()
    extends StObject
       with typings.oauthSignature.mod.OauthSignature_.ParametersLoader {
    def this(parameters: StringDictionary[Any]) = this()
    
    /* CompleteClass */
    override def get(): StringDictionary[Any] = js.native
  }
  
  @JSImport("oauth-signature", "Rfc3986")
  @js.native
  open class Rfc3986 ()
    extends StObject
       with typings.oauthSignature.mod.OauthSignature_.Rfc3986
  
  @JSImport("oauth-signature", "SignatureBaseString")
  @js.native
  open class SignatureBaseString protected ()
    extends StObject
       with typings.oauthSignature.mod.OauthSignature_.SignatureBaseString {
    def this(httpMethod: String, url: String, parameters: StringDictionary[Any]) = this()
    
    /* CompleteClass */
    override def generate(): String = js.native
  }
  
  @JSImport("oauth-signature", "UrlElement")
  @js.native
  open class UrlElement protected ()
    extends StObject
       with typings.oauthSignature.mod.OauthSignature_.UrlElement {
    def this(url: String) = this()
    
    /* CompleteClass */
    override def get(): js.UndefOr[String | Null] = js.native
    
    /* CompleteClass */
    override def parseInBrowser(): ParsedUrl = js.native
    
    /* CompleteClass */
    override def parseInNode(): ParsedUrl = js.native
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
  
  object OauthSignature_ {
    
    trait GenerateOptions extends StObject {
      
      var encodeSignature: Boolean
    }
    object GenerateOptions {
      
      inline def apply(encodeSignature: Boolean): GenerateOptions = {
        val __obj = js.Dynamic.literal(encodeSignature = encodeSignature.asInstanceOf[js.Any])
        __obj.asInstanceOf[GenerateOptions]
      }
      
      extension [Self <: GenerateOptions](x: Self) {
        
        inline def setEncodeSignature(value: Boolean): Self = StObject.set(x, "encodeSignature", value.asInstanceOf[js.Any])
      }
    }
    
    trait HmacSha1 extends StObject {
      
      def getBase64EncodedHash(): String
    }
    object HmacSha1 {
      
      inline def apply(getBase64EncodedHash: () => String): typings.oauthSignature.mod.OauthSignature_.HmacSha1 = {
        val __obj = js.Dynamic.literal(getBase64EncodedHash = js.Any.fromFunction0(getBase64EncodedHash))
        __obj.asInstanceOf[typings.oauthSignature.mod.OauthSignature_.HmacSha1]
      }
      
      extension [Self <: typings.oauthSignature.mod.OauthSignature_.HmacSha1](x: Self) {
        
        inline def setGetBase64EncodedHash(value: () => String): Self = StObject.set(x, "getBase64EncodedHash", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait HmacSha1Signature extends StObject {
      
      def generate(): String = js.native
      def generate(encode: Boolean): String = js.native
    }
    
    trait HttpMethodElement extends StObject {
      
      def get(): String
    }
    object HttpMethodElement {
      
      inline def apply(get: () => String): typings.oauthSignature.mod.OauthSignature_.HttpMethodElement = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
        __obj.asInstanceOf[typings.oauthSignature.mod.OauthSignature_.HttpMethodElement]
      }
      
      extension [Self <: typings.oauthSignature.mod.OauthSignature_.HttpMethodElement](x: Self) {
        
        inline def setGet(value: () => String): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      }
    }
    
    trait ParametersElement extends StObject {
      
      def get(): String
    }
    object ParametersElement {
      
      inline def apply(get: () => String): typings.oauthSignature.mod.OauthSignature_.ParametersElement = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
        __obj.asInstanceOf[typings.oauthSignature.mod.OauthSignature_.ParametersElement]
      }
      
      extension [Self <: typings.oauthSignature.mod.OauthSignature_.ParametersElement](x: Self) {
        
        inline def setGet(value: () => String): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      }
    }
    
    trait ParametersLoader extends StObject {
      
      def get(): StringDictionary[Any]
    }
    object ParametersLoader {
      
      inline def apply(get: () => StringDictionary[Any]): typings.oauthSignature.mod.OauthSignature_.ParametersLoader = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
        __obj.asInstanceOf[typings.oauthSignature.mod.OauthSignature_.ParametersLoader]
      }
      
      extension [Self <: typings.oauthSignature.mod.OauthSignature_.ParametersLoader](x: Self) {
        
        inline def setGet(value: () => StringDictionary[Any]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      }
    }
    
    trait ParsedUrl extends StObject {
      
      var authority: String
      
      var path: String
      
      var port: String
      
      var scheme: String
    }
    object ParsedUrl {
      
      inline def apply(authority: String, path: String, port: String, scheme: String): ParsedUrl = {
        val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
        __obj.asInstanceOf[ParsedUrl]
      }
      
      extension [Self <: ParsedUrl](x: Self) {
        
        inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Rfc3986 extends StObject {
      
      def decode(): String = js.native
      def decode(encoded: String): String = js.native
      
      def encode(): String = js.native
      def encode(decoded: String): String = js.native
    }
    
    trait SignatureBaseString extends StObject {
      
      def generate(): String
    }
    object SignatureBaseString {
      
      inline def apply(generate: () => String): typings.oauthSignature.mod.OauthSignature_.SignatureBaseString = {
        val __obj = js.Dynamic.literal(generate = js.Any.fromFunction0(generate))
        __obj.asInstanceOf[typings.oauthSignature.mod.OauthSignature_.SignatureBaseString]
      }
      
      extension [Self <: typings.oauthSignature.mod.OauthSignature_.SignatureBaseString](x: Self) {
        
        inline def setGenerate(value: () => String): Self = StObject.set(x, "generate", js.Any.fromFunction0(value))
      }
    }
    
    trait UrlElement extends StObject {
      
      def get(): js.UndefOr[String | Null]
      
      def parseInBrowser(): ParsedUrl
      
      def parseInNode(): ParsedUrl
    }
    object UrlElement {
      
      inline def apply(
        get: () => js.UndefOr[String | Null],
        parseInBrowser: () => ParsedUrl,
        parseInNode: () => ParsedUrl
      ): typings.oauthSignature.mod.OauthSignature_.UrlElement = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), parseInBrowser = js.Any.fromFunction0(parseInBrowser), parseInNode = js.Any.fromFunction0(parseInNode))
        __obj.asInstanceOf[typings.oauthSignature.mod.OauthSignature_.UrlElement]
      }
      
      extension [Self <: typings.oauthSignature.mod.OauthSignature_.UrlElement](x: Self) {
        
        inline def setGet(value: () => js.UndefOr[String | Null]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
        
        inline def setParseInBrowser(value: () => ParsedUrl): Self = StObject.set(x, "parseInBrowser", js.Any.fromFunction0(value))
        
        inline def setParseInNode(value: () => ParsedUrl): Self = StObject.set(x, "parseInNode", js.Any.fromFunction0(value))
      }
    }
  }
  
  /* was `typeof OauthSignature` */
  object oauthSignature {
    
    type HmacSha1 = typings.oauthSignature.mod.OauthSignature_.HmacSha1
    
    type HmacSha1Signature = typings.oauthSignature.mod.OauthSignature_.HmacSha1Signature
    
    type HttpMethodElement = typings.oauthSignature.mod.OauthSignature_.HttpMethodElement
    
    type ParametersElement = typings.oauthSignature.mod.OauthSignature_.ParametersElement
    
    type ParametersLoader = typings.oauthSignature.mod.OauthSignature_.ParametersLoader
    
    type Rfc3986 = typings.oauthSignature.mod.OauthSignature_.Rfc3986
    
    type SignatureBaseString = typings.oauthSignature.mod.OauthSignature_.SignatureBaseString
    
    type UrlElement = typings.oauthSignature.mod.OauthSignature_.UrlElement
  }
}
