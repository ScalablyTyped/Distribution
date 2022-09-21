package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.CellValue
import typings.officeJsPreview.Excel.RangeValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `namedItemArrayValues.toJSON()`. */
trait NamedItemArrayValuesData extends StObject {
  
  /**
    * Represents the types for each item in the named item array
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var types: js.UndefOr[js.Array[js.Array[RangeValueType]]] = js.undefined
  
  /**
    * Represents the values of each item in the named item array.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var values: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * A JSON representation of the values in this named item array.
    Unlike `NamedItemArrayValues.values`, `NamedItemArrayValues.valuesAsJson` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the en-US locale.  To retrieve data in the user's display locale, use `NamedItemArrayValues.valuesAsJsonLocal`.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var valuesAsJson: js.UndefOr[js.Array[js.Array[CellValue]]] = js.undefined
  
  /**
    * A JSON representation of the values in this named item array.
    Unlike `NamedItemArrayValues.values`, `NamedItemArrayValues.valuesAsJsonLocal` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the user's display locale.  To retrieve data independent of locale, use `NamedItemArrayValues.valuesAsJson`.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var valuesAsJsonLocal: js.UndefOr[js.Array[js.Array[CellValue]]] = js.undefined
}
object NamedItemArrayValuesData {
  
  inline def apply(): NamedItemArrayValuesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedItemArrayValuesData]
  }
  
  extension [Self <: NamedItemArrayValuesData](x: Self) {
    
    inline def setTypes(value: js.Array[js.Array[RangeValueType]]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: js.Array[RangeValueType]*): Self = StObject.set(x, "types", js.Array(value*))
    
    inline def setValues(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesAsJson(value: js.Array[js.Array[CellValue]]): Self = StObject.set(x, "valuesAsJson", value.asInstanceOf[js.Any])
    
    inline def setValuesAsJsonLocal(value: js.Array[js.Array[CellValue]]): Self = StObject.set(x, "valuesAsJsonLocal", value.asInstanceOf[js.Any])
    
    inline def setValuesAsJsonLocalUndefined: Self = StObject.set(x, "valuesAsJsonLocal", js.undefined)
    
    inline def setValuesAsJsonLocalVarargs(value: js.Array[CellValue]*): Self = StObject.set(x, "valuesAsJsonLocal", js.Array(value*))
    
    inline def setValuesAsJsonUndefined: Self = StObject.set(x, "valuesAsJson", js.undefined)
    
    inline def setValuesAsJsonVarargs(value: js.Array[CellValue]*): Self = StObject.set(x, "valuesAsJson", js.Array(value*))
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: js.Array[Any]*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
