package typings
package nodeDashRedisDashPubsubLib.nodeDashRedisDashPubsubMod.NRPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeRedisPubSub extends js.Object {
  def emit(channel: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def getRedisClient(): redisLib.redisMod.RedisClient = js.native
  def on(
    channel: java.lang.String,
    handler: js.Function2[/* data */ java.lang.String, /* channel */ java.lang.String, scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def on(
    channel: java.lang.String,
    handler: js.Function2[/* data */ java.lang.String, /* channel */ java.lang.String, scala.Unit],
    callback: js.Function0[scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def publish(channel: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def quit(): scala.Unit = js.native
  def subscribe(
    channel: java.lang.String,
    handler: js.Function2[/* data */ java.lang.String, /* channel */ java.lang.String, scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def subscribe(
    channel: java.lang.String,
    handler: js.Function2[/* data */ java.lang.String, /* channel */ java.lang.String, scala.Unit],
    callback: js.Function0[scala.Unit]
  ): js.Function0[scala.Unit] = js.native
}

