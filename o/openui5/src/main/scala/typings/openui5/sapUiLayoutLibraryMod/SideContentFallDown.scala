package typings.openui5.sapUiLayoutLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SideContentFallDown extends StObject
@JSImport("sap/ui/layout/library", "SideContentFallDown")
@js.native
object SideContentFallDown extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SideContentFallDown & String] = js.native
  
  /**
    * Side content falls down on breakpoints below L
    */
  @js.native
  sealed trait BelowL
    extends StObject
       with SideContentFallDown
  /* "BelowL" */ val BelowL: typings.openui5.sapUiLayoutLibraryMod.SideContentFallDown.BelowL & String = js.native
  
  /**
    * Side content falls down on breakpoints below M
    */
  @js.native
  sealed trait BelowM
    extends StObject
       with SideContentFallDown
  /* "BelowM" */ val BelowM: typings.openui5.sapUiLayoutLibraryMod.SideContentFallDown.BelowM & String = js.native
  
  /**
    * Side content falls down on breakpoints below XL
    */
  @js.native
  sealed trait BelowXL
    extends StObject
       with SideContentFallDown
  /* "BelowXL" */ val BelowXL: typings.openui5.sapUiLayoutLibraryMod.SideContentFallDown.BelowXL & String = js.native
  
  /**
    * Side content falls down on breakpoint M and the minimum width for the side content
    */
  @js.native
  sealed trait OnMinimumWidth
    extends StObject
       with SideContentFallDown
  /* "OnMinimumWidth" */ val OnMinimumWidth: typings.openui5.sapUiLayoutLibraryMod.SideContentFallDown.OnMinimumWidth & String = js.native
}
