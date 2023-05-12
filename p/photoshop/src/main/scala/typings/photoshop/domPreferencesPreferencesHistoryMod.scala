package typings.photoshop

import typings.photoshop.domConstantsMod.EditLogItemsType
import typings.photoshop.domConstantsMod.SaveLogItemsType
import typings.photoshop.domPreferencesPreferencesBaseMod.PreferencesBase
import typings.photoshop.photoshopStrings.PreferencesHistory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domPreferencesPreferencesHistoryMod {
  
  @JSImport("photoshop/dom/preferences/PreferencesHistory", "PreferencesHistory")
  @js.native
  /**
    * @ignore
    */
  open class PreferencesHistory_ () extends PreferencesBase {
    
    /**
      * If true, automatically makes the first snapshot when a new document is created
      *
      * @minVersion 24.0
      */
    def createFirstSnapshot: Boolean = js.native
    def createFirstSnapshot_=(enabled: Boolean): Unit = js.native
    
    /**
      * Options for edit log items.
      *
      * Sets `history.useHistoryLog = true` as side effect.
      *
      * @minVersion 24.0
      */
    def editLogItems: EditLogItemsType = js.native
    def editLogItems_=(value: EditLogItemsType): Unit = js.native
    
    /**
      * If true, allows non-linear history
      *
      * @minVersion 24.0
      */
    def nonLinearHistory: Boolean = js.native
    def nonLinearHistory_=(enabled: Boolean): Unit = js.native
    
    /**
      * The whole number of history states to preserve [1,1000].
      *
      * @minVersion 24.0
      */
    def numberOfHistoryStates: Double = js.native
    def numberOfHistoryStates_=(value: Double): Unit = js.native
    
    /**
      * Options for saving the history items. It can be metadata, file or both.
      *
      * Sets `history.useHistoryLog = true` as side effect.
      *
      * @minVersion 24.0
      */
    def saveLogItems: SaveLogItemsType = js.native
    def saveLogItems_=(value: SaveLogItemsType): Unit = js.native
    
    /**
      * The class name of the referenced object: *"PreferencesHistory"*.
      *
      * @minVersion 24.0
      */
    def typename: PreferencesHistory = js.native
    
    /**
      * Turn on and off the history logging
      *
      * @minVersion 24.0
      */
    def useHistoryLog: Boolean = js.native
    def useHistoryLog_=(enabled: Boolean): Unit = js.native
  }
  
  @JSImport("photoshop/dom/preferences/PreferencesHistory", "preferencesHistory")
  @js.native
  val preferencesHistory: PreferencesHistory_ = js.native
}
