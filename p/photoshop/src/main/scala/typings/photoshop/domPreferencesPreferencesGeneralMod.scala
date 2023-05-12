package typings.photoshop

import typings.photoshop.domConstantsMod.InterpolationMethod
import typings.photoshop.domPreferencesPreferencesBaseMod.PreferencesBase
import typings.photoshop.photoshopStrings.PreferencesGeneral
import typings.photoshop.photoshopStrings.photoshopPicker
import typings.photoshop.photoshopStrings.pluginPicker
import typings.photoshop.photoshopStrings.systemPicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domPreferencesPreferencesGeneralMod {
  
  @JSImport("photoshop/dom/preferences/PreferencesGeneral", "PreferencesGeneral")
  @js.native
  /**
    * @ignore
    */
  open class PreferencesGeneral_ () extends PreferencesBase {
    
    /**
      * Determines whether to automatically re-read open file-based documents updated outside Photoshop.
      * Cloud documents are not affected by this setting.'
      *
      * @minVersion 24.0
      */
    def autoUpdateOpenDocuments: Boolean = js.native
    def autoUpdateOpenDocuments_=(enabled: Boolean): Unit = js.native
    
    /**
      * If true, alerts the user when a command completes
      *
      * @minVersion 24.0
      */
    def beepWhenDone: Boolean = js.native
    def beepWhenDone_=(enabled: Boolean): Unit = js.native
    
    def colorPicker: ColorPickerOption = js.native
    /**
      * Changes color picker within the Photoshop. It uses object where `type` property is color picker type to use.
      * If color picker type is `ColorPicker.PLUGIN` then also `pluginID` property must be provided
      * and must contain internal ID of the plugin as a string.
      *
      * @minVersion 24.0
      */
    def colorPicker_=(colorPickerArg: ColorPickerOption): Unit = js.native
    
    /**
      * If true, retains Adobe Photoshop contents on the clipboard after you exit the application.
      *
      * @minVersion 24.0
      */
    def exportClipboard: Boolean = js.native
    def exportClipboard_=(enabled: Boolean): Unit = js.native
    
    /**
      * Method used when scaling or resizing images.
      *
      * @minVersion 24.0
      */
    def imageInterpolation: InterpolationMethod = js.native
    def imageInterpolation_=(method: InterpolationMethod): Unit = js.native
    
    /**
      * The class name of the referenced object: *"PreferencesGeneral"*.
      *
      * @minVersion 24.0
      */
    def typename: PreferencesGeneral = js.native
  }
  
  @JSImport("photoshop/dom/preferences/PreferencesGeneral", "preferencesGeneral")
  @js.native
  val preferencesGeneral: PreferencesGeneral_ = js.native
  
  trait ColorPickerOption extends StObject {
    
    /**
      * @minVersion 24.0
      */
    var pluginID: js.UndefOr[String] = js.undefined
    
    /**
      * @minVersion 24.0
      */
    var `type`: photoshopPicker | systemPicker | pluginPicker
  }
  object ColorPickerOption {
    
    inline def apply(`type`: photoshopPicker | systemPicker | pluginPicker): ColorPickerOption = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorPickerOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorPickerOption] (val x: Self) extends AnyVal {
      
      inline def setPluginID(value: String): Self = StObject.set(x, "pluginID", value.asInstanceOf[js.Any])
      
      inline def setPluginIDUndefined: Self = StObject.set(x, "pluginID", js.undefined)
      
      inline def setType(value: photoshopPicker | systemPicker | pluginPicker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
