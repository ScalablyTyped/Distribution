package typings.openui5.sapUiUnifiedLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorPickerMode extends StObject
@JSImport("sap/ui/unified/library", "ColorPickerMode")
@js.native
object ColorPickerMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ColorPickerMode & String] = js.native
  
  /**
    * Color picker works with HSL values.
    */
  @js.native
  sealed trait HSL
    extends StObject
       with ColorPickerMode
  /* "HSL" */ val HSL: typings.openui5.sapUiUnifiedLibraryMod.ColorPickerMode.HSL & String = js.native
  
  /**
    * Color picker works with HSV values.
    */
  @js.native
  sealed trait HSV
    extends StObject
       with ColorPickerMode
  /* "HSV" */ val HSV: typings.openui5.sapUiUnifiedLibraryMod.ColorPickerMode.HSV & String = js.native
}
