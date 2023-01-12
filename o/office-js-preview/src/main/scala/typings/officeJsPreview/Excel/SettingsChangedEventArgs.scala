package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the setting that raised the settings changed event
  *
  * @remarks
  * [Api set: ExcelApi 1.4]
  */
trait SettingsChangedEventArgs extends StObject {
  
  /**
    * Gets the `Setting` object that represents the binding that raised the settings changed event
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  var settings: SettingCollection
}
object SettingsChangedEventArgs {
  
  inline def apply(settings: SettingCollection): SettingsChangedEventArgs = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SettingsChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setSettings(value: SettingCollection): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
