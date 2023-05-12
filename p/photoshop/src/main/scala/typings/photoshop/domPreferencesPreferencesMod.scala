package typings.photoshop

import typings.photoshop.domPreferencesPreferencesCursorsMod.PreferencesCursors_
import typings.photoshop.domPreferencesPreferencesFileHandlingMod.PreferencesFileHandling_
import typings.photoshop.domPreferencesPreferencesGeneralMod.PreferencesGeneral_
import typings.photoshop.domPreferencesPreferencesGuidesGridsAndSlicesMod.PreferencesGuidesGridsAndSlices_
import typings.photoshop.domPreferencesPreferencesHistoryMod.PreferencesHistory_
import typings.photoshop.domPreferencesPreferencesInterfaceMod.PreferencesInterface_
import typings.photoshop.domPreferencesPreferencesPerformanceMod.PreferencesPerformance_
import typings.photoshop.domPreferencesPreferencesToolsMod.PreferencesTools_
import typings.photoshop.domPreferencesPreferencesTransparencyAndGamutMod.PreferencesTransparencyAndGamut_
import typings.photoshop.domPreferencesPreferencesTypeMod.PreferencesType_
import typings.photoshop.domPreferencesPreferencesUnitsAndRulersMod.PreferencesUnitsAndRulers_
import typings.photoshop.photoshopStrings.Preferences
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domPreferencesPreferencesMod {
  
  @JSImport("photoshop/dom/preferences/Preferences", "Preferences")
  @js.native
  /**
    * @ignore
    */
  open class Preferences_ () extends StObject {
    
    /**
      * Options for size and style of tool cursors.
      *
      * @minVersion 24.0
      */
    def cursors: PreferencesCursors_ = js.native
    
    /**
      * File handling preferences. Mostly about file saving options, file compatibility and recent files.
      *
      * @minVersion 24.0
      */
    def fileHandling: PreferencesFileHandling_ = js.native
    
    /**
      * General preferences.
      *
      * @minVersion 24.0
      */
    def general: PreferencesGeneral_ = js.native
    
    /**
      * Presentation options for guides, grid, slices, paths, and other on-canvas controls.
      *
      * @minVersion 24.0
      */
    def guidesGridsAndSlices: PreferencesGuidesGridsAndSlices_ = js.native
    
    /**
      * All preferences related to history logging.
      *
      * @minVersion 24.0
      */
    def history: PreferencesHistory_ = js.native
    
    /**
      * User interface preferences.
      *
      * @minVersion 24.0
      */
    def interface: PreferencesInterface_ = js.native
    
    /**
      * Options that could affect the speed of Photoshop performance including GPU usage.
      *
      * @minVersion 24.0
      */
    def performance: PreferencesPerformance_ = js.native
    
    /**
      * Tools preferences.
      *
      * @minVersion 24.0
      */
    def tools: PreferencesTools_ = js.native
    
    /**
      * Controls for how transparency will be shown and what color to use for the out-of-gamut warning.
      *
      * @minVersion 24.0
      */
    def transparencyAndGamut: PreferencesTransparencyAndGamut_ = js.native
    
    /**
      * Preferences related to type.
      *
      * @minVersion 24.0
      */
    def `type`: PreferencesType_ = js.native
    
    /**
      * The class name of the referenced object: *"Preferences"*.
      * @minVersion 24.0
      */
    def typename: Preferences = js.native
    
    /**
      * Preferences related to ruler units, type units and resolution.
      *
      * @minVersion 24.0
      */
    def unitsAndRulers: PreferencesUnitsAndRulers_ = js.native
  }
  
  @JSImport("photoshop/dom/preferences/Preferences", "preferences")
  @js.native
  val preferences: Preferences_ = js.native
}
