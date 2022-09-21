package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.Subtotals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotField object, for use in `pivotField.set({ ... })`. */
trait PivotFieldUpdateData extends StObject {
  
  /**
    * Name of the PivotField.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Determines whether to show all items of the PivotField.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showAllItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Subtotals of the PivotField.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var subtotals: js.UndefOr[Subtotals] = js.undefined
}
object PivotFieldUpdateData {
  
  inline def apply(): PivotFieldUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFieldUpdateData]
  }
  
  extension [Self <: PivotFieldUpdateData](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShowAllItems(value: Boolean): Self = StObject.set(x, "showAllItems", value.asInstanceOf[js.Any])
    
    inline def setShowAllItemsUndefined: Self = StObject.set(x, "showAllItems", js.undefined)
    
    inline def setSubtotals(value: Subtotals): Self = StObject.set(x, "subtotals", value.asInstanceOf[js.Any])
    
    inline def setSubtotalsUndefined: Self = StObject.set(x, "subtotals", js.undefined)
  }
}
