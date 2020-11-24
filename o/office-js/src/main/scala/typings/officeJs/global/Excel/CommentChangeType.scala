package typings.officeJs.global.Excel

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
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.CommentChangeType with String] = js.native
  
  /* "CommentEdited" */ val commentEdited: typings.officeJs.Excel.CommentChangeType.commentEdited with String = js.native
  
  /* "CommentReopened" */ val commentReopened: typings.officeJs.Excel.CommentChangeType.commentReopened with String = js.native
  
  /* "CommentResolved" */ val commentResolved: typings.officeJs.Excel.CommentChangeType.commentResolved with String = js.native
  
  /* "ReplyAdded" */ val replyAdded: typings.officeJs.Excel.CommentChangeType.replyAdded with String = js.native
  
  /* "ReplyDeleted" */ val replyDeleted: typings.officeJs.Excel.CommentChangeType.replyDeleted with String = js.native
  
  /* "ReplyEdited" */ val replyEdited: typings.officeJs.Excel.CommentChangeType.replyEdited with String = js.native
}
