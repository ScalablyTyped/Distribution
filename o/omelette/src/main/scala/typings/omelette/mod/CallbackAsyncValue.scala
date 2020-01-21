package typings.omelette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackAsyncValue extends js.Object {
  var before: String = js.native
  var fragment: Double = js.native
  var line: String = js.native
  @JSName("reply")
  var reply_Original: ReplyFn[js.Promise[Choices]] = js.native
  def reply(value: js.Promise[Choices]): Unit = js.native
}

