package typings.pgDashPool.pgDashPoolMod

import typings.pg.pgMod.PoolClient
import typings.pgDashPool.pgDashPoolStrings.acquire
import typings.pgDashPool.pgDashPoolStrings.connect
import typings.pgDashPool.pgDashPoolStrings.error
import typings.pgDashPool.pgDashPoolStrings.remove
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pool[T /* <: typings.pg.pgMod.Client */]
  extends typings.pg.pgMod.Pool {
  val Client: ClientLikeCtr[T] = js.native
  @JSName("on")
  def on_acquire(event: acquire, listener: js.Function1[/* client */ T with PoolClient, Unit]): this.type = js.native
  @JSName("on")
  def on_connect(event: connect, listener: js.Function1[/* client */ T with PoolClient, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function2[/* err */ Error, /* client */ T with PoolClient, Unit]): this.type = js.native
  @JSName("on")
  def on_remove(event: remove, listener: js.Function1[/* client */ T with PoolClient, Unit]): this.type = js.native
}

