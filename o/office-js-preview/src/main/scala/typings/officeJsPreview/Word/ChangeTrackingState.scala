package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChangeTrackingState extends StObject
/**
  * Specify the track state when ChangeTracking is on.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
@JSGlobal("Word.ChangeTrackingState")
@js.native
object ChangeTrackingState extends StObject {
  
  /**
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait added
    extends StObject
       with ChangeTrackingState
  
  /**
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait deleted
    extends StObject
       with ChangeTrackingState
  
  /**
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait normal
    extends StObject
       with ChangeTrackingState
  
  /**
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with ChangeTrackingState
}
