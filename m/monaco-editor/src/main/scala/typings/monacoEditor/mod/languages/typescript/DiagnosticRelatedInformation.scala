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
    file: js.UndefOr[scala.Nothing] = js.undefined,
    length: Int | Double = null,
    start: Int | Double = null
  ): DiagnosticRelatedInformation = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    if (!js.isUndefined(file)) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticRelatedInformation]
  }
}

