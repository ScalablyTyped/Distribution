package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.CommentChanged
import typings.officeJs.officeJsStrings.CommentEdited
import typings.officeJs.officeJsStrings.CommentReopened
import typings.officeJs.officeJsStrings.CommentResolved
import typings.officeJs.officeJsStrings.Local
import typings.officeJs.officeJsStrings.Remote
import typings.officeJs.officeJsStrings.ReplyAdded
import typings.officeJs.officeJsStrings.ReplyDeleted
import typings.officeJs.officeJsStrings.ReplyEdited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Occurs when existing comments are changed.
  *
  * [Api set: ExcelApi 1.12]
  */
trait CommentChangedEventArgs extends StObject {
  
  /**
    *
    * Gets the change type that represents how the changed event is triggered.
    *
    * [Api set: ExcelApi 1.12]
    */
  var changeType: CommentChangeType | CommentEdited | CommentResolved | CommentReopened | ReplyAdded | ReplyDeleted | ReplyEdited
  
  /**
    *
    * Get the CommentDetail array which contains the comment Id and Ids of its related replies.
    *
    * [Api set: ExcelApi 1.12]
    */
  var commentDetails: js.Array[CommentDetail]
  
  /**
    *
    * Specifies the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.12]
    */
  var source: EventSource | Local | Remote
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.12]
    */
  var `type`: CommentChanged
  
  /**
    *
    * Gets the Id of the worksheet in which the event happened.
    *
    * [Api set: ExcelApi 1.12]
    */
  var worksheetId: String
}
object CommentChangedEventArgs {
  
  @scala.inline
  def apply(
    changeType: CommentChangeType | CommentEdited | CommentResolved | CommentReopened | ReplyAdded | ReplyDeleted | ReplyEdited,
    commentDetails: js.Array[CommentDetail],
    source: EventSource | Local | Remote,
    worksheetId: String
  ): CommentChangedEventArgs = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], commentDetails = commentDetails.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentChanged")
    __obj.asInstanceOf[CommentChangedEventArgs]
  }
  
  @scala.inline
  implicit class CommentChangedEventArgsMutableBuilder[Self <: CommentChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(
      value: CommentChangeType | CommentEdited | CommentResolved | CommentReopened | ReplyAdded | ReplyDeleted | ReplyEdited
    ): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentDetails(value: js.Array[CommentDetail]): Self = StObject.set(x, "commentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentDetailsVarargs(value: CommentDetail*): Self = StObject.set(x, "commentDetails", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CommentChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
