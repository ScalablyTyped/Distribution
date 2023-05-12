package typings.officeJsPreview.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the type of a raised event.
  *
  * @remarks
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.EventType")
@js.native
object EventType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Word.EventType & String] = js.native
  
  /* "CommentAdded" */ val commentAdded: typings.officeJsPreview.Word.EventType.commentAdded & String = js.native
  
  /* "CommentChanged" */ val commentChanged: typings.officeJsPreview.Word.EventType.commentChanged & String = js.native
  
  /* "CommentDeleted" */ val commentDeleted: typings.officeJsPreview.Word.EventType.commentDeleted & String = js.native
  
  /* "CommentDeselected" */ val commentDeselected: typings.officeJsPreview.Word.EventType.commentDeselected & String = js.native
  
  /* "CommentSelected" */ val commentSelected: typings.officeJsPreview.Word.EventType.commentSelected & String = js.native
  
  /* "ContentControlAdded" */ val contentControlAdded: typings.officeJsPreview.Word.EventType.contentControlAdded & String = js.native
  
  /* "ContentControlDataChanged" */ val contentControlDataChanged: typings.officeJsPreview.Word.EventType.contentControlDataChanged & String = js.native
  
  /* "ContentControlDeleted" */ val contentControlDeleted: typings.officeJsPreview.Word.EventType.contentControlDeleted & String = js.native
  
  /* "ContentControlEntered" */ val contentControlEntered: typings.officeJsPreview.Word.EventType.contentControlEntered & String = js.native
  
  /* "ContentControlExited" */ val contentControlExited: typings.officeJsPreview.Word.EventType.contentControlExited & String = js.native
  
  /* "ContentControlSelectionChanged" */ val contentControlSelectionChanged: typings.officeJsPreview.Word.EventType.contentControlSelectionChanged & String = js.native
}
