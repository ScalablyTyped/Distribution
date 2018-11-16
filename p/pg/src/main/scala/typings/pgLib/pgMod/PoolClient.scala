package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolClient extends ClientBase {
  def release(): scala.Unit = js.native
  def release(err: nodeLib.Error): scala.Unit = js.native
}

