package typings.postcssReporter.anon

import typings.postcss.mod.ResultMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Messages extends js.Object {
  var messages: js.Array[ResultMessage]
  var source: String
}

object Messages {
  @scala.inline
  def apply(messages: js.Array[ResultMessage], source: String): Messages = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
}

