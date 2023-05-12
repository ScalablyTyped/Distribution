package typings.photoshop

import typings.photoshop.domPreferencesPreferencesBaseMod.PreferencesBase
import typings.photoshop.photoshopStrings.PreferencesPerformance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domPreferencesPreferencesPerformanceMod {
  
  @JSImport("photoshop/dom/preferences/PreferencesPerformance", "PreferencesPerformance")
  @js.native
  /**
    * @ignore
    */
  open class PreferencesPerformance_ () extends PreferencesBase {
    
    /**
      * Number of cached levels of image data. Used to improve screen redraw and histogram speed.
      * Choose more Cache Levels for bigger documents with few layers; choose fewer Cache Levels for smaller
      * documents with many layers [1,8].
      *
      * *Requires Photoshop restart for changed value to take an effect.*
      *
      * @minVersion 24.0
      */
    def imageCacheLevels: Double = js.native
    def imageCacheLevels_=(value: Double): Unit = js.native
    
    /**
      * Maximum percentage of available RAM used by Photoshop as a whole number [2,99].
      *
      * *Requires Photoshop restart for changed value to take an effect.*
      *
      * @minVersion 24.0
      */
    def maxRAMuse: Double = js.native
    def maxRAMuse_=(value: Double): Unit = js.native
    
    /**
      * The class name of the referenced object: *"PreferencesPerformance"*.
      *
      * @minVersion 24.0
      */
    def typename: PreferencesPerformance = js.native
  }
  
  @JSImport("photoshop/dom/preferences/PreferencesPerformance", "preferencesPerformance")
  @js.native
  val preferencesPerformance: PreferencesPerformance_ = js.native
}
