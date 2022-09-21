package typings.officeJsPreview.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParagraphType extends StObject
/**
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.ParagraphType")
@js.native
object ParagraphType extends StObject {
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  @js.native
  sealed trait image
    extends StObject
       with ParagraphType
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  @js.native
  sealed trait ink
    extends StObject
       with ParagraphType
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  @js.native
  sealed trait other
    extends StObject
       with ParagraphType
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  @js.native
  sealed trait richText
    extends StObject
       with ParagraphType
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  @js.native
  sealed trait table
    extends StObject
       with ParagraphType
}
