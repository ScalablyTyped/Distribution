package typings.photoshop

import typings.photoshop.domConstantsMod.MaximizeCompatibility
import typings.photoshop.domConstantsMod.SavePreview
import typings.photoshop.domPreferencesPreferencesBaseMod.PreferencesBase
import typings.photoshop.photoshopStrings.PreferencesFileHandling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domPreferencesPreferencesFileHandlingMod {
  
  @JSImport("photoshop/dom/preferences/PreferencesFileHandling", "PreferencesFileHandling")
  @js.native
  /**
    * @ignore
    */
  open class PreferencesFileHandling_ () extends PreferencesBase {
    
    /**
      * If true, asks the user to verify layer preservation options when saving a file in TIFF format.
      *
      * @minVersion 24.0
      */
    def askBeforeSavingLayeredTIFF: Boolean = js.native
    def askBeforeSavingLayeredTIFF_=(enabled: Boolean): Unit = js.native
    
    /**
      * The behavior mode to use when saving files
      *
      * @minVersion 24.0
      */
    def imagePreviews: SavePreview = js.native
    def imagePreviews_=(value: SavePreview): Unit = js.native
    
    /**
      * The behavior to use to check whether to maximize compatibility when opening Adobe Photoshop (PSD) files.
      *
      * @minVersion 24.0
      */
    def maximizeCompatibility: MaximizeCompatibility = js.native
    def maximizeCompatibility_=(value: MaximizeCompatibility): Unit = js.native
    
    /**
      * The maximum number of items in the recent file list [0,100].
      *
      * @minVersion 24.0
      */
    def recentFileListMaximum: Double = js.native
    def recentFileListMaximum_=(value: Double): Unit = js.native
    
    /**
      * The class name of the referenced object: *"PreferencesFileHandling"*.
      *
      * @minVersion 24.0
      */
    def typename: PreferencesFileHandling = js.native
    
    /**
      * If true, the file extension is lowercase
      *
      * @minVersion 24.0
      */
    def useLowerCaseExtension: Boolean = js.native
    def useLowerCaseExtension_=(enabled: Boolean): Unit = js.native
  }
  
  @JSImport("photoshop/dom/preferences/PreferencesFileHandling", "preferencesFileHandling")
  @js.native
  val preferencesFileHandling: PreferencesFileHandling_ = js.native
}
