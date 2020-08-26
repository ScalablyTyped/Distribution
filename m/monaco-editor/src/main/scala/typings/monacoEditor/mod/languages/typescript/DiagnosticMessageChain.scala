package typings.monacoEditor.mod.languages.typescript

import typings.monacoEditor.monacoEditorNumbers.`0`
import typings.monacoEditor.monacoEditorNumbers.`1`
import typings.monacoEditor.monacoEditorNumbers.`2`
import typings.monacoEditor.monacoEditorNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A linked list of formatted diagnostic messages to be used as part of a multiline message.
  * It is built from the bottom up, leaving the head to be the "main" diagnostic.
  */
@js.native
trait DiagnosticMessageChain extends js.Object {
  /** Diagnostic category: warning = 0, error = 1, suggestion = 2, message = 3 */
  var category: `0` | `1` | `2` | `3` = js.native
  var code: Double = js.native
  var messageText: String = js.native
  var next: js.UndefOr[js.Array[DiagnosticMessageChain]] = js.native
}

object DiagnosticMessageChain {
  @scala.inline
  def apply(category: `0` | `1` | `2` | `3`, code: Double, messageText: String): DiagnosticMessageChain = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticMessageChain]
  }
  @scala.inline
  implicit class DiagnosticMessageChainOps[Self <: DiagnosticMessageChain] (val x: Self) extends AnyVal {
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
    def setCategory(value: `0` | `1` | `2` | `3`): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageText(value: String): Self = this.set("messageText", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextVarargs(value: DiagnosticMessageChain*): Self = this.set("next", js.Array(value :_*))
    @scala.inline
    def setNext(value: js.Array[DiagnosticMessageChain]): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
  
}

