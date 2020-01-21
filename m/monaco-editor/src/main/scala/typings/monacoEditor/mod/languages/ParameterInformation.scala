package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IMarkdownString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterInformation extends js.Object {
  /**
    * The human-readable doc-comment of this signature. Will be shown
    * in the UI but can be omitted.
    */
  var documentation: js.UndefOr[String | IMarkdownString] = js.undefined
  /**
    * The label of this signature. Will be shown in
    * the UI.
    */
  var label: String | (js.Tuple2[Double, Double])
}

object ParameterInformation {
  @scala.inline
  def apply(label: String | (js.Tuple2[Double, Double]), documentation: String | IMarkdownString = null): ParameterInformation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterInformation]
  }
}

