package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChangeTrackingMode extends StObject
/**
  * ChangeTracking mode.
  *
  * @remarks
  * [Api set: WordApi 1.4]
  */
@JSGlobal("Word.ChangeTrackingMode")
@js.native
object ChangeTrackingMode extends StObject {
  
  /**
    * ChangeTracking is turned off.
    * @remarks
    * [Api set: WordApi 1.4]
    */
  @js.native
  sealed trait off
    extends StObject
       with ChangeTrackingMode
  
  /**
    * ChangeTracking is turned on for everyone.
    * @remarks
    * [Api set: WordApi 1.4]
    */
  @js.native
  sealed trait trackAll
    extends StObject
       with ChangeTrackingMode
  
  /**
    * Tracking is turned on for my changes only.
    * @remarks
    * [Api set: WordApi 1.4]
    */
  @js.native
  sealed trait trackMineOnly
    extends StObject
       with ChangeTrackingMode
}
