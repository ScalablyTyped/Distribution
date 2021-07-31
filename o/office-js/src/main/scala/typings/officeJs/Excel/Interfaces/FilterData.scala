package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.FilterCriteria
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `filter.toJSON()`. */
trait FilterData extends StObject {
  
  /**
    *
    * The currently applied filter on the given column.
    *
    * [Api set: ExcelApi 1.2]
    */
  var criteria: js.UndefOr[FilterCriteria] = js.undefined
}
object FilterData {
  
  @scala.inline
  def apply(): FilterData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterData]
  }
  
  @scala.inline
  implicit class FilterDataMutableBuilder[Self <: FilterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCriteria(value: FilterCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
  }
}
