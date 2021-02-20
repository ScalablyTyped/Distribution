package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.CommentDeleted
import typings.officeJs.officeJsStrings.Local
import typings.officeJs.officeJsStrings.Remote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the comments that raised the "CommentDeleted" event.
  *
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait CommentDeletedEventArgs extends StObject {
  
  /**
    *
    * Gets the `CommentDetail` array that contains the comment ID and IDs of its related replies.
    *
    * [Api set: ExcelApi 1.12]
    */
  var commentDetails: js.Array[CommentDetail] = js.native
  
  /**
    *
    * Specifies the source of the event. See `Excel.EventSource` for details.
    *
    * [Api set: ExcelApi 1.12]
    */
  var source: EventSource | Local | Remote = js.native
  
  /**
    *
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * [Api set: ExcelApi 1.12]
    */
  var `type`: CommentDeleted = js.native
  
  /**
    *
    * Gets the Id of the worksheet in which the event happened.
    *
    * [Api set: ExcelApi 1.12]
    */
  var worksheetId: String = js.native
}
object CommentDeletedEventArgs {
  
  @scala.inline
  def apply(
    commentDetails: js.Array[CommentDetail],
    source: EventSource | Local | Remote,
    `type`: CommentDeleted,
    worksheetId: String
  ): CommentDeletedEventArgs = {
    val __obj = js.Dynamic.literal(commentDetails = commentDetails.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentDeletedEventArgs]
  }
  
  @scala.inline
  implicit class CommentDeletedEventArgsMutableBuilder[Self <: CommentDeletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommentDetails(value: js.Array[CommentDetail]): Self = StObject.set(x, "commentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentDetailsVarargs(value: CommentDetail*): Self = StObject.set(x, "commentDetails", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CommentDeleted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
