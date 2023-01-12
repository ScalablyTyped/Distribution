package typings.microserviceUtilities

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("microservice-utilities", "Authorizer")
  @js.native
  open class Authorizer protected () extends StObject {
    def this(logFunction: js.Function1[/* msg */ Any, Unit], configuration: AuthorizerConfiguration) = this()
    
    def getPolicy(request: js.Object): js.Promise[AuthorizerPolicy] = js.native
  }
  
  @JSImport("microservice-utilities", "PlatformClient")
  @js.native
  open class PlatformClient protected () extends StObject {
    def this(logFunction: js.Function1[/* msg */ Any, Unit]) = this()
    def this(
      logFunction: js.Function1[/* msg */ Any, Unit],
      tokenResolverFunction: js.Function0[js.Promise[String]]
    ) = this()
    def this(
      logFunction: js.Function1[/* msg */ Any, Unit],
      tokenResolverFunction: js.Function0[js.Promise[String]],
      configuration: PlatformClientConfiguration
    ) = this()
    def this(
      logFunction: js.Function1[/* msg */ Any, Unit],
      tokenResolverFunction: Unit,
      configuration: PlatformClientConfiguration
    ) = this()
    
    def delete[T](url: String): js.Promise[PlatformClientResponse[T]] = js.native
    def delete[T](url: String, headers: StringDictionary[String]): js.Promise[PlatformClientResponse[T]] = js.native
    
    def get[T](url: String): js.Promise[PlatformClientResponse[T]] = js.native
    def get[T](url: String, headers: StringDictionary[String]): js.Promise[PlatformClientResponse[T]] = js.native
    def get[T](url: String, headers: StringDictionary[String], `type`: String): js.Promise[PlatformClientResponse[T]] = js.native
    def get[T](url: String, headers: Unit, `type`: String): js.Promise[PlatformClientResponse[T]] = js.native
    
    def head[T](url: String): js.Promise[PlatformClientResponse[T]] = js.native
    def head[T](url: String, headers: StringDictionary[String]): js.Promise[PlatformClientResponse[T]] = js.native
    
    def options[T](url: String): js.Promise[PlatformClientResponse[T]] = js.native
    def options[T](url: String, headers: StringDictionary[String]): js.Promise[PlatformClientResponse[T]] = js.native
    
    def patch[T](url: String, data: js.Object): js.Promise[PlatformClientResponse[T]] = js.native
    def patch[T](url: String, data: js.Object, headers: StringDictionary[String]): js.Promise[PlatformClientResponse[T]] = js.native
    
    def post[T](url: String, data: js.Object): js.Promise[PlatformClientResponse[T]] = js.native
    def post[T](url: String, data: js.Object, headers: StringDictionary[String]): js.Promise[PlatformClientResponse[T]] = js.native
    
    def put[T](url: String, data: js.Object): js.Promise[PlatformClientResponse[T]] = js.native
    def put[T](url: String, data: js.Object, headers: StringDictionary[String]): js.Promise[PlatformClientResponse[T]] = js.native
  }
  
  @JSImport("microservice-utilities", "RequestLogger")
  @js.native
  open class RequestLogger () extends StObject {
    def this(configuration: RequestLoggerConfiguration) = this()
    
    def log(msg: Any): Unit = js.native
  }
  
  @JSImport("microservice-utilities", "ServiceTokenProvider")
  @js.native
  open class ServiceTokenProvider protected () extends StObject {
    def this(httpClient: js.Object, kmsClient: js.Object) = this()
    def this(httpClient: js.Object, kmsClient: js.Object, configuration: ServiceTokenProviderConfiguration) = this()
    
    def getToken(): js.Promise[String] = js.native
    
    def getTokenWithoutCache(): js.Promise[String] = js.native
  }
  
  trait AuthorizerConfiguration extends StObject {
    
    var authorizerContextResolver: js.UndefOr[String] = js.undefined
    
    var jwkKeyListUrl: String
  }
  object AuthorizerConfiguration {
    
    inline def apply(jwkKeyListUrl: String): AuthorizerConfiguration = {
      val __obj = js.Dynamic.literal(jwkKeyListUrl = jwkKeyListUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizerConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthorizerConfiguration] (val x: Self) extends AnyVal {
      
      inline def setAuthorizerContextResolver(value: String): Self = StObject.set(x, "authorizerContextResolver", value.asInstanceOf[js.Any])
      
      inline def setAuthorizerContextResolverUndefined: Self = StObject.set(x, "authorizerContextResolver", js.undefined)
      
      inline def setJwkKeyListUrl(value: String): Self = StObject.set(x, "jwkKeyListUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthorizerPolicy extends StObject {
    
    var policyDocument: js.Object
    
    var principalId: String
  }
  object AuthorizerPolicy {
    
    inline def apply(policyDocument: js.Object, principalId: String): AuthorizerPolicy = {
      val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizerPolicy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthorizerPolicy] (val x: Self) extends AnyVal {
      
      inline def setPolicyDocument(value: js.Object): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
      
      inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlatformClientConfiguration extends StObject {
    
    var client: js.Object
  }
  object PlatformClientConfiguration {
    
    inline def apply(client: js.Object): PlatformClientConfiguration = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformClientConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlatformClientConfiguration] (val x: Self) extends AnyVal {
      
      inline def setClient(value: js.Object): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlatformClientResponse[T] extends StObject {
    
    var config: js.Object
    
    var data: js.UndefOr[T] = js.undefined
    
    var headers: Any
    
    var request: js.UndefOr[Any] = js.undefined
    
    var status: Double
    
    var statusText: String
  }
  object PlatformClientResponse {
    
    inline def apply[T](config: js.Object, headers: Any, status: Double, statusText: String): PlatformClientResponse[T] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformClientResponse[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlatformClientResponse[?], T] (val x: Self & PlatformClientResponse[T]) extends AnyVal {
      
      inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestLoggerConfiguration extends StObject {
    
    var extendErrorObjects: js.UndefOr[Boolean] = js.undefined
    
    var jsonSpace: js.UndefOr[Double] = js.undefined
    
    var logFunction: js.UndefOr[js.Function1[/* msg */ Any, Unit]] = js.undefined
  }
  object RequestLoggerConfiguration {
    
    inline def apply(): RequestLoggerConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestLoggerConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestLoggerConfiguration] (val x: Self) extends AnyVal {
      
      inline def setExtendErrorObjects(value: Boolean): Self = StObject.set(x, "extendErrorObjects", value.asInstanceOf[js.Any])
      
      inline def setExtendErrorObjectsUndefined: Self = StObject.set(x, "extendErrorObjects", js.undefined)
      
      inline def setJsonSpace(value: Double): Self = StObject.set(x, "jsonSpace", value.asInstanceOf[js.Any])
      
      inline def setJsonSpaceUndefined: Self = StObject.set(x, "jsonSpace", js.undefined)
      
      inline def setLogFunction(value: /* msg */ Any => Unit): Self = StObject.set(x, "logFunction", js.Any.fromFunction1(value))
      
      inline def setLogFunctionUndefined: Self = StObject.set(x, "logFunction", js.undefined)
    }
  }
  
  trait ServiceTokenProviderConfiguration extends StObject {
    
    var audience: String
    
    var clientId: String
    
    var encryptedClientSecret: String
    
    var tokenEndpoint: String
  }
  object ServiceTokenProviderConfiguration {
    
    inline def apply(audience: String, clientId: String, encryptedClientSecret: String, tokenEndpoint: String): ServiceTokenProviderConfiguration = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], encryptedClientSecret = encryptedClientSecret.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceTokenProviderConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceTokenProviderConfiguration] (val x: Self) extends AnyVal {
      
      inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setEncryptedClientSecret(value: String): Self = StObject.set(x, "encryptedClientSecret", value.asInstanceOf[js.Any])
      
      inline def setTokenEndpoint(value: String): Self = StObject.set(x, "tokenEndpoint", value.asInstanceOf[js.Any])
    }
  }
}
