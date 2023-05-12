package typings.photoshop

import typings.photoshop.domConstantsMod.TypeInterfaceFeatures
import typings.photoshop.domPreferencesPreferencesBaseMod.PreferencesBase
import typings.photoshop.photoshopStrings.PreferencesType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domPreferencesPreferencesTypeMod {
  
  @JSImport("photoshop/dom/preferences/PreferencesType", "PreferencesType")
  @js.native
  /**
    * @ignore
    */
  open class PreferencesType_ () extends PreferencesBase {
    
    /**
      * If true, all font names are listed in English
      *
      * @minVersion 24.0
      */
    def showEnglishFontNames: Boolean = js.native
    def showEnglishFontNames_=(enabled: Boolean): Unit = js.native
    
    /**
      * Change user interface of Character and Paragraph panels and shows additional text options
      *
      * @minVersion 24.0
      */
    def showTextFeatures: TypeInterfaceFeatures = js.native
    def showTextFeatures_=(features: TypeInterfaceFeatures): Unit = js.native
    
    /**
      * Determines whether to substitute left and right quotation marks automatically while typing in the Type Tool.
      *
      * @minVersion 24.0
      */
    def smartQuotes: Boolean = js.native
    def smartQuotes_=(enabled: Boolean): Unit = js.native
    
    /**
      * The class name of the referenced object: *"PreferencesType"*.
      *
      * @minVersion 24.0
      */
    def typename: PreferencesType = js.native
  }
  
  @JSImport("photoshop/dom/preferences/PreferencesType", "preferencesType")
  @js.native
  val preferencesType: PreferencesType_ = js.native
}
