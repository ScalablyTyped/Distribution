package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `slicerItem.toJSON()`. */
trait SlicerItemData extends StObject {
  
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
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the title displayed in the Excel UI.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.undefined
}
object SlicerItemData {
  
  inline def apply(): SlicerItemData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerItemData]
  }
  
  extension [Self <: SlicerItemData](x: Self) {
    
    inline def setHasData(value: Boolean): Self = StObject.set(x, "hasData", value.asInstanceOf[js.Any])
    
    inline def setHasDataUndefined: Self = StObject.set(x, "hasData", js.undefined)
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
