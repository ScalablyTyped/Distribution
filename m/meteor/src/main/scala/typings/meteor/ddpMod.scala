package typings.meteor

import org.scalablytyped.runtime.Instantiable1
import typings.meteor.Meteor.Connection
import typings.meteor.Meteor.SubscriptionHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ddpMod {
  
  object DDP {
    
    @JSImport("meteor/ddp", "DDP._allSubscriptionsReady")
    @js.native
    def allSubscriptionsReady(): Boolean = js.native
    
    @JSImport("meteor/ddp", "DDP.connect")
    @js.native
    def connect(url: String): DDPStatic = js.native
    
    @js.native
    trait DDPStatic extends StObject {
      
      @JSName("apply")
      def apply(method: String, parameters: js.Any*): js.Any = js.native
      
      def call(method: String, parameters: js.Any*): js.Any = js.native
      
      def disconnect(): Unit = js.native
      
      def methods(IMeteorMethodsDictionary: js.Any): js.Any = js.native
      
      def onReconnect(): Unit = js.native
      
      def reconnect(): Unit = js.native
      
      def status(): DDPStatus = js.native
      
      def subscribe(name: String, rest: js.Any*): SubscriptionHandle = js.native
    }
    object DDPStatic {
      
      @scala.inline
      def apply(
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
      
      @scala.inline
      implicit class DDPStaticMutableBuilder[Self <: DDPStatic] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApply(value: (String, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCall(value: (String, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "call", js.Any.fromFunction2(value))
        
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
    
    @js.native
    trait DDPStatus extends StObject {
      
      var connected: Boolean = js.native
      
      var reason: js.UndefOr[String] = js.native
      
      var retryCount: Double = js.native
      
      var retryTime: js.UndefOr[Double] = js.native
      
      var status: Status = js.native
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
      - typings.meteor.meteorStrings.connected
      - typings.meteor.meteorStrings.connecting
      - typings.meteor.meteorStrings.failed
      - typings.meteor.meteorStrings.waiting
      - typings.meteor.meteorStrings.offline
    */
    trait Status extends StObject
    object Status {
      
      @scala.inline
      def connected: typings.meteor.meteorStrings.connected = "connected".asInstanceOf[typings.meteor.meteorStrings.connected]
      
      @scala.inline
      def connecting: typings.meteor.meteorStrings.connecting = "connecting".asInstanceOf[typings.meteor.meteorStrings.connecting]
      
      @scala.inline
      def failed: typings.meteor.meteorStrings.failed = "failed".asInstanceOf[typings.meteor.meteorStrings.failed]
      
      @scala.inline
      def offline: typings.meteor.meteorStrings.offline = "offline".asInstanceOf[typings.meteor.meteorStrings.offline]
      
      @scala.inline
      def waiting: typings.meteor.meteorStrings.waiting = "waiting".asInstanceOf[typings.meteor.meteorStrings.waiting]
    }
  }
  
  object DDPCommon {
    
    @js.native
    trait MethodInvocation extends Instantiable1[/* options */ MethodInvocationOptions, MethodInvocation] {
      
      var connection: Connection = js.native
      
      var isSimulation: Boolean = js.native
      
      def setUserId(userId: String): Unit = js.native
      
      def unblock(): Unit = js.native
      
      var userId: String | Null = js.native
    }
    
    @js.native
    trait MethodInvocationOptions extends StObject {
      
      var connection: Connection = js.native
      
      var isSimulation: Boolean = js.native
      
      var randomSeed: String = js.native
      
      var setUserId: js.UndefOr[js.Function1[/* newUserId */ String, Unit]] = js.native
      
      var userId: String | Null = js.native
    }
    object MethodInvocationOptions {
      
      @scala.inline
      def apply(connection: Connection, isSimulation: Boolean, randomSeed: String): MethodInvocationOptions = {
        val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isSimulation = isSimulation.asInstanceOf[js.Any], randomSeed = randomSeed.asInstanceOf[js.Any])
        __obj.asInstanceOf[MethodInvocationOptions]
      }
      
      @scala.inline
      implicit class MethodInvocationOptionsMutableBuilder[Self <: MethodInvocationOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsSimulation(value: Boolean): Self = StObject.set(x, "isSimulation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRandomSeed(value: String): Self = StObject.set(x, "randomSeed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetUserId(value: /* newUserId */ String => Unit): Self = StObject.set(x, "setUserId", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetUserIdUndefined: Self = StObject.set(x, "setUserId", js.undefined)
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIdNull: Self = StObject.set(x, "userId", null)
      }
    }
  }
}
