package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueState extends StObject
@JSImport("sap/ui/core/library", "ValueState")
@js.native
object ValueState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValueState & String] = js.native
  
  /**
    * State is not valid.
    */
  @js.native
  sealed trait Error
    extends StObject
       with ValueState
  /* "Error" */ val Error: typings.openui5.sapUiCoreLibraryMod.ValueState.Error & String = js.native
  
  /**
    * @since 1.61
    *
    * State is informative.
    */
  @js.native
  sealed trait Information
    extends StObject
       with ValueState
  /* "Information" */ val Information: typings.openui5.sapUiCoreLibraryMod.ValueState.Information & String = js.native
  
  /**
    * State is not specified.
    */
  @js.native
  sealed trait None
    extends StObject
       with ValueState
  /* "None" */ val None: typings.openui5.sapUiCoreLibraryMod.ValueState.None & String = js.native
  
  /**
    * State is valid.
    */
  @js.native
  sealed trait Success
    extends StObject
       with ValueState
  /* "Success" */ val Success: typings.openui5.sapUiCoreLibraryMod.ValueState.Success & String = js.native
  
  /**
    * State is valid but with a warning.
    */
  @js.native
  sealed trait Warning
    extends StObject
       with ValueState
  /* "Warning" */ val Warning: typings.openui5.sapUiCoreLibraryMod.ValueState.Warning & String = js.native
}
