package typings.nodeRedisPubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: js.Object): NodeRedisPubSub = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[NodeRedisPubSub]
  
  @JSImport("node-redis-pubsub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-redis-pubsub", "NodeRedisPubSub")
  @js.native
  open class NodeRedisPubSub protected () extends StObject {
    def this(options: js.Object) = this()
    
    def emit(channel: String, message: String): Unit = js.native
    
    def end(): Unit = js.native
    
    def getRedisClient(): Any = js.native
    
    def on(channel: String, handler: js.Function2[/* data */ String, /* channel */ String, Unit]): js.Function0[Unit] = js.native
    def on(
      channel: String,
      handler: js.Function2[/* data */ String, /* channel */ String, Unit],
      callback: js.Function0[Unit]
    ): js.Function0[Unit] = js.native
    
    def publish(channel: String, message: String): Unit = js.native
    
    def quit(): Unit = js.native
    
    def subscribe(channel: String, handler: js.Function2[/* data */ String, /* channel */ String, Unit]): js.Function0[Unit] = js.native
    def subscribe(
      channel: String,
      handler: js.Function2[/* data */ String, /* channel */ String, Unit],
      callback: js.Function0[Unit]
    ): js.Function0[Unit] = js.native
  }
  
  inline def initClient(options: js.Object): NodeRedisPubSub = ^.asInstanceOf[js.Dynamic].applyDynamic("initClient")(options.asInstanceOf[js.Any]).asInstanceOf[NodeRedisPubSub]
}
