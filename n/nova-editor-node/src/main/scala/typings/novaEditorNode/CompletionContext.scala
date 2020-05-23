package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/completion-context/
trait CompletionContext extends js.Object {
  val line: String
  val position: Double
  val reason: CompletionReason
  val text: String
}

object CompletionContext {
  @scala.inline
  def apply(line: String, position: Double, reason: CompletionReason, text: String): CompletionContext = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionContext]
  }
}

