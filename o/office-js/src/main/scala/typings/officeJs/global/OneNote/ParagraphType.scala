package typings.officeJs.global.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.ParagraphType")
@js.native
object ParagraphType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.OneNote.ParagraphType & String] = js.native
  
  /* "Image" */ val image: typings.officeJs.OneNote.ParagraphType.image & String = js.native
  
  /* "Ink" */ val ink: typings.officeJs.OneNote.ParagraphType.ink & String = js.native
  
  /* "Other" */ val other: typings.officeJs.OneNote.ParagraphType.other & String = js.native
  
  /* "RichText" */ val richText: typings.officeJs.OneNote.ParagraphType.richText & String = js.native
  
  /* "Table" */ val table: typings.officeJs.OneNote.ParagraphType.table & String = js.native
}
