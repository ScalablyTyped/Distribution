package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait P13nPopupMode extends StObject
@JSImport("sap/m/library", "P13nPopupMode")
@js.native
object P13nPopupMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[P13nPopupMode & String] = js.native
  
  /**
    * Dialog type as popup type.
    */
  @js.native
  sealed trait Dialog
    extends StObject
       with P13nPopupMode
  /* "Dialog" */ val Dialog: typings.openui5.sapMLibraryMod.P13nPopupMode.Dialog & String = js.native
  
  /**
    * ResponsivePopover type as popup type.
    */
  @js.native
  sealed trait ResponsivePopover
    extends StObject
       with P13nPopupMode
  /* "ResponsivePopover" */ val ResponsivePopover: typings.openui5.sapMLibraryMod.P13nPopupMode.ResponsivePopover & String = js.native
}
