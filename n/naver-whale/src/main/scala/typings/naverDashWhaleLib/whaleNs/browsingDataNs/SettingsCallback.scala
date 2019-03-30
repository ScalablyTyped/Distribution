package typings
package naverDashWhaleLib.whaleNs.browsingDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsCallback extends js.Object {
  /** All of the types will be present in the result, with values of true if they are permitted to be removed (e.g., by enterprise policy) and false if not. */
  var dataRemovalPermitted: chromeLib.chromeNs.browsingDataNs.DataTypeSet
  /** All of the types will be present in the result, with values of true if they are both selected to be removed and permitted to be removed, otherwise false. */
  var dataToRemove: chromeLib.chromeNs.browsingDataNs.DataTypeSet
  var options: chromeLib.chromeNs.browsingDataNs.RemovalOptions
}

object SettingsCallback {
  @scala.inline
  def apply(
    dataRemovalPermitted: chromeLib.chromeNs.browsingDataNs.DataTypeSet,
    dataToRemove: chromeLib.chromeNs.browsingDataNs.DataTypeSet,
    options: chromeLib.chromeNs.browsingDataNs.RemovalOptions
  ): SettingsCallback = {
    val __obj = js.Dynamic.literal(dataRemovalPermitted = dataRemovalPermitted, dataToRemove = dataToRemove, options = options)
  
    __obj.asInstanceOf[SettingsCallback]
  }
}

