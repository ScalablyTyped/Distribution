package typings.officeJs.global.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.ParagraphType")
@js.native
object ParagraphType extends js.Object {
  /* "Image" */ val image: typings.officeJs.OneNote.ParagraphType.image with String = js.native
  /* "Ink" */ val ink: typings.officeJs.OneNote.ParagraphType.ink with String = js.native
  /* "Other" */ val other: typings.officeJs.OneNote.ParagraphType.other with String = js.native
  /* "RichText" */ val richText: typings.officeJs.OneNote.ParagraphType.richText with String = js.native
  /* "Table" */ val table: typings.officeJs.OneNote.ParagraphType.table with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.OneNote.ParagraphType with String] = js.native
}

