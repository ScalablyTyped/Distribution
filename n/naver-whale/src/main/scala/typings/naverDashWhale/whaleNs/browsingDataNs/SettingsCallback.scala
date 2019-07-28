package typings.naverDashWhale.whaleNs.browsingDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsCallback extends js.Object {
  /** All of the types will be present in the result, with values of true if they are permitted to be removed (e.g., by enterprise policy) and false if not. */
  var dataRemovalPermitted: typings.chrome.chromeNs.browsingDataNs.DataTypeSet
  /** All of the types will be present in the result, with values of true if they are both selected to be removed and permitted to be removed, otherwise false. */
  var dataToRemove: typings.chrome.chromeNs.browsingDataNs.DataTypeSet
  var options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions
}

object SettingsCallback {
  @scala.inline
  def apply(
    dataRemovalPermitted: typings.chrome.chromeNs.browsingDataNs.DataTypeSet,
    dataToRemove: typings.chrome.chromeNs.browsingDataNs.DataTypeSet,
    options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions
  ): SettingsCallback = {
    val __obj = js.Dynamic.literal(dataRemovalPermitted = dataRemovalPermitted, dataToRemove = dataToRemove, options = options)
  
    __obj.asInstanceOf[SettingsCallback]
  }
}

