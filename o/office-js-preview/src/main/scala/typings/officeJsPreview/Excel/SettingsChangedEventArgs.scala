package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the setting that raised the SettingsChanged event
  *
  * [Api set: ExcelApi 1.4]
  */
@js.native
trait SettingsChangedEventArgs extends js.Object {
  /**
    *
    * Gets the Setting object that represents the binding that raised the SettingsChanged event
    *
    * [Api set: ExcelApi 1.4]
    */
  var settings: SettingCollection = js.native
}

object SettingsChangedEventArgs {
  @scala.inline
  def apply(settings: SettingCollection): SettingsChangedEventArgs = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsChangedEventArgs]
  }
  @scala.inline
  implicit class SettingsChangedEventArgsOps[Self <: SettingsChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setSettings(value: SettingCollection): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
  
}

