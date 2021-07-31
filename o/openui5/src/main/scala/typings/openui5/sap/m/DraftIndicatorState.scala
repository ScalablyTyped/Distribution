package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DraftIndicatorState extends StObject
/**
  * Enum for the state of sap.m.DraftIndicator control.
  */
@JSGlobal("sap.m.DraftIndicatorState")
@js.native
object DraftIndicatorState extends StObject {
  
  @js.native
  sealed trait Clear
    extends StObject
       with DraftIndicatorState
  
  @js.native
  sealed trait Saved
    extends StObject
       with DraftIndicatorState
  
  @js.native
  sealed trait Saving
    extends StObject
       with DraftIndicatorState
}
