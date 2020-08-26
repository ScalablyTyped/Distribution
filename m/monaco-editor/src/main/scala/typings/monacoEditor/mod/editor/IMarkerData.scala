package typings.monacoEditor.mod.editor

import typings.monacoEditor.anon.Link
import typings.monacoEditor.mod.MarkerSeverity
import typings.monacoEditor.mod.MarkerTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMarkerData extends js.Object {
  var code: js.UndefOr[String | Link] = js.native
  var endColumn: Double = js.native
  var endLineNumber: Double = js.native
  var message: String = js.native
  var relatedInformation: js.UndefOr[js.Array[IRelatedInformation]] = js.native
  var severity: MarkerSeverity = js.native
  var source: js.UndefOr[String] = js.native
  var startColumn: Double = js.native
  var startLineNumber: Double = js.native
  var tags: js.UndefOr[js.Array[MarkerTag]] = js.native
}

object IMarkerData {
  @scala.inline
  def apply(
    endColumn: Double,
    endLineNumber: Double,
    message: String,
    severity: MarkerSeverity,
    startColumn: Double,
    startLineNumber: Double
  ): IMarkerData = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLineNumber = endLineNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLineNumber = startLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarkerData]
  }
  @scala.inline
  implicit class IMarkerDataOps[Self <: IMarkerData] (val x: Self) extends AnyVal {
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
    def setEndColumn(value: Double): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndLineNumber(value: Double): Self = this.set("endLineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeverity(value: MarkerSeverity): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartLineNumber(value: Double): Self = this.set("startLineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String | Link): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setRelatedInformationVarargs(value: IRelatedInformation*): Self = this.set("relatedInformation", js.Array(value :_*))
    @scala.inline
    def setRelatedInformation(value: js.Array[IRelatedInformation]): Self = this.set("relatedInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedInformation: Self = this.set("relatedInformation", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTagsVarargs(value: MarkerTag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[MarkerTag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

