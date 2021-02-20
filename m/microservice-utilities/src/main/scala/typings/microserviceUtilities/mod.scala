package typings.microserviceUtilities

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("microservice-utilities", "Authorizer")
  @js.native
  class Authorizer protected () extends StObject {
    def this(logFunction: js.Function1[/* msg */ js.Any, Unit], configuration: AuthorizerConfiguration) = this()
    
    def getPolicy(request: js.Object): js.Promise[AuthorizerPolicy] = js.native
  }
  
  @JSImport("microservice-utilities", "PlatformClient")
  @js.native
  class PlatformClient protected () extends StObject {
    def this(logFunction: js.Function1[/* msg */ js.Any, Unit]) = this()
    def this(
      logFunction: js.Function1[/* msg */ js.Any, Unit],
      tokenResolverFunction: js.Function0[js.Promise[String]]
    ) = this()
    def this(
      logFunction: js.Function1[/* msg */ js.Any, Unit],
      tokenResolverFunction: js.UndefOr[scala.Nothing],
      configuration: PlatformClientConfiguration
    ) = this()
    def this(
      logFunction: js.Function1[/* msg */ js.Any, Unit],
      tokenResolverFunction: js.Function0[js.Promise[String]],
      configuration: PlatformClientConfiguration
    ) = this()
    
    def delete[T](url: String): js.Promise[PlatformClientResponse[T]] = js.native
    def delete[T](url: String, headers: StringDictionary[String]): js.Promise[PlatformClientResponse[T]] = js.native
    
    def get[T](url: String): js.Promise[PlatformClientResponse[T]] = js.native
    def get[T](url: String, headers: js.UndefOr[scala.Nothing], `type`: String): js.Promise[PlatformClientResponse[T]] = js.native
    def get[T](url: String, headers: StringDictionary[String]): js.Promise[PlatformClientResponse[T]] = js.native
    def get[T](url: String, headers: StringDictionary[String], `type`: String): js.Promise[PlatformClientResponse[T]] = js.native
    
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
  class RequestLogger () extends StObject {
    def this(configuration: RequestLoggerConfiguration) = this()
    
    def log(msg: js.Any): Unit = js.native
  }
  
  @JSImport("microservice-utilities", "ServiceTokenProvider")
  @js.native
  class ServiceTokenProvider protected () extends StObject {
    def this(httpClient: js.Object, kmsClient: js.Object) = this()
    def this(httpClient: js.Object, kmsClient: js.Object, configuration: ServiceTokenProviderConfiguration) = this()
    
    def getToken(): js.Promise[String] = js.native
    
    def getTokenWithoutCache(): js.Promise[String] = js.native
  }
  
  @js.native
  trait AuthorizerConfiguration extends StObject {
    
    var authorizerContextResolver: js.UndefOr[String] = js.native
    
    var jwkKeyListUrl: String = js.native
  }
  object AuthorizerConfiguration {
    
    @scala.inline
    def apply(jwkKeyListUrl: String): AuthorizerConfiguration = {
      val __obj = js.Dynamic.literal(jwkKeyListUrl = jwkKeyListUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizerConfiguration]
    }
    
    @scala.inline
    implicit class AuthorizerConfigurationMutableBuilder[Self <: AuthorizerConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizerContextResolver(value: String): Self = StObject.set(x, "authorizerContextResolver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerContextResolverUndefined: Self = StObject.set(x, "authorizerContextResolver", js.undefined)
      
      @scala.inline
      def setJwkKeyListUrl(value: String): Self = StObject.set(x, "jwkKeyListUrl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AuthorizerPolicy extends StObject {
    
    var policyDocument: js.Object = js.native
    
    var principalId: String = js.native
  }
  object AuthorizerPolicy {
    
    @scala.inline
    def apply(policyDocument: js.Object, principalId: String): AuthorizerPolicy = {
      val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizerPolicy]
    }
    
    @scala.inline
    implicit class AuthorizerPolicyMutableBuilder[Self <: AuthorizerPolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicyDocument(value: js.Object): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PlatformClientConfiguration extends StObject {
    
    var client: js.Object = js.native
  }
  object PlatformClientConfiguration {
    
    @scala.inline
    def apply(client: js.Object): PlatformClientConfiguration = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformClientConfiguration]
    }
    
    @scala.inline
    implicit class PlatformClientConfigurationMutableBuilder[Self <: PlatformClientConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: js.Object): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PlatformClientResponse[T] extends StObject {
    
    var config: js.Object = js.native
    
    var data: js.UndefOr[T] = js.native
    
    var headers: js.Any = js.native
    
    var request: js.UndefOr[js.Any] = js.native
    
    var status: Double = js.native
    
    var statusText: String = js.native
  }
  object PlatformClientResponse {
    
    @scala.inline
    def apply[T](config: js.Object, headers: js.Any, status: Double, statusText: String): PlatformClientResponse[T] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformClientResponse[T]]
    }
    
    @scala.inline
    implicit class PlatformClientResponseMutableBuilder[Self <: PlatformClientResponse[_], T] (val x: Self with PlatformClientResponse[T]) extends AnyVal {
      
      @scala.inline
      def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestLoggerConfiguration extends StObject {
    
    var extendErrorObjects: js.UndefOr[Boolean] = js.native
    
    var jsonSpace: js.UndefOr[Double] = js.native
    
    var logFunction: js.UndefOr[js.Function1[/* msg */ js.Any, Unit]] = js.native
  }
  object RequestLoggerConfiguration {
    
    @scala.inline
    def apply(): RequestLoggerConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestLoggerConfiguration]
    }
    
    @scala.inline
    implicit class RequestLoggerConfigurationMutableBuilder[Self <: RequestLoggerConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtendErrorObjects(value: Boolean): Self = StObject.set(x, "extendErrorObjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendErrorObjectsUndefined: Self = StObject.set(x, "extendErrorObjects", js.undefined)
      
      @scala.inline
      def setJsonSpace(value: Double): Self = StObject.set(x, "jsonSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonSpaceUndefined: Self = StObject.set(x, "jsonSpace", js.undefined)
      
      @scala.inline
      def setLogFunction(value: /* msg */ js.Any => Unit): Self = StObject.set(x, "logFunction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogFunctionUndefined: Self = StObject.set(x, "logFunction", js.undefined)
    }
  }
  
  @js.native
  trait ServiceTokenProviderConfiguration extends StObject {
    
    var audience: String = js.native
    
    var clientId: String = js.native
    
    var encryptedClientSecret: String = js.native
    
    var tokenEndpoint: String = js.native
  }
  object ServiceTokenProviderConfiguration {
    
    @scala.inline
    def apply(audience: String, clientId: String, encryptedClientSecret: String, tokenEndpoint: String): ServiceTokenProviderConfiguration = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], encryptedClientSecret = encryptedClientSecret.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceTokenProviderConfiguration]
    }
    
    @scala.inline
    implicit class ServiceTokenProviderConfigurationMutableBuilder[Self <: ServiceTokenProviderConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptedClientSecret(value: String): Self = StObject.set(x, "encryptedClientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenEndpoint(value: String): Self = StObject.set(x, "tokenEndpoint", value.asInstanceOf[js.Any])
    }
  }
}
