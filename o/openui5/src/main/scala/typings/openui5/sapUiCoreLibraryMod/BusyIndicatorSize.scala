package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BusyIndicatorSize extends StObject
@JSImport("sap/ui/core/library", "BusyIndicatorSize")
@js.native
object BusyIndicatorSize extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BusyIndicatorSize & String] = js.native
  
  /**
    * Type: automatic size detection
    */
  @js.native
  sealed trait Auto
    extends StObject
       with BusyIndicatorSize
  /* "Auto" */ val Auto: typings.openui5.sapUiCoreLibraryMod.BusyIndicatorSize.Auto & String = js.native
  
  /**
    * Type: Large size
    */
  @js.native
  sealed trait Large
    extends StObject
       with BusyIndicatorSize
  /* "Large" */ val Large: typings.openui5.sapUiCoreLibraryMod.BusyIndicatorSize.Large & String = js.native
  
  /**
    * Type: Medium size
    */
  @js.native
  sealed trait Medium
    extends StObject
       with BusyIndicatorSize
  /* "Medium" */ val Medium: typings.openui5.sapUiCoreLibraryMod.BusyIndicatorSize.Medium & String = js.native
  
  /**
    * Type: small size
    */
  @js.native
  sealed trait Small
    extends StObject
       with BusyIndicatorSize
  /* "Small" */ val Small: typings.openui5.sapUiCoreLibraryMod.BusyIndicatorSize.Small & String = js.native
}
