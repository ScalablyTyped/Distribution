package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotItem object, for use in `pivotItem.set({ ... })`. */
trait PivotItemUpdateData extends StObject {
  
  /**
    *
    * Determines whether the item is expanded to show child items or if it's collapsed and child items are hidden.
    *
    * [Api set: ExcelApi 1.8]
    */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Name of the PivotItem.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies if the PivotItem is visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object PivotItemUpdateData {
  
  inline def apply(): PivotItemUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotItemUpdateData]
  }
  
  extension [Self <: PivotItemUpdateData](x: Self) {
    
    inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
