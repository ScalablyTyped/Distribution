package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NoteItemType extends StObject
/**
  * Note item type
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
@JSGlobal("Word.NoteItemType")
@js.native
object NoteItemType extends StObject {
  
  /**
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait endnote
    extends StObject
       with NoteItemType
  
  /**
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait footnote
    extends StObject
       with NoteItemType
}
