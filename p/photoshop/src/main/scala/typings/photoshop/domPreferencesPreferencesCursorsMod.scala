package typings.photoshop

import typings.photoshop.domConstantsMod.OtherCursors
import typings.photoshop.domConstantsMod.PaintingCursors
import typings.photoshop.domPreferencesPreferencesBaseMod.PreferencesBase
import typings.photoshop.photoshopStrings.PreferencesCursors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domPreferencesPreferencesCursorsMod {
  
  @JSImport("photoshop/dom/preferences/PreferencesCursors", "PreferencesCursors")
  @js.native
  /**
    * @ignore
    */
  open class PreferencesCursors_ () extends PreferencesBase {
    
    /**
      * The type of pointer to use
      *
      * @minVersion 24.0
      */
    def otherCursors: OtherCursors = js.native
    def otherCursors_=(value: OtherCursors): Unit = js.native
    
    /**
      * The style of cursor in use for painting tools.
      *
      * @minVersion 24.0
      */
    def paintingCursors: PaintingCursors = js.native
    def paintingCursors_=(value: PaintingCursors): Unit = js.native
    
    /**
      * The class name of the referenced object: *"PreferencesCursors"*.
      *
      * @minVersion 24.0
      */
    def typename: PreferencesCursors = js.native
  }
  
  @JSImport("photoshop/dom/preferences/PreferencesCursors", "preferencesCursors")
  @js.native
  val preferencesCursors: PreferencesCursors_ = js.native
}
