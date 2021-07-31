package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of key-value pair setting objects that are part of the workbook. The scope is limited to per file and add-in (task-pane or content) combination.
  *
  * [Api set: ExcelApi 1.4]
  */
trait SettingCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The key that represents the id of the Setting.
    *
    * [Api set: ExcelApi 1.4]
    */
  var key: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Represents the value stored for this setting.
    *
    * [Api set: ExcelApi 1.4]
    */
  var value: js.UndefOr[Boolean] = js.undefined
}
object SettingCollectionLoadOptions {
  
  @scala.inline
  def apply(): SettingCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class SettingCollectionLoadOptionsMutableBuilder[Self <: SettingCollectionLoadOptions] (val x: Self) extends AnyVal {
    
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
