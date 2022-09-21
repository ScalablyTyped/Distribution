package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents how the comments in the event were changed.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.CommentChangeType")
@js.native
object CommentChangeType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.CommentChangeType & String] = js.native
  
  /* "CommentEdited" */ val commentEdited: typings.officeJsPreview.Excel.CommentChangeType.commentEdited & String = js.native
  
  /* "CommentReopened" */ val commentReopened: typings.officeJsPreview.Excel.CommentChangeType.commentReopened & String = js.native
  
  /* "CommentResolved" */ val commentResolved: typings.officeJsPreview.Excel.CommentChangeType.commentResolved & String = js.native
  
  /* "ReplyAdded" */ val replyAdded: typings.officeJsPreview.Excel.CommentChangeType.replyAdded & String = js.native
  
  /* "ReplyDeleted" */ val replyDeleted: typings.officeJsPreview.Excel.CommentChangeType.replyDeleted & String = js.native
  
  /* "ReplyEdited" */ val replyEdited: typings.officeJsPreview.Excel.CommentChangeType.replyEdited & String = js.native
}
