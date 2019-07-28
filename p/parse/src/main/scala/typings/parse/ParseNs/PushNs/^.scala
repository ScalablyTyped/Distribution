package typings.parse.ParseNs.PushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Push")
@js.native
object ^ extends js.Object {
  def send[T](data: PushData): js.Promise[T] = js.native
  def send[T](data: PushData, options: SendOptions): js.Promise[T] = js.native
}

