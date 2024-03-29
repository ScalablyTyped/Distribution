package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.FilterCriteria
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `filter.toJSON()`. */
trait FilterData extends StObject {
  
  /**
    * The currently applied filter on the given column.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var criteria: js.UndefOr[FilterCriteria] = js.undefined
}
object FilterData {
  
  inline def apply(): FilterData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterData] (val x: Self) extends AnyVal {
    
    inline def setCriteria(value: FilterCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
  }
}
