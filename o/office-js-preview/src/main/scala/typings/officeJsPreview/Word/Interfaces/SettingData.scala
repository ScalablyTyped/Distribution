package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `setting.toJSON()`. */
trait SettingData extends StObject {
  
  /**
    * Gets the key of the setting.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the value of the setting.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var value: js.UndefOr[Any] = js.undefined
}
object SettingData {
  
  inline def apply(): SettingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingData]
  }
  
  extension [Self <: SettingData](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
