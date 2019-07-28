package typings.officeDashJsDashPreview.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphType extends js.Object

/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.ParagraphType")
@js.native
object ParagraphType extends js.Object {
  @js.native
  sealed trait image extends ParagraphType
  
  @js.native
  sealed trait ink extends ParagraphType
  
  @js.native
  sealed trait other extends ParagraphType
  
  @js.native
  sealed trait richText extends ParagraphType
  
  @js.native
  sealed trait table extends ParagraphType
  
  /* "Image" */ val image: typings.officeDashJsDashPreview.OneNoteNs.ParagraphType.image with String = js.native
  /* "Ink" */ val ink: typings.officeDashJsDashPreview.OneNoteNs.ParagraphType.ink with String = js.native
  /* "Other" */ val other: typings.officeDashJsDashPreview.OneNoteNs.ParagraphType.other with String = js.native
  /* "RichText" */ val richText: typings.officeDashJsDashPreview.OneNoteNs.ParagraphType.richText with String = js.native
  /* "Table" */ val table: typings.officeDashJsDashPreview.OneNoteNs.ParagraphType.table with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ParagraphType with String] = js.native
}

