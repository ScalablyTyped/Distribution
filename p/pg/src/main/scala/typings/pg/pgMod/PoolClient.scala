package typings.pg.pgMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolClient extends ClientBase {
  def release(): Unit = js.native
  def release(err: Boolean): Unit = js.native
  def release(err: Error): Unit = js.native
}

