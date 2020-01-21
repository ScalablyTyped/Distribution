package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IMarkdownString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureInformation extends js.Object {
  /**
    * The human-readable doc-comment of this signature. Will be shown
    * in the UI but can be omitted.
    */
  var documentation: js.UndefOr[String | IMarkdownString] = js.undefined
  /**
    * The label of this signature. Will be shown in
    * the UI.
    */
  var label: String
  /**
    * The parameters of this signature.
    */
  var parameters: js.Array[ParameterInformation]
}

object SignatureInformation {
  @scala.inline
  def apply(
    label: String,
    parameters: js.Array[ParameterInformation],
    documentation: String | IMarkdownString = null
  ): SignatureInformation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureInformation]
  }
}

