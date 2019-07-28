package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "settingCollection.toJSON()". */
trait SettingCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[SettingData]] = js.undefined
}

object SettingCollectionData {
  @scala.inline
  def apply(items: js.Array[SettingData] = null): SettingCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[SettingCollectionData]
  }
}

