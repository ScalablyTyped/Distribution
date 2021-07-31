package typings.meteorTypings

import org.scalablytyped.runtime.Instantiable1
import typings.meteorTypings.Meteor.SubscriptionHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ddpMod {
  
  object DDP {
    
    @JSImport("meteor/ddp", "DDP")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def allSubscriptionsReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_allSubscriptionsReady")().asInstanceOf[Boolean]
    
    @scala.inline
    def connect(url: String): DDPStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[DDPStatic]
    
    trait DDPStatic extends StObject {
      
      @JSName("apply")
      def apply(method: String, parameters: js.Any*): Unit
      
      def call(method: String, parameters: js.Any*): Unit
      
      def disconnect(): Unit
      
      def methods(IMeteorMethodsDictionary: js.Any): js.Any
      
      def onReconnect(): Unit
      
      def reconnect(): Unit
      
      def status(): DDPStatus
      
      def subscribe(name: String, rest: js.Any*): SubscriptionHandle
    }
    object DDPStatic {
      
      @scala.inline
      def apply(
        apply: (String, /* repeated */ js.Any) => Unit,
        call: (String, /* repeated */ js.Any) => Unit,
        disconnect: () => Unit,
        methods: js.Any => js.Any,
        onReconnect: () => Unit,
        reconnect: () => Unit,
        status: () => DDPStatus,
        subscribe: (String, /* repeated */ js.Any) => SubscriptionHandle
      ): DDPStatic = {
        val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), call = js.Any.fromFunction2(call), disconnect = js.Any.fromFunction0(disconnect), methods = js.Any.fromFunction1(methods), onReconnect = js.Any.fromFunction0(onReconnect), reconnect = js.Any.fromFunction0(reconnect), status = js.Any.fromFunction0(status), subscribe = js.Any.fromFunction2(subscribe))
        __obj.asInstanceOf[DDPStatic]
      }
      
      @scala.inline
      implicit class DDPStaticMutableBuilder[Self <: DDPStatic] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApply(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCall(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "call", js.Any.fromFunction2(value))
        
        @scala.inline
        def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
        
        @scala.inline
        def setMethods(value: js.Any => js.Any): Self = StObject.set(x, "methods", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnReconnect(value: () => Unit): Self = StObject.set(x, "onReconnect", js.Any.fromFunction0(value))
        
        @scala.inline
        def setReconnect(value: () => Unit): Self = StObject.set(x, "reconnect", js.Any.fromFunction0(value))
        
        @scala.inline
        def setStatus(value: () => DDPStatus): Self = StObject.set(x, "status", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSubscribe(value: (String, /* repeated */ js.Any) => SubscriptionHandle): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
      }
    }
    
    trait DDPStatus extends StObject {
      
      var connected: Boolean
      
      var reason: js.UndefOr[String] = js.undefined
      
      var retryCount: Double
      
      var retryTime: js.UndefOr[Double] = js.undefined
      
      var status: Status
    }
    object DDPStatus {
      
      @scala.inline
      def apply(connected: Boolean, retryCount: Double, status: Status): DDPStatus = {
        val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], retryCount = retryCount.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[DDPStatus]
      }
      
      @scala.inline
      implicit class DDPStatusMutableBuilder[Self <: DDPStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
        
        @scala.inline
        def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRetryTime(value: Double): Self = StObject.set(x, "retryTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRetryTimeUndefined: Self = StObject.set(x, "retryTime", js.undefined)
        
        @scala.inline
        def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.meteorTypings.meteorTypingsStrings.connected
      - typings.meteorTypings.meteorTypingsStrings.connecting
      - typings.meteorTypings.meteorTypingsStrings.failed
      - typings.meteorTypings.meteorTypingsStrings.waiting
      - typings.meteorTypings.meteorTypingsStrings.offline
    */
    trait Status extends StObject
    object Status {
      
      @scala.inline
      def connected: typings.meteorTypings.meteorTypingsStrings.connected = "connected".asInstanceOf[typings.meteorTypings.meteorTypingsStrings.connected]
      
      @scala.inline
      def connecting: typings.meteorTypings.meteorTypingsStrings.connecting = "connecting".asInstanceOf[typings.meteorTypings.meteorTypingsStrings.connecting]
      
      @scala.inline
      def failed: typings.meteorTypings.meteorTypingsStrings.failed = "failed".asInstanceOf[typings.meteorTypings.meteorTypingsStrings.failed]
      
      @scala.inline
      def offline: typings.meteorTypings.meteorTypingsStrings.offline = "offline".asInstanceOf[typings.meteorTypings.meteorTypingsStrings.offline]
      
      @scala.inline
      def waiting: typings.meteorTypings.meteorTypingsStrings.waiting = "waiting".asInstanceOf[typings.meteorTypings.meteorTypingsStrings.waiting]
    }
  }
  
  object DDPCommon {
    
    @js.native
    trait MethodInvocation
      extends StObject
         with Instantiable1[/* options */ js.Object, MethodInvocation] {
      
      def setUserId(userId: Double): Unit = js.native
      
      def unblock(): Unit = js.native
    }
  }
}
