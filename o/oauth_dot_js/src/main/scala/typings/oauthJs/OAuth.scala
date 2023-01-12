package typings.oauthJs

import org.scalablytyped.runtime.StringDictionary
import typings.oauthJs.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OAuth {
  
  /**
    * SignatureMethod expects an accessor object to be like this:
    *   {tokenSecret: "lakjsdflkj...", consumerSecret: "QOUEWRI..", accessorSecret: "xcmvzc..."}
    * The accessorSecret property is optional.
    */
  trait Accessor extends StObject {
    
    var accessorSecret: js.UndefOr[String] = js.undefined
    
    var consumerKey: String
    
    var consumerSecret: String
    
    var token: String
    
    var tokenSecret: String
  }
  object Accessor {
    
    inline def apply(consumerKey: String, consumerSecret: String, token: String, tokenSecret: String): Accessor = {
      val __obj = js.Dynamic.literal(consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], tokenSecret = tokenSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accessor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Accessor] (val x: Self) extends AnyVal {
      
      inline def setAccessorSecret(value: String): Self = StObject.set(x, "accessorSecret", value.asInstanceOf[js.Any])
      
      inline def setAccessorSecretUndefined: Self = StObject.set(x, "accessorSecret", js.undefined)
      
      inline def setConsumerKey(value: String): Self = StObject.set(x, "consumerKey", value.asInstanceOf[js.Any])
      
      inline def setConsumerSecret(value: String): Self = StObject.set(x, "consumerSecret", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenSecret(value: String): Self = StObject.set(x, "tokenSecret", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An OAuth message is represented as an object like this:
    *   { method: "GET", action: "http://server.com/path", parameters: ... }
    */
  trait Message extends StObject {
    
    var action: String
    
    var method: String
    
    var parameters: ParameterListOrMap
  }
  object Message {
    
    inline def apply(action: String, method: String, parameters: ParameterListOrMap): Message = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: ParameterListOrMap): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "parameters", js.Array(value*))
    }
  }
  
  /** An Array of name-value pairs [[name, value], [name2, value2]]. */
  type ParameterList = js.Array[js.Tuple2[String, String]]
  
  type ParameterListOrMap = ParameterList | ParameterMap
  
  /** A map {name: value, name2: value2}. */
  type ParameterMap = StringDictionary[String]
  
  trait SignatureMethod extends StObject {
    
    def getSignature(baseString: String): String
    
    /** Set the key string for signing. */
    def initialize(name: String, accessor: Accessor): Unit
    
    var key: String
    
    /** Add a signature to the message. */
    def sign(message: Message): String
  }
  object SignatureMethod {
    
    inline def apply(
      getSignature: String => String,
      initialize: (String, Accessor) => Unit,
      key: String,
      sign: Message => String
    ): SignatureMethod = {
      val __obj = js.Dynamic.literal(getSignature = js.Any.fromFunction1(getSignature), initialize = js.Any.fromFunction2(initialize), key = key.asInstanceOf[js.Any], sign = js.Any.fromFunction1(sign))
      __obj.asInstanceOf[SignatureMethod]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignatureMethod] (val x: Self) extends AnyVal {
      
      inline def setGetSignature(value: String => String): Self = StObject.set(x, "getSignature", js.Any.fromFunction1(value))
      
      inline def setInitialize(value: (String, Accessor) => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSign(value: Message => String): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
    }
  }
  
  trait SignatureMethodStatic extends StObject {
    
    /** A map from signature method name to constructor. */
    var REGISTERED: StringDictionary[Instantiable]
    
    /**
      * Generate a signature base string from a Message object.
      * @see {@link https://tools.ietf.org/html/rfc5849#section-3.4.1}
      * @param message Source of the signature base string.
      */
    def getBaseString(message: Message): String
    
    /**
      * Create a subclass of OAuth.SignatureMethod, with the given getSignature function.
      * @param getSignatureFunction
      */
    def makeSubclass(getSignatureFunction: js.Function1[/* baseString */ String, String]): Instantiable
    
    /** Instantiate a SignatureMethod for the given method name. */
    def newMethod(name: String, accessor: Accessor): SignatureMethod
    
    def normalizeParameters(parameters: ParameterListOrMap): String
    
    def normalizeUrl(url: String): String
    
    def parseUri(str: String): Uri
    
    /**
      * Subsequently, the given constructor will be used for the named methods.
      * The constructor will be called with no parameters.
      * The resulting object should usually implement getSignature(baseString).
      * You can easily define such a constructor by calling makeSubclass method.
      */
    def registerMethodClass(names: js.Array[String], classConstructor: Instantiable): Unit
    
    def sign(message: Message, accessor: Accessor): Unit
  }
  object SignatureMethodStatic {
    
    inline def apply(
      REGISTERED: StringDictionary[Instantiable],
      getBaseString: Message => String,
      makeSubclass: js.Function1[/* baseString */ String, String] => Instantiable,
      newMethod: (String, Accessor) => SignatureMethod,
      normalizeParameters: ParameterListOrMap => String,
      normalizeUrl: String => String,
      parseUri: String => Uri,
      registerMethodClass: (js.Array[String], Instantiable) => Unit,
      sign: (Message, Accessor) => Unit
    ): SignatureMethodStatic = {
      val __obj = js.Dynamic.literal(REGISTERED = REGISTERED.asInstanceOf[js.Any], getBaseString = js.Any.fromFunction1(getBaseString), makeSubclass = js.Any.fromFunction1(makeSubclass), newMethod = js.Any.fromFunction2(newMethod), normalizeParameters = js.Any.fromFunction1(normalizeParameters), normalizeUrl = js.Any.fromFunction1(normalizeUrl), parseUri = js.Any.fromFunction1(parseUri), registerMethodClass = js.Any.fromFunction2(registerMethodClass), sign = js.Any.fromFunction2(sign))
      __obj.asInstanceOf[SignatureMethodStatic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignatureMethodStatic] (val x: Self) extends AnyVal {
      
      inline def setGetBaseString(value: Message => String): Self = StObject.set(x, "getBaseString", js.Any.fromFunction1(value))
      
      inline def setMakeSubclass(value: js.Function1[/* baseString */ String, String] => Instantiable): Self = StObject.set(x, "makeSubclass", js.Any.fromFunction1(value))
      
      inline def setNewMethod(value: (String, Accessor) => SignatureMethod): Self = StObject.set(x, "newMethod", js.Any.fromFunction2(value))
      
      inline def setNormalizeParameters(value: ParameterListOrMap => String): Self = StObject.set(x, "normalizeParameters", js.Any.fromFunction1(value))
      
      inline def setNormalizeUrl(value: String => String): Self = StObject.set(x, "normalizeUrl", js.Any.fromFunction1(value))
      
      inline def setParseUri(value: String => Uri): Self = StObject.set(x, "parseUri", js.Any.fromFunction1(value))
      
      inline def setREGISTERED(value: StringDictionary[Instantiable]): Self = StObject.set(x, "REGISTERED", value.asInstanceOf[js.Any])
      
      inline def setRegisterMethodClass(value: (js.Array[String], Instantiable) => Unit): Self = StObject.set(x, "registerMethodClass", js.Any.fromFunction2(value))
      
      inline def setSign(value: (Message, Accessor) => Unit): Self = StObject.set(x, "sign", js.Any.fromFunction2(value))
    }
  }
  
  trait Uri extends StObject {
    
    var anchor: String
    
    var authority: String
    
    var directory: String
    
    var file: String
    
    var host: String
    
    var password: String
    
    var path: String
    
    var port: String
    
    var protocol: String
    
    var query: String
    
    var relative: String
    
    var source: String
    
    var user: String
    
    var userInfo: String
  }
  object Uri {
    
    inline def apply(
      anchor: String,
      authority: String,
      directory: String,
      file: String,
      host: String,
      password: String,
      path: String,
      port: String,
      protocol: String,
      query: String,
      relative: String,
      source: String,
      user: String,
      userInfo: String
    ): Uri = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], authority = authority.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Uri]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Uri] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: String): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserInfo(value: String): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    }
  }
}
