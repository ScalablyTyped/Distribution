package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SplitAppMode extends StObject
@JSImport("sap/m/library", "SplitAppMode")
@js.native
object SplitAppMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SplitAppMode & String] = js.native
  
  /**
    * Master area is hidden initially both in portrait and landscape.
    *
    * Master area can be opened by clicking on the top left corner button or swiping right. Swipe is only enabled
    * on mobile devices. Master will keep the open state when changing the orientation of the device.
    */
  @js.native
  sealed trait HideMode
    extends StObject
       with SplitAppMode
  /* "HideMode" */ val HideMode: typings.openui5.sapMLibraryMod.SplitAppMode.HideMode & String = js.native
  
  /**
    * Master will be shown inside a Popover when in portrait mode
    */
  @js.native
  sealed trait PopoverMode
    extends StObject
       with SplitAppMode
  /* "PopoverMode" */ val PopoverMode: typings.openui5.sapMLibraryMod.SplitAppMode.PopoverMode & String = js.native
  
  /**
    * Master will automatically be hidden in portrait mode.
    */
  @js.native
  sealed trait ShowHideMode
    extends StObject
       with SplitAppMode
  /* "ShowHideMode" */ val ShowHideMode: typings.openui5.sapMLibraryMod.SplitAppMode.ShowHideMode & String = js.native
  
  /**
    * Master will always be shown but in a compressed version when in portrait mode.
    */
  @js.native
  sealed trait StretchCompressMode
    extends StObject
       with SplitAppMode
  /* "StretchCompressMode" */ val StretchCompressMode: typings.openui5.sapMLibraryMod.SplitAppMode.StretchCompressMode & String = js.native
}
