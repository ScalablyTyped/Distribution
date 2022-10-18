package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedColorPickerDisplayModeMod {
  
  /**
    * @SINCE 1.58.0
    *
    * Types of a color picker display mode
    */
  @JSImport("sap/ui/unified/ColorPickerDisplayMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ColorPickerDisplayMode & String] = js.native
    
    /* "Default" */ val Default: typings.openui5.sapUiUnifiedColorPickerDisplayModeMod.ColorPickerDisplayMode.Default & String = js.native
    
    /* "Large" */ val Large: typings.openui5.sapUiUnifiedColorPickerDisplayModeMod.ColorPickerDisplayMode.Large & String = js.native
    
    /* "Simplified" */ val Simplified: typings.openui5.sapUiUnifiedColorPickerDisplayModeMod.ColorPickerDisplayMode.Simplified & String = js.native
  }
  
  @js.native
  sealed trait ColorPickerDisplayMode extends StObject
  /**
    * @SINCE 1.58.0
    *
    * Types of a color picker display mode
    */
  @JSImport("sap/ui/unified/ColorPickerDisplayMode", "ColorPickerDisplayMode")
  @js.native
  object ColorPickerDisplayMode extends StObject {
    
    /**
      * Default display mode.
      */
    @js.native
    sealed trait Default
      extends StObject
         with ColorPickerDisplayMode
    
    /**
      * Large display mode.
      */
    @js.native
    sealed trait Large
      extends StObject
         with ColorPickerDisplayMode
    
    /**
      * Simplified display mode.
      */
    @js.native
    sealed trait Simplified
      extends StObject
         with ColorPickerDisplayMode
  }
}
