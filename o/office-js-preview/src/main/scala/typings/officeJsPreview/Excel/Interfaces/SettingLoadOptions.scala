package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Setting represents a key-value pair of a setting persisted to the document (per file per add-in). These custom key-value pair can be used to store state or lifecycle information needed by the content or task-pane add-in. Note that settings are persisted in the document and hence it is not a place to store any sensitive or protected information such as user information and password.
  *
  * [Api set: ExcelApi 1.4]
  */
trait SettingLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The key that represents the id of the Setting.
    *
    * [Api set: ExcelApi 1.4]
    */
  var key: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the value stored for this setting.
    *
    * [Api set: ExcelApi 1.4]
    */
  var value: js.UndefOr[Boolean] = js.undefined
}
object SettingLoadOptions {
  
  @scala.inline
  def apply(): SettingLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingLoadOptions]
  }
  
  @scala.inline
  implicit class SettingLoadOptionsMutableBuilder[Self <: SettingLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setKey(value: Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
