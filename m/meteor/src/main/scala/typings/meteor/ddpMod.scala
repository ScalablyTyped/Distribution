package typings.meteor

import org.scalablytyped.runtime.Instantiable1
import typings.meteor.Meteor.Connection
import typings.meteor.Meteor.SubscriptionHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ddpMod {
  
  object DDP {
    
    @JSImport("meteor/ddp", "DDP")
    @js.native
    val ^ : js.Any = js.native
    
    inline def allSubscriptionsReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_allSubscriptionsReady")().asInstanceOf[Boolean]
    
    inline def connect(url: String): DDPStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[DDPStatic]
    
    trait DDPStatic extends StObject {
      
      @JSName("apply")
      def apply(method: String, parameters: js.Any*): js.Any
      
      def call(method: String, parameters: js.Any*): js.Any
      
      def disconnect(): Unit
      
      def methods(IMeteorMethodsDictionary: js.Any): js.Any
      
      def onReconnect(): Unit
      
      def reconnect(): Unit
      
      def status(): DDPStatus
      
      def subscribe(name: String, rest: js.Any*): SubscriptionHandle
    }
    object DDPStatic {
      
      inline def apply(
        apply: (String, /* repeated */ js.Any) => js.Any,
        call: (String, /* repeated */ js.Any) => js.Any,
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
      
      extension [Self <: DDPStatic](x: Self) {
        
        inline def setApply(value: (String, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
        
        inline def setCall(value: (String, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "call", js.Any.fromFunction2(value))
        
        inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
        
        inline def setMethods(value: js.Any => js.Any): Self = StObject.set(x, "methods", js.Any.fromFunction1(value))
        
        inline def setOnReconnect(value: () => Unit): Self = StObject.set(x, "onReconnect", js.Any.fromFunction0(value))
        
        inline def setReconnect(value: () => Unit): Self = StObject.set(x, "reconnect", js.Any.fromFunction0(value))
        
        inline def setStatus(value: () => DDPStatus): Self = StObject.set(x, "status", js.Any.fromFunction0(value))
        
        inline def setSubscribe(value: (String, /* repeated */ js.Any) => SubscriptionHandle): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
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
      
      inline def apply(connected: Boolean, retryCount: Double, status: Status): DDPStatus = {
        val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], retryCount = retryCount.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[DDPStatus]
      }
      
      extension [Self <: DDPStatus](x: Self) {
        
        inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
        
        inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
        
        inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
        
        inline def setRetryTime(value: Double): Self = StObject.set(x, "retryTime", value.asInstanceOf[js.Any])
        
        inline def setRetryTimeUndefined: Self = StObject.set(x, "retryTime", js.undefined)
        
        inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.meteor.meteorStrings.connected
      - typings.meteor.meteorStrings.connecting
      - typings.meteor.meteorStrings.failed
      - typings.meteor.meteorStrings.waiting
      - typings.meteor.meteorStrings.offline
    */
    trait Status extends StObject
    object Status {
      
      inline def connected: typings.meteor.meteorStrings.connected = "connected".asInstanceOf[typings.meteor.meteorStrings.connected]
      
      inline def connecting: typings.meteor.meteorStrings.connecting = "connecting".asInstanceOf[typings.meteor.meteorStrings.connecting]
      
      inline def failed: typings.meteor.meteorStrings.failed = "failed".asInstanceOf[typings.meteor.meteorStrings.failed]
      
      inline def offline: typings.meteor.meteorStrings.offline = "offline".asInstanceOf[typings.meteor.meteorStrings.offline]
      
      inline def waiting: typings.meteor.meteorStrings.waiting = "waiting".asInstanceOf[typings.meteor.meteorStrings.waiting]
    }
  }
  
  object DDPCommon {
    
    @js.native
    trait MethodInvocation
      extends StObject
         with Instantiable1[/* options */ MethodInvocationOptions, MethodInvocation] {
      
      var connection: Connection = js.native
      
      var isSimulation: Boolean = js.native
      
      def setUserId(userId: String): Unit = js.native
      
      def unblock(): Unit = js.native
      
      var userId: String | Null = js.native
    }
    
    trait MethodInvocationOptions extends StObject {
      
      var connection: Connection
      
      var isSimulation: Boolean
      
      var randomSeed: String
      
      var setUserId: js.UndefOr[js.Function1[/* newUserId */ String, Unit]] = js.undefined
      
      var userId: String | Null
    }
    object MethodInvocationOptions {
      
      inline def apply(connection: Connection, isSimulation: Boolean, randomSeed: String): MethodInvocationOptions = {
        val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isSimulation = isSimulation.asInstanceOf[js.Any], randomSeed = randomSeed.asInstanceOf[js.Any], userId = null)
        __obj.asInstanceOf[MethodInvocationOptions]
      }
      
      extension [Self <: MethodInvocationOptions](x: Self) {
        
        inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
        
        inline def setIsSimulation(value: Boolean): Self = StObject.set(x, "isSimulation", value.asInstanceOf[js.Any])
        
        inline def setRandomSeed(value: String): Self = StObject.set(x, "randomSeed", value.asInstanceOf[js.Any])
        
        inline def setSetUserId(value: /* newUserId */ String => Unit): Self = StObject.set(x, "setUserId", js.Any.fromFunction1(value))
        
        inline def setSetUserIdUndefined: Self = StObject.set(x, "setUserId", js.undefined)
        
        inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        inline def setUserIdNull: Self = StObject.set(x, "userId", null)
      }
    }
  }
}
