package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.CommentAdded
import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the comments that raised the "CommentAdded" event.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CommentAddedEventArgs extends js.Object {
  /**
    *
    * Gets the `CommentDetail` array that contains the comment ID and IDs of its related replies.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var commentDetails: js.Array[CommentDetail]
  /**
    *
    * Specifies the source of the event. See `Excel.EventSource` for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var source: EventSource | Local | Remote
  /**
    *
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: CommentAdded
  /**
    *
    * Gets the ID of the worksheet in which the event happened.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheetId: String
}

object CommentAddedEventArgs {
  @scala.inline
  def apply(
    commentDetails: js.Array[CommentDetail],
    source: EventSource | Local | Remote,
    `type`: CommentAdded,
    worksheetId: String
  ): CommentAddedEventArgs = {
    val __obj = js.Dynamic.literal(commentDetails = commentDetails.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentAddedEventArgs]
  }
}

