package typings.photoshop

import typings.photoshop.domConstantsMod.PointType
import typings.photoshop.domConstantsMod.RulerUnits
import typings.photoshop.domConstantsMod.TypeUnits
import typings.photoshop.domPreferencesPreferencesBaseMod.PreferencesBase
import typings.photoshop.photoshopStrings.PreferencesUnitsAndRulers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domPreferencesPreferencesUnitsAndRulersMod {
  
  @JSImport("photoshop/dom/preferences/PreferencesUnitsAndRulers", "PreferencesUnitsAndRulers")
  @js.native
  /**
    * @ignore
    */
  open class PreferencesUnitsAndRulers_ () extends PreferencesBase {
    
    /**
      * The point/pica size
      *
      * @minVersion 24.0
      */
    def pointSize: PointType = js.native
    def pointSize_=(value: PointType): Unit = js.native
    
    /**
      * The unit that will be used for the displayed Rulers and consequently considered primary in Photoshop.
      *
      * @minVersion 24.0
      */
    def rulerUnits: RulerUnits = js.native
    def rulerUnits_=(value: RulerUnits): Unit = js.native
    
    /**
      * The unit type-size that the numeric inputs are assumed to represent.
      *
      * @minVersion 24.0
      */
    def typeUnits: TypeUnits = js.native
    def typeUnits_=(value: TypeUnits): Unit = js.native
    
    /**
      * The class name of the referenced object: *"PreferencesUnitsAndRulers"*.
      *
      * @minVersion 24.0
      */
    def typename: PreferencesUnitsAndRulers = js.native
  }
  
  @JSImport("photoshop/dom/preferences/PreferencesUnitsAndRulers", "preferencesUnitsAndRulers")
  @js.native
  val preferencesUnitsAndRulers: PreferencesUnitsAndRulers_ = js.native
}
