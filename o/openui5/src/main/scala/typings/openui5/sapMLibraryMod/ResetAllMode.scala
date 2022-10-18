package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResetAllMode extends StObject
@JSImport("sap/m/library", "ResetAllMode")
@js.native
object ResetAllMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ResetAllMode & String] = js.native
  
  /**
    * Default behavior of the `TablePersoDialog` Reset All button.
    */
  @js.native
  sealed trait Default
    extends StObject
       with ResetAllMode
  /* "Default" */ val Default: typings.openui5.sapMLibraryMod.ResetAllMode.Default & String = js.native
  
  /**
    * Resets the table to the default of the attached `PersoService`.
    */
  @js.native
  sealed trait ServiceDefault
    extends StObject
       with ResetAllMode
  /* "ServiceDefault" */ val ServiceDefault: typings.openui5.sapMLibraryMod.ResetAllMode.ServiceDefault & String = js.native
  
  /**
    * Resets the table to the result of `getResetPersData` of the attached `PersoService`.
    */
  @js.native
  sealed trait ServiceReset
    extends StObject
       with ResetAllMode
  /* "ServiceReset" */ val ServiceReset: typings.openui5.sapMLibraryMod.ResetAllMode.ServiceReset & String = js.native
}
