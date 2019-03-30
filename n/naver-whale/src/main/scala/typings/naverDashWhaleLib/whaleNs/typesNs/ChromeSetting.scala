package typings
package naverDashWhaleLib.whaleNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeSetting extends js.Object {
  /** Fired after the setting changes. */
  var onChange: chromeLib.chromeNs.typesNs.ChromeSettingChangedEvent = js.native
  /**
    * Clears the setting, restoring any default value.
    * @param details Which setting to clear.
    * @param callback Optional. Called at the completion of the clear operation.
    */
  def clear(details: chromeLib.chromeNs.typesNs.ChromeSettingClearDetails): scala.Unit = js.native
  def clear(details: chromeLib.chromeNs.typesNs.ChromeSettingClearDetails, callback: js.Function): scala.Unit = js.native
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    */
  def get(details: chromeLib.chromeNs.typesNs.ChromeSettingGetDetails): scala.Unit = js.native
  def get(
    details: chromeLib.chromeNs.typesNs.ChromeSettingGetDetails,
    callback: chromeLib.chromeNs.typesNs.DetailsCallback
  ): scala.Unit = js.native
  /**
    * Sets the value of a setting.
    * @param details Which setting to change.
    * @param callback Optional. Called at the completion of the set operation.
    */
  def set(details: chromeLib.chromeNs.typesNs.ChromeSettingSetDetails): scala.Unit = js.native
  def set(details: chromeLib.chromeNs.typesNs.ChromeSettingSetDetails, callback: js.Function): scala.Unit = js.native
}

