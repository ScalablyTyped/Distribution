package typings.officeJsPreview.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PageContentType extends StObject
/**
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.PageContentType")
@js.native
object PageContentType extends StObject {
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  @js.native
  sealed trait image
    extends StObject
       with PageContentType
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  @js.native
  sealed trait ink
    extends StObject
       with PageContentType
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  @js.native
  sealed trait other
    extends StObject
       with PageContentType
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  @js.native
  sealed trait outline
    extends StObject
       with PageContentType
}
