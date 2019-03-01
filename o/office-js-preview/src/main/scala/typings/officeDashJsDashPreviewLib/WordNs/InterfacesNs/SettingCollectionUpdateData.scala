package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the SettingCollection object, for use in "settingCollection.set({ ... })". */
trait SettingCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[SettingData]] = js.undefined
}

object SettingCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[SettingData] = null): SettingCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[SettingCollectionUpdateData]
  }
}

