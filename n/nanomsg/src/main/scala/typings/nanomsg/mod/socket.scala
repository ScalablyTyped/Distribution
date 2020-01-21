package typings.nanomsg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nanomsg", "socket")
@js.native
object socket extends js.Object {
  def apply(`type`: String): Socket_ = js.native
  def apply(`type`: String, opts: Options): Socket_ = js.native
}

