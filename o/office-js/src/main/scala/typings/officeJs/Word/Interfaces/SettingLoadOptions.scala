package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a setting of the add-in.
  *
  * @remarks
  * [Api set: WordApi 1.4]
  */
trait SettingLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the key of the setting.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var key: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the value of the setting.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var value: js.UndefOr[Boolean] = js.undefined
}
object SettingLoadOptions {
  
  inline def apply(): SettingLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingLoadOptions]
  }
  
  extension [Self <: SettingLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setKey(value: Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
