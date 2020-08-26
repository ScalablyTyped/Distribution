package typings.monacoEditor.mod.languages.typescript

import typings.monacoEditor.monacoEditorNumbers.`0`
import typings.monacoEditor.monacoEditorNumbers.`1`
import typings.monacoEditor.monacoEditorNumbers.`2`
import typings.monacoEditor.monacoEditorNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagnosticRelatedInformation extends js.Object {
  /** Diagnostic category: warning = 0, error = 1, suggestion = 2, message = 3 */
  var category: `0` | `1` | `2` | `3` = js.native
  var code: Double = js.native
  /** TypeScriptWorker removes this to avoid serializing circular JSON structures. */
  var file: js.UndefOr[scala.Nothing] = js.native
  var length: js.UndefOr[Double] = js.native
  var messageText: String | DiagnosticMessageChain = js.native
  var start: js.UndefOr[Double] = js.native
}

object DiagnosticRelatedInformation {
  @scala.inline
  def apply(category: `0` | `1` | `2` | `3`, code: Double, messageText: String | DiagnosticMessageChain): DiagnosticRelatedInformation = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticRelatedInformation]
  }
  @scala.inline
  implicit class DiagnosticRelatedInformationOps[Self <: DiagnosticRelatedInformation] (val x: Self) extends AnyVal {
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
    def setMessageText(value: String | DiagnosticMessageChain): Self = this.set("messageText", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

