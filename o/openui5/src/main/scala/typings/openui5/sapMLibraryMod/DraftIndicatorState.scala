package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DraftIndicatorState extends StObject
@JSImport("sap/m/library", "DraftIndicatorState")
@js.native
object DraftIndicatorState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DraftIndicatorState & String] = js.native
  
  /**
    * This is the default value for DraftIndicatorState type. This state has no visual information displayed.
    */
  @js.native
  sealed trait Clear
    extends StObject
       with DraftIndicatorState
  /* "Clear" */ val Clear: typings.openui5.sapMLibraryMod.DraftIndicatorState.Clear & String = js.native
  
  /**
    * Indicates that the draft is already saved
    */
  @js.native
  sealed trait Saved
    extends StObject
       with DraftIndicatorState
  /* "Saved" */ val Saved: typings.openui5.sapMLibraryMod.DraftIndicatorState.Saved & String = js.native
  
  /**
    * Indicates that the draft currently is being saved
    */
  @js.native
  sealed trait Saving
    extends StObject
       with DraftIndicatorState
  /* "Saving" */ val Saving: typings.openui5.sapMLibraryMod.DraftIndicatorState.Saving & String = js.native
}
