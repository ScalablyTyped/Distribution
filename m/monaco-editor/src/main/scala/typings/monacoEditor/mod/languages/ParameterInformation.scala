package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IMarkdownString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterInformation extends js.Object {
  /**
    * The human-readable doc-comment of this signature. Will be shown
    * in the UI but can be omitted.
    */
  var documentation: js.UndefOr[String | IMarkdownString] = js.native
  /**
    * The label of this signature. Will be shown in
    * the UI.
    */
  var label: String | (js.Tuple2[Double, Double]) = js.native
}

object ParameterInformation {
  @scala.inline
  def apply(label: String | (js.Tuple2[Double, Double])): ParameterInformation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterInformation]
  }
  @scala.inline
  implicit class ParameterInformationOps[Self <: ParameterInformation] (val x: Self) extends AnyVal {
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
    def setLabel(value: String | (js.Tuple2[Double, Double])): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentation(value: String | IMarkdownString): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
  }
  
}

