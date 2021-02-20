package typings.nes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("nes/client", JSImport.Namespace)
  @js.native
  class ^ protected () extends Client {
    def this(url: String) = this()
    def this(url: String, options: ClientOptions) = this()
  }
  
  @js.native
  trait Client extends StObject {
    
    def connect(): js.Promise[_] = js.native
    def connect(options: ClientConnectOptions): js.Promise[_] = js.native
    
    def disconnect(): js.Promise[_] = js.native
    
    var id: js.Any = js.native
    
    def message(message: js.Any): js.Promise[_] = js.native
    
    def onConnect(): Unit = js.native
    
    def onDisconnect(): Unit = js.native
    
    def onError(err: js.Any): Unit = js.native
    
    def onUpdate(message: js.Any): Unit = js.native
    
    def overrideReconnectionAuth(auth: js.Any): Unit = js.native
    
    // can be `null | number` but also the "socket" value from websocket message data.
    def request(options: String): js.Promise[_] = js.native
    def request(options: ClientRequestOptions): js.Promise[_] = js.native
    
    def subscribe(path: String, handler: Handler): js.Promise[_] = js.native
    
    def subscriptions(): js.Array[String] = js.native
    
    def unsubscribe(path: String, handler: Handler): js.Promise[_] = js.native
  }
  
  @js.native
  trait ClientConnectOptions extends StObject {
    
    var auth: js.UndefOr[js.Any] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var maxDelay: js.UndefOr[Double] = js.native
    
    var retries: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object ClientConnectOptions {
    
    @scala.inline
    def apply(): ClientConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientConnectOptions]
    }
    
    @scala.inline
    implicit class ClientConnectOptionsMutableBuilder[Self <: ClientConnectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: js.Any): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait ClientOptions extends StObject {
    
    var timeout: js.UndefOr[Double | Boolean] = js.native
    
    var ws: js.UndefOr[js.Any] = js.native
  }
  object ClientOptions {
    
    @scala.inline
    def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double | Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWs(value: js.Any): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsUndefined: Self = StObject.set(x, "ws", js.undefined)
    }
  }
  
  @js.native
  trait ClientRequestOptions extends StObject {
    
    var headers: js.UndefOr[js.Object] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var path: String = js.native
    
    var payload: js.UndefOr[js.Any] = js.native
  }
  object ClientRequestOptions {
    
    @scala.inline
    def apply(path: String): ClientRequestOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientRequestOptions]
    }
    
    @scala.inline
    implicit class ClientRequestOptionsMutableBuilder[Self <: ClientRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  @js.native
  trait ClientSubscribeFlags extends StObject {
    
    var revoked: js.UndefOr[Boolean] = js.native
  }
  object ClientSubscribeFlags {
    
    @scala.inline
    def apply(): ClientSubscribeFlags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientSubscribeFlags]
    }
    
    @scala.inline
    implicit class ClientSubscribeFlagsMutableBuilder[Self <: ClientSubscribeFlags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRevoked(value: Boolean): Self = StObject.set(x, "revoked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevokedUndefined: Self = StObject.set(x, "revoked", js.undefined)
    }
  }
  
  type Handler = js.Function2[/* message */ js.Any, /* flags */ ClientSubscribeFlags, Unit]
}
