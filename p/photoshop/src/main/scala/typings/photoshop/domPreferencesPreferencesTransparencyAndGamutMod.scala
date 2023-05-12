package typings.photoshop

import typings.photoshop.domConstantsMod.GridSize
import typings.photoshop.domPreferencesPreferencesBaseMod.PreferencesBase
import typings.photoshop.photoshopStrings.PreferencesTransparencyAndGamut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domPreferencesPreferencesTransparencyAndGamutMod {
  
  @JSImport("photoshop/dom/preferences/PreferencesTransparencyAndGamut", "PreferencesTransparencyAndGamut")
  @js.native
  /**
    * @ignore
    */
  open class PreferencesTransparencyAndGamut_ () extends PreferencesBase {
    
    /**
      * The opacity as a float number representing the percentage
      * of the warning color for out-of-gamut colors [1,100].
      *
      * @minVersion 24.0
      */
    def gamutWarningOpacity: Double = js.native
    def gamutWarningOpacity_=(value: Double): Unit = js.native
    
    /**
      * The size of grid squares used to construct the transparency pattern
      *
      * @minVersion 24.0
      */
    def gridSize: GridSize = js.native
    def gridSize_=(value: GridSize): Unit = js.native
    
    /**
      * The class name of the referenced object: *"PreferencesTransparencyAndGamut"*.
      *
      * @minVersion 24.0
      */
    def typename: PreferencesTransparencyAndGamut = js.native
  }
  
  @JSImport("photoshop/dom/preferences/PreferencesTransparencyAndGamut", "preferencesTransparencyAndGamut")
  @js.native
  val preferencesTransparencyAndGamut: PreferencesTransparencyAndGamut_ = js.native
}
