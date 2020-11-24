package typings.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents how the comments in the event were changed.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.CommentChangeType")
@js.native
object CommentChangeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.CommentChangeType with String] = js.native
  
  /* "CommentEdited" */ val commentEdited: typings.officeJsPreview.Excel.CommentChangeType.commentEdited with String = js.native
  
  /* "CommentReopened" */ val commentReopened: typings.officeJsPreview.Excel.CommentChangeType.commentReopened with String = js.native
  
  /* "CommentResolved" */ val commentResolved: typings.officeJsPreview.Excel.CommentChangeType.commentResolved with String = js.native
  
  /* "ReplyAdded" */ val replyAdded: typings.officeJsPreview.Excel.CommentChangeType.replyAdded with String = js.native
  
  /* "ReplyDeleted" */ val replyDeleted: typings.officeJsPreview.Excel.CommentChangeType.replyDeleted with String = js.native
  
  /* "ReplyEdited" */ val replyEdited: typings.officeJsPreview.Excel.CommentChangeType.replyEdited with String = js.native
}
