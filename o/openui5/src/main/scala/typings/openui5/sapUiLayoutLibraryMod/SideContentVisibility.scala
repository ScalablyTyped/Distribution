package typings.openui5.sapUiLayoutLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SideContentVisibility extends StObject
@JSImport("sap/ui/layout/library", "SideContentVisibility")
@js.native
object SideContentVisibility extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SideContentVisibility & String] = js.native
  
  /**
    * Show the side content on any breakpoint
    */
  @js.native
  sealed trait AlwaysShow
    extends StObject
       with SideContentVisibility
  /* "AlwaysShow" */ val AlwaysShow: typings.openui5.sapUiLayoutLibraryMod.SideContentVisibility.AlwaysShow & String = js.native
  
  /**
    * Don't show the side content on any breakpoints
    */
  @js.native
  sealed trait NeverShow
    extends StObject
       with SideContentVisibility
  /* "NeverShow" */ val NeverShow: typings.openui5.sapUiLayoutLibraryMod.SideContentVisibility.NeverShow & String = js.native
  
  /**
    * Show the side content on XL breakpoint
    */
  @js.native
  sealed trait ShowAboveL
    extends StObject
       with SideContentVisibility
  /* "ShowAboveL" */ val ShowAboveL: typings.openui5.sapUiLayoutLibraryMod.SideContentVisibility.ShowAboveL & String = js.native
  
  /**
    * Show the side content on L and XL breakpoints
    */
  @js.native
  sealed trait ShowAboveM
    extends StObject
       with SideContentVisibility
  /* "ShowAboveM" */ val ShowAboveM: typings.openui5.sapUiLayoutLibraryMod.SideContentVisibility.ShowAboveM & String = js.native
  
  /**
    * Show the side content on M, L and XL breakpoints
    */
  @js.native
  sealed trait ShowAboveS
    extends StObject
       with SideContentVisibility
  /* "ShowAboveS" */ val ShowAboveS: typings.openui5.sapUiLayoutLibraryMod.SideContentVisibility.ShowAboveS & String = js.native
}
