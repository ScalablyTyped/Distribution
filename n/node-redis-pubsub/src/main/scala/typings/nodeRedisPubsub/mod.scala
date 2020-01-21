package typings.nodeRedisPubsub

import typings.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-redis-pubsub", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class NodeRedisPubSub protected () extends js.Object {
    def this(options: js.Object) = this()
    def emit(channel: String, message: String): Unit = js.native
    def end(): Unit = js.native
    def getRedisClient(): RedisClient = js.native
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
  
  def apply(options: js.Object): NodeRedisPubSub = js.native
  def initClient(options: js.Object): NodeRedisPubSub = js.native
}

