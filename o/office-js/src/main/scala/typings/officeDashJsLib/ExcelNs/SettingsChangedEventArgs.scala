package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Provides information about the setting that raised the SettingsChanged event
     *
     * [Api set: ExcelApi 1.4]
     */

trait SettingsChangedEventArgs extends js.Object {
  /**
           *
           * Gets the Setting object that represents the binding that raised the SettingsChanged event
           *
           * [Api set: ExcelApi 1.4]
           */
  var settings: SettingCollection
}

