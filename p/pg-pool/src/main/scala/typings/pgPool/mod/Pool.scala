package typings.pgPool.mod

import typings.pg.mod.PoolClient
import typings.pgPool.pgPoolStrings.acquire
import typings.pgPool.pgPoolStrings.connect
import typings.pgPool.pgPoolStrings.error
import typings.pgPool.pgPoolStrings.remove
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pool[T /* <: typings.pg.mod.Client */]
  extends typings.pg.mod.Pool {
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

