package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the setting that raised the SettingsChanged event
  *
  * [Api set: ExcelApi 1.4]
  */
trait SettingsChangedEventArgs extends StObject {
  
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
  
  @scala.inline
  implicit class SettingsChangedEventArgsMutableBuilder[Self <: SettingsChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSettings(value: SettingCollection): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
