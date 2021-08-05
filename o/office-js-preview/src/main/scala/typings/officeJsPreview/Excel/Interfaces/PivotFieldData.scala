package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.Subtotals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotField.toJSON()`. */
trait PivotFieldData extends StObject {
  
  /**
    *
    * Id of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Returns the PivotFields associated with the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var items: js.UndefOr[js.Array[PivotItemData]] = js.undefined
  
  /**
    *
    * Name of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Determines whether to show all items of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAllItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Subtotals of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotals: js.UndefOr[Subtotals] = js.undefined
}
object PivotFieldData {
  
  inline def apply(): PivotFieldData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFieldData]
  }
  
  extension [Self <: PivotFieldData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItems(value: js.Array[PivotItemData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PivotItemData*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShowAllItems(value: Boolean): Self = StObject.set(x, "showAllItems", value.asInstanceOf[js.Any])
    
    inline def setShowAllItemsUndefined: Self = StObject.set(x, "showAllItems", js.undefined)
    
    inline def setSubtotals(value: Subtotals): Self = StObject.set(x, "subtotals", value.asInstanceOf[js.Any])
    
    inline def setSubtotalsUndefined: Self = StObject.set(x, "subtotals", js.undefined)
  }
}
