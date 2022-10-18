package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BarColor extends StObject
@JSImport("sap/ui/core/library", "BarColor")
@js.native
object BarColor extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BarColor & String] = js.native
  
  /**
    * Color: yellow (#faf2b0)
    */
  @js.native
  sealed trait CRITICAL
    extends StObject
       with BarColor
  /* "CRITICAL" */ val CRITICAL: typings.openui5.sapUiCoreLibraryMod.BarColor.CRITICAL & String = js.native
  
  /**
    * Color: red (#ff9a90)
    */
  @js.native
  sealed trait NEGATIVE
    extends StObject
       with BarColor
  /* "NEGATIVE" */ val NEGATIVE: typings.openui5.sapUiCoreLibraryMod.BarColor.NEGATIVE & String = js.native
  
  /**
    * Color: blue (#b8d0e8)
    */
  @js.native
  sealed trait NEUTRAL
    extends StObject
       with BarColor
  /* "NEUTRAL" */ val NEUTRAL: typings.openui5.sapUiCoreLibraryMod.BarColor.NEUTRAL & String = js.native
  
  /**
    * Color: green (#b5e7a8)
    */
  @js.native
  sealed trait POSITIVE
    extends StObject
       with BarColor
  /* "POSITIVE" */ val POSITIVE: typings.openui5.sapUiCoreLibraryMod.BarColor.POSITIVE & String = js.native
}
