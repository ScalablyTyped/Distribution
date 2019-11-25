package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.MarkerSeverity
import typings.monacoDashEditor.monacoDashEditorMod.MarkerTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMarkerData extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var endColumn: Double
  var endLineNumber: Double
  var message: String
  var relatedInformation: js.UndefOr[js.Array[IRelatedInformation]] = js.undefined
  var severity: MarkerSeverity
  var source: js.UndefOr[String] = js.undefined
  var startColumn: Double
  var startLineNumber: Double
  var tags: js.UndefOr[js.Array[MarkerTag]] = js.undefined
}

object IMarkerData {
  @scala.inline
  def apply(
    endColumn: Double,
    endLineNumber: Double,
    message: String,
    severity: MarkerSeverity,
    startColumn: Double,
    startLineNumber: Double,
    code: String = null,
    relatedInformation: js.Array[IRelatedInformation] = null,
    source: String = null,
    tags: js.Array[MarkerTag] = null
  ): IMarkerData = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLineNumber = endLineNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLineNumber = startLineNumber.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (relatedInformation != null) __obj.updateDynamic("relatedInformation")(relatedInformation.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarkerData]
  }
}

