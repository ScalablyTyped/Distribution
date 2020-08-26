package typings.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `setting.toJSON()`. */
@js.native
trait SettingData extends js.Object {
  /**
    *
    * Gets the key of the setting. Read only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var key: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the value of the setting.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var value: js.UndefOr[js.Any] = js.native
}

object SettingData {
  @scala.inline
  def apply(): SettingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingData]
  }
  @scala.inline
  implicit class SettingDataOps[Self <: SettingData] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

