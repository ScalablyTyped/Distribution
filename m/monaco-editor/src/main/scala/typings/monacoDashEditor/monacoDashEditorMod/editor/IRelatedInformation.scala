package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRelatedInformation extends js.Object {
  var endColumn: Double
  var endLineNumber: Double
  var message: String
  var resource: Uri
  var startColumn: Double
  var startLineNumber: Double
}

object IRelatedInformation {
  @scala.inline
  def apply(
    endColumn: Double,
    endLineNumber: Double,
    message: String,
    resource: Uri,
    startColumn: Double,
    startLineNumber: Double
  ): IRelatedInformation = {
    val __obj = js.Dynamic.literal(endColumn = endColumn, endLineNumber = endLineNumber, message = message, resource = resource, startColumn = startColumn, startLineNumber = startLineNumber)
  
    __obj.asInstanceOf[IRelatedInformation]
  }
}

