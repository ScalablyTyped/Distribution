package typings.photoshop

import typings.photoshop.domConstantsMod.FontSize
import typings.photoshop.domPreferencesPreferencesBaseMod.PreferencesBase
import typings.photoshop.photoshopStrings.PreferencesInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domPreferencesPreferencesInterfaceMod {
  
  @JSImport("photoshop/dom/preferences/PreferencesInterface", "PreferencesInterface")
  @js.native
  /**
    * @ignore
    */
  open class PreferencesInterface_ () extends PreferencesBase {
    
    /**
      * If true, the Channels palette will display the component channels in their respective colors.
      *
      * @minVersion 24.0
      */
    def colorChannelsInColor: Boolean = js.native
    def colorChannelsInColor_=(enabled: Boolean): Unit = js.native
    
    /**
      * If true, dynamic color sliders appear in the Color palette.
      *
      * @minVersion 24.0
      */
    def dynamicColorSliders: Boolean = js.native
    def dynamicColorSliders_=(enabled: Boolean): Unit = js.native
    
    /**
      * Size of the small font used in panels and dialogs
      *
      * *Requires Photoshop restart for changed value to take an effect.*
      *
      * @minVersion 24.0
      */
    def textFontSize: FontSize = js.native
    def textFontSize_=(value: FontSize): Unit = js.native
    
    /**
      * The class name of the referenced object: *"PreferencesInterface"*.
      *
      * @minVersion 24.0
      */
    def typename: PreferencesInterface = js.native
  }
  
  @JSImport("photoshop/dom/preferences/PreferencesInterface", "preferencesInterface")
  @js.native
  val preferencesInterface: PreferencesInterface_ = js.native
}
