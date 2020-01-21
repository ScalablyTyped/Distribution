package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Uri
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
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLineNumber = endLineNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLineNumber = startLineNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRelatedInformation]
  }
}

