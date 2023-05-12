package typings.photoshop

import typings.photoshop.domConstantsMod.GridLineStyle
import typings.photoshop.domConstantsMod.GuideLineStyle
import typings.photoshop.domPreferencesPreferencesBaseMod.PreferencesBase
import typings.photoshop.photoshopStrings.PreferencesGuidesGridsAndSlices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domPreferencesPreferencesGuidesGridsAndSlicesMod {
  
  @JSImport("photoshop/dom/preferences/PreferencesGuidesGridsAndSlices", "PreferencesGuidesGridsAndSlices")
  @js.native
  /**
    * @ignore
    */
  open class PreferencesGuidesGridsAndSlices_ () extends PreferencesBase {
    
    /**
      * The formatting style for non-printing grid lines
      *
      * @minVersion 24.0
      */
    def gridStyle: GridLineStyle = js.native
    def gridStyle_=(value: GridLineStyle): Unit = js.native
    
    /**
      * The whole number by which to subdivide the grid [1,100].
      *
      * @minVersion 24.0
      */
    def gridSubDivisions: Double = js.native
    def gridSubDivisions_=(value: Double): Unit = js.native
    
    /**
      * The formatting style for non-printing guide lines.
      *
      * @minVersion 24.0
      */
    def guideStyle: GuideLineStyle = js.native
    def guideStyle_=(value: GuideLineStyle): Unit = js.native
    
    /**
      * If true, displays slice numbers in the document window when using the Slice tool.
      *
      * @minVersion 24.0
      */
    def showSliceNumber: Boolean = js.native
    def showSliceNumber_=(enabled: Boolean): Unit = js.native
    
    /**
      * The class name of the referenced object: *"PreferencesGuidesGridsAndSlices"*.
      *
      * @minVersion 24.0
      */
    def typename: PreferencesGuidesGridsAndSlices = js.native
  }
  
  @JSImport("photoshop/dom/preferences/PreferencesGuidesGridsAndSlices", "preferencesGuidesGridsAndSlices")
  @js.native
  val preferencesGuidesGridsAndSlices: PreferencesGuidesGridsAndSlices_ = js.native
}
