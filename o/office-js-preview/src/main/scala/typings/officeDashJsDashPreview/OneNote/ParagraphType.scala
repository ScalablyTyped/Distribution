package typings.officeDashJsDashPreview.OneNote

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ParagraphType with String] = js.native
  /* "Image" */ @js.native
  object image extends TopLevel[image with String]
  
  /* "Ink" */ @js.native
  object ink extends TopLevel[ink with String]
  
  /* "Other" */ @js.native
  object other extends TopLevel[other with String]
  
  /* "RichText" */ @js.native
  object richText extends TopLevel[richText with String]
  
  /* "Table" */ @js.native
  object table extends TopLevel[table with String]
  
}

