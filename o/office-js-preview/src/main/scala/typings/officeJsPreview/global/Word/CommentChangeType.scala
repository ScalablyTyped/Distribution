package typings.officeJsPreview.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents how the comments in the event were changed.
  *
  * @remarks
  * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Word.CommentChangeType")
@js.native
object CommentChangeType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Word.CommentChangeType & String] = js.native
  
  /* "edited" */ val edited: typings.officeJsPreview.Word.CommentChangeType.edited & String = js.native
  
  /* "none" */ val none: typings.officeJsPreview.Word.CommentChangeType.none & String = js.native
  
  /* "reopened" */ val reopened: typings.officeJsPreview.Word.CommentChangeType.reopened & String = js.native
  
  /* "replyAdded" */ val replyAdded: typings.officeJsPreview.Word.CommentChangeType.replyAdded & String = js.native
  
  /* "replyDeleted" */ val replyDeleted: typings.officeJsPreview.Word.CommentChangeType.replyDeleted & String = js.native
  
  /* "replyEdited" */ val replyEdited: typings.officeJsPreview.Word.CommentChangeType.replyEdited & String = js.native
  
  /* "resolved" */ val resolved: typings.officeJsPreview.Word.CommentChangeType.resolved & String = js.native
}
