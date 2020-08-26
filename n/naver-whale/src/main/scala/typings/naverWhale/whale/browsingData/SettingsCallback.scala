package typings.naverWhale.whale.browsingData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsCallback extends js.Object {
  /** All of the types will be present in the result, with values of true if they are permitted to be removed (e.g., by enterprise policy) and false if not. */
  var dataRemovalPermitted: typings.chrome.chrome.browsingData.DataTypeSet = js.native
  /** All of the types will be present in the result, with values of true if they are both selected to be removed and permitted to be removed, otherwise false. */
  var dataToRemove: typings.chrome.chrome.browsingData.DataTypeSet = js.native
  var options: typings.chrome.chrome.browsingData.RemovalOptions = js.native
}

object SettingsCallback {
  @scala.inline
  def apply(
    dataRemovalPermitted: typings.chrome.chrome.browsingData.DataTypeSet,
    dataToRemove: typings.chrome.chrome.browsingData.DataTypeSet,
    options: typings.chrome.chrome.browsingData.RemovalOptions
  ): SettingsCallback = {
    val __obj = js.Dynamic.literal(dataRemovalPermitted = dataRemovalPermitted.asInstanceOf[js.Any], dataToRemove = dataToRemove.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsCallback]
  }
  @scala.inline
  implicit class SettingsCallbackOps[Self <: SettingsCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataRemovalPermitted(value: typings.chrome.chrome.browsingData.DataTypeSet): Self = this.set("dataRemovalPermitted", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataToRemove(value: typings.chrome.chrome.browsingData.DataTypeSet): Self = this.set("dataToRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: typings.chrome.chrome.browsingData.RemovalOptions): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

