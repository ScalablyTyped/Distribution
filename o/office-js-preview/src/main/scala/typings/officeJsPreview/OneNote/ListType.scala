package typings.officeJsPreview.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListType extends StObject
/**
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.ListType")
@js.native
object ListType extends StObject {
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  @js.native
  sealed trait bullet
    extends StObject
       with ListType
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  @js.native
  sealed trait none
    extends StObject
       with ListType
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  @js.native
  sealed trait number
    extends StObject
       with ListType
}
