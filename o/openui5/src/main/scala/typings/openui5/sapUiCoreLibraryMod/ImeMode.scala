package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImeMode extends StObject
@JSImport("sap/ui/core/library", "ImeMode")
@js.native
object ImeMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ImeMode & String] = js.native
  
  /**
    * IME is used for entering characters.
    */
  @js.native
  sealed trait Active
    extends StObject
       with ImeMode
  /* "Active" */ val Active: typings.openui5.sapUiCoreLibraryMod.ImeMode.Active & String = js.native
  
  /**
    * The value is automatically computed by the user agent.
    */
  @js.native
  sealed trait Auto
    extends StObject
       with ImeMode
  /* "Auto" */ val Auto: typings.openui5.sapUiCoreLibraryMod.ImeMode.Auto & String = js.native
  
  /**
    * IME is disabled.
    */
  @js.native
  sealed trait Disabled
    extends StObject
       with ImeMode
  /* "Disabled" */ val Disabled: typings.openui5.sapUiCoreLibraryMod.ImeMode.Disabled & String = js.native
  
  /**
    * IME is not used for entering characters.
    */
  @js.native
  sealed trait Inactive
    extends StObject
       with ImeMode
  /* "Inactive" */ val Inactive: typings.openui5.sapUiCoreLibraryMod.ImeMode.Inactive & String = js.native
}
