package typings.officeJs.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Note item type
  *
  * @remarks
  * [Api set: WordApiOnline 1.1]
  */
@JSGlobal("Word.NoteItemType")
@js.native
object NoteItemType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Word.NoteItemType & String] = js.native
  
  /* "Endnote" */ val endnote: typings.officeJs.Word.NoteItemType.endnote & String = js.native
  
  /* "Footnote" */ val footnote: typings.officeJs.Word.NoteItemType.footnote & String = js.native
}
