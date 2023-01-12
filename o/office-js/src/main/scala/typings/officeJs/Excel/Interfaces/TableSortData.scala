package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.SortField
import typings.officeJs.Excel.SortMethod
import typings.officeJs.officeJsStrings.PinYin
import typings.officeJs.officeJsStrings.StrokeCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableSort.toJSON()`. */
trait TableSortData extends StObject {
  
  /**
    * Specifies the current conditions used to last sort the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var fields: js.UndefOr[js.Array[SortField]] = js.undefined
  
  /**
    * Specifies if the casing impacts the last sort of the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var matchCase: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the Chinese character ordering method last used to sort the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var method: js.UndefOr[SortMethod | PinYin | StrokeCount] = js.undefined
}
object TableSortData {
  
  inline def apply(): TableSortData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableSortData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableSortData] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[SortField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SortField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
    
    inline def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
    
    inline def setMethod(value: SortMethod | PinYin | StrokeCount): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
