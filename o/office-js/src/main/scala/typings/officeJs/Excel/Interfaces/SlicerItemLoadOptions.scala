package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a slicer item in a slicer.
  *
  * @remarks
  * [Api set: ExcelApi 1.10]
  */
trait SlicerItemLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Value is `true` if the slicer item has data.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var hasData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Value is `true` if the slicer item is selected.
    Setting this value will not clear the selected state of other slicer items.
    By default, if the slicer item is the only one selected, when it is deselected, all items will be selected.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var isSelected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the unique value representing the slicer item.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var key: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the title displayed in the Excel UI.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[Boolean] = js.undefined
}
object SlicerItemLoadOptions {
  
  inline def apply(): SlicerItemLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerItemLoadOptions]
  }
  
  extension [Self <: SlicerItemLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setHasData(value: Boolean): Self = StObject.set(x, "hasData", value.asInstanceOf[js.Any])
    
    inline def setHasDataUndefined: Self = StObject.set(x, "hasData", js.undefined)
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    
    inline def setKey(value: Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
