package typings.monacoEditor.mod.languages.typescript

import typings.monacoEditor.monacoEditorNumbers.`0`
import typings.monacoEditor.monacoEditorNumbers.`1`
import typings.monacoEditor.monacoEditorNumbers.`2`
import typings.monacoEditor.monacoEditorNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticRelatedInformation extends js.Object {
  /** Diagnostic category: warning = 0, error = 1, suggestion = 2, message = 3 */
  var category: `0` | `1` | `2` | `3`
  var code: Double
  /** TypeScriptWorker removes this to avoid serializing circular JSON structures. */
  var file: js.UndefOr[scala.Nothing] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var messageText: String | DiagnosticMessageChain
  var start: js.UndefOr[Double] = js.undefined
}

object DiagnosticRelatedInformation {
  @scala.inline
  def apply(
    category: `0` | `1` | `2` | `3`,
    code: Double,
    messageText: String | DiagnosticMessageChain,
    length: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined
  ): DiagnosticRelatedInformation = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticRelatedInformation]
  }
}

