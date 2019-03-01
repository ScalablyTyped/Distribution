package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "setting.toJSON()". */
trait SettingData extends js.Object {
  /**
    *
    * Gets the key of the setting. Read only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the value of the setting.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object SettingData {
  @scala.inline
  def apply(key: java.lang.String = null, value: js.Any = null): SettingData = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SettingData]
  }
}

