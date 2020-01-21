package typings.officeJs.Excel

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

object SettingsChangedEventArgs {
  @scala.inline
  def apply(settings: SettingCollection): SettingsChangedEventArgs = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SettingsChangedEventArgs]
  }
}

