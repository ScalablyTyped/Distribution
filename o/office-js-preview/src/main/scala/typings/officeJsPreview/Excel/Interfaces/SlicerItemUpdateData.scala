package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SlicerItem object, for use in `slicerItem.set({ ... })`. */
trait SlicerItemUpdateData extends StObject {
  
  /**
    * Value is `true` if the slicer item is selected.
    Setting this value will not clear the selected state of other slicer items.
    By default, if the slicer item is the only one selected, when it is deselected, all items will be selected.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var isSelected: js.UndefOr[Boolean] = js.undefined
}
object SlicerItemUpdateData {
  
  inline def apply(): SlicerItemUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerItemUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlicerItemUpdateData] (val x: Self) extends AnyVal {
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
  }
}
