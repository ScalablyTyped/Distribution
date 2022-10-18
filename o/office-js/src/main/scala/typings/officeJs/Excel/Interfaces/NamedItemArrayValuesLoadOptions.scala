package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an object containing values and types of a named item.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
trait NamedItemArrayValuesLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the types for each item in the named item array
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var types: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the values of each item in the named item array.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var values: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A JSON representation of the values in this named item array.
    Unlike `NamedItemArrayValues.values`, `NamedItemArrayValues.valuesAsJson` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the en-US locale.  To retrieve data in the user's display locale, use `NamedItemArrayValues.valuesAsJsonLocal`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var valuesAsJson: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A JSON representation of the values in this named item array.
    Unlike `NamedItemArrayValues.values`, `NamedItemArrayValues.valuesAsJsonLocal` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the user's display locale.  To retrieve data independent of locale, use `NamedItemArrayValues.valuesAsJson`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var valuesAsJsonLocal: js.UndefOr[Boolean] = js.undefined
}
object NamedItemArrayValuesLoadOptions {
  
  inline def apply(): NamedItemArrayValuesLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedItemArrayValuesLoadOptions]
  }
  
  extension [Self <: NamedItemArrayValuesLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setTypes(value: Boolean): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesAsJson(value: Boolean): Self = StObject.set(x, "valuesAsJson", value.asInstanceOf[js.Any])
    
    inline def setValuesAsJsonLocal(value: Boolean): Self = StObject.set(x, "valuesAsJsonLocal", value.asInstanceOf[js.Any])
    
    inline def setValuesAsJsonLocalUndefined: Self = StObject.set(x, "valuesAsJsonLocal", js.undefined)
    
    inline def setValuesAsJsonUndefined: Self = StObject.set(x, "valuesAsJson", js.undefined)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
