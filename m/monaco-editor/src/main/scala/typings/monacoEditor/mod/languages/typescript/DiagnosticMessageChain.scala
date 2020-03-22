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
trait DiagnosticMessageChain extends js.Object {
  /** Diagnostic category: warning = 0, error = 1, suggestion = 2, message = 3 */
  var category: `0` | `1` | `2` | `3`
  var code: Double
  var messageText: String
  var next: js.UndefOr[js.Array[DiagnosticMessageChain]] = js.undefined
}

object DiagnosticMessageChain {
  @scala.inline
  def apply(
    category: `0` | `1` | `2` | `3`,
    code: Double,
    messageText: String,
    next: js.Array[DiagnosticMessageChain] = null
  ): DiagnosticMessageChain = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticMessageChain]
  }
}

