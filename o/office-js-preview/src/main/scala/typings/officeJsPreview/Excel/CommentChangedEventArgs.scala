package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.CommentChanged
import typings.officeJsPreview.officeJsPreviewStrings.CommentEdited
import typings.officeJsPreview.officeJsPreviewStrings.CommentReopened
import typings.officeJsPreview.officeJsPreviewStrings.CommentResolved
import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import typings.officeJsPreview.officeJsPreviewStrings.ReplyAdded
import typings.officeJsPreview.officeJsPreviewStrings.ReplyDeleted
import typings.officeJsPreview.officeJsPreviewStrings.ReplyEdited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Occurs when existing comments are changed.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CommentChangedEventArgs extends js.Object {
  /**
    *
    * Gets the change type that represents how the changed event is triggered.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var changeType: CommentChangeType | CommentEdited | CommentResolved | CommentReopened | ReplyAdded | ReplyDeleted | ReplyEdited
  /**
    *
    * Gets the `CommentDetail` array which contains the comment ID and IDs of its related replies.
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
  var `type`: CommentChanged
  /**
    *
    * Gets the ID of the worksheet in which the event happened.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheetId: String
}

object CommentChangedEventArgs {
  @scala.inline
  def apply(
    changeType: CommentChangeType | CommentEdited | CommentResolved | CommentReopened | ReplyAdded | ReplyDeleted | ReplyEdited,
    commentDetails: js.Array[CommentDetail],
    source: EventSource | Local | Remote,
    `type`: CommentChanged,
    worksheetId: String
  ): CommentChangedEventArgs = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], commentDetails = commentDetails.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentChangedEventArgs]
  }
}

