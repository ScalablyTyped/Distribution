package typings.omelette.omeletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackValue extends js.Object {
  var before: String = js.native
  var fragment: Double = js.native
  var line: String = js.native
  @JSName("reply")
  var reply_Original: ReplyFn[Choices] = js.native
  def reply(value: Choices): Unit = js.native
}

