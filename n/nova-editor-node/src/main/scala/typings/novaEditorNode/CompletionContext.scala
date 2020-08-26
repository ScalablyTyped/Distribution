package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/completion-context/
@js.native
trait CompletionContext extends js.Object {
  val line: String = js.native
  val position: Double = js.native
  val reason: CompletionReason = js.native
  val text: String = js.native
}

object CompletionContext {
  @scala.inline
  def apply(line: String, position: Double, reason: CompletionReason, text: String): CompletionContext = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionContext]
  }
  @scala.inline
  implicit class CompletionContextOps[Self <: CompletionContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: CompletionReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

