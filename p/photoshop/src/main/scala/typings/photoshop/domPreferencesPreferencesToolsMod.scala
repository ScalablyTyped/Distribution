package typings.photoshop

import typings.photoshop.domPreferencesPreferencesBaseMod.PreferencesBase
import typings.photoshop.photoshopStrings.PreferencesTools
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domPreferencesPreferencesToolsMod {
  
  @JSImport("photoshop/dom/preferences/PreferencesTools", "PreferencesTools")
  @js.native
  /**
    * @ignore
    */
  open class PreferencesTools_ () extends PreferencesBase {
    
    /**
      * If true, automatically resizes the window when zooming in or out using keyboard shortcuts.
      *
      * @minVersion 24.0
      */
    def keyboardZoomResizesWindows: Boolean = js.native
    def keyboardZoomResizesWindows_=(enabled: Boolean): Unit = js.native
    
    /**
      * If true, pop-up definitions or descriptions are displayed on mouseover.
      *
      * @minVersion 24.0
      */
    def showToolTips: Boolean = js.native
    def showToolTips_=(enabled: Boolean): Unit = js.native
    
    /**
      * The class name of the referenced object: *"PreferencesTools"*.
      *
      * @minVersion 24.0
      */
    def typename: PreferencesTools = js.native
    
    /**
      * Determines whether to enable the shift key as a modifier to the keyboard shortcut
      * for switching between grouped tools.
      *
      * @minVersion 24.0
      */
    def useShiftKeyForToolSwitch: Boolean = js.native
    def useShiftKeyForToolSwitch_=(enabled: Boolean): Unit = js.native
  }
  
  @JSImport("photoshop/dom/preferences/PreferencesTools", "preferencesTools")
  @js.native
  val preferencesTools: PreferencesTools_ = js.native
}
