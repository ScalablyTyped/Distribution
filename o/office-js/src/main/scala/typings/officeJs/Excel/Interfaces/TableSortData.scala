package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.SortField
import typings.officeJs.Excel.SortMethod
import typings.officeJs.officeJsStrings.PinYin
import typings.officeJs.officeJsStrings.StrokeCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableSort.toJSON()`. */
@js.native
trait TableSortData extends StObject {
  
  /**
    *
    * Specifies the current conditions used to last sort the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  var fields: js.UndefOr[js.Array[SortField]] = js.native
  
  /**
    *
    * Specifies if the casing impacts the last sort of the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents Chinese character ordering method last used to sort the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  var method: js.UndefOr[SortMethod | PinYin | StrokeCount] = js.native
}
object TableSortData {
  
  @scala.inline
  def apply(): TableSortData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableSortData]
  }
  
  @scala.inline
  implicit class TableSortDataMutableBuilder[Self <: TableSortData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[SortField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: SortField*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
    
    @scala.inline
    def setMethod(value: SortMethod | PinYin | StrokeCount): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
