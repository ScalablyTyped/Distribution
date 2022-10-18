package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BusyIndicatorSize extends StObject
@JSImport("sap/ui/webc/main/library", "BusyIndicatorSize")
@js.native
object BusyIndicatorSize extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BusyIndicatorSize & String] = js.native
  
  /**
    * large size
    */
  @js.native
  sealed trait Large
    extends StObject
       with BusyIndicatorSize
  /* "Large" */ val Large: typings.openui5.sapUiWebcMainLibraryMod.BusyIndicatorSize.Large & String = js.native
  
  /**
    * medium size
    */
  @js.native
  sealed trait Medium
    extends StObject
       with BusyIndicatorSize
  /* "Medium" */ val Medium: typings.openui5.sapUiWebcMainLibraryMod.BusyIndicatorSize.Medium & String = js.native
  
  /**
    * small size
    */
  @js.native
  sealed trait Small
    extends StObject
       with BusyIndicatorSize
  /* "Small" */ val Small: typings.openui5.sapUiWebcMainLibraryMod.BusyIndicatorSize.Small & String = js.native
}
