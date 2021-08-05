package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.CellColor
import typings.officeJsPreview.officeJsPreviewStrings.FontColor
import typings.officeJsPreview.officeJsPreviewStrings.Normal
import typings.officeJsPreview.officeJsPreviewStrings.TextAsNumber
import typings.officeJsPreview.officeJsPreviewStrings.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a condition in a sorting operation.
  *
  * [Api set: ExcelApi 1.2]
  */
trait SortField extends StObject {
  
  /**
    *
    * Specifies if the sorting is done in an ascending fashion.
    *
    * [Api set: ExcelApi 1.2]
    */
  var ascending: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the color that is the target of the condition if the sorting is on font or cell color.
    *
    * [Api set: ExcelApi 1.2]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents additional sorting options for this field.
    *
    * [Api set: ExcelApi 1.2]
    */
  var dataOption: js.UndefOr[SortDataOption | Normal | TextAsNumber] = js.undefined
  
  /**
    *
    * Specifies the icon that is the target of the condition if the sorting is on the cell's icon.
    *
    * [Api set: ExcelApi 1.2]
    */
  var icon: js.UndefOr[Icon] = js.undefined
  
  /**
    *
    * Specifies the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset from the first column (or row).
    *
    * [Api set: ExcelApi 1.2]
    */
  var key: Double
  
  /**
    *
    * Specifies the type of sorting of this condition.
    *
    * [Api set: ExcelApi 1.2]
    */
  var sortOn: js.UndefOr[
    SortOn | Value | CellColor | FontColor | typings.officeJsPreview.officeJsPreviewStrings.Icon
  ] = js.undefined
  
  /**
    *
    * Specifies the subfield that is the target property name of a rich value to sort on.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subField: js.UndefOr[String] = js.undefined
}
object SortField {
  
  inline def apply(key: Double): SortField = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortField]
  }
  
  extension [Self <: SortField](x: Self) {
    
    inline def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    inline def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDataOption(value: SortDataOption | Normal | TextAsNumber): Self = StObject.set(x, "dataOption", value.asInstanceOf[js.Any])
    
    inline def setDataOptionUndefined: Self = StObject.set(x, "dataOption", js.undefined)
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSortOn(
      value: SortOn | Value | CellColor | FontColor | typings.officeJsPreview.officeJsPreviewStrings.Icon
    ): Self = StObject.set(x, "sortOn", value.asInstanceOf[js.Any])
    
    inline def setSortOnUndefined: Self = StObject.set(x, "sortOn", js.undefined)
    
    inline def setSubField(value: String): Self = StObject.set(x, "subField", value.asInstanceOf[js.Any])
    
    inline def setSubFieldUndefined: Self = StObject.set(x, "subField", js.undefined)
  }
}
