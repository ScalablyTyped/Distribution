package typings.officeJs.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
/**
  * @remarks
  * [Api set: OneNoteApi 1.9]
  */
@JSGlobal("OneNote.EventType")
@js.native
object EventType extends StObject {
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.9]
    */
  @js.native
  sealed trait alterationSelected
    extends StObject
       with EventType
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.9]
    */
  @js.native
  sealed trait inkSelectedForCorrection
    extends StObject
       with EventType
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.9]
    */
  @js.native
  sealed trait reset
    extends StObject
       with EventType
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.9]
    */
  @js.native
  sealed trait restrictionsCalculated
    extends StObject
       with EventType
}
