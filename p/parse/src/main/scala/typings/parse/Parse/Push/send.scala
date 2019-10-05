package typings.parse.Parse.Push

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Push.send")
@js.native
object send extends js.Object {
  def apply[T](data: PushData): js.Promise[T] = js.native
  def apply[T](data: PushData, options: SendOptions): js.Promise[T] = js.native
}

