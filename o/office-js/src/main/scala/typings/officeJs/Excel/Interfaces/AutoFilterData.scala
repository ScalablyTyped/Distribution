package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.FilterCriteria
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `autoFilter.toJSON()`. */
trait AutoFilterData extends StObject {
  
  /**
    *
    * An array that holds all the filter criteria in the autofiltered range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var criteria: js.UndefOr[js.Array[FilterCriteria]] = js.undefined
  
  /**
    *
    * Specifies if the AutoFilter is enabled.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the AutoFilter has filter criteria.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isDataFiltered: js.UndefOr[Boolean] = js.undefined
}
object AutoFilterData {
  
  @scala.inline
  def apply(): AutoFilterData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFilterData]
  }
  
  @scala.inline
  implicit class AutoFilterDataMutableBuilder[Self <: AutoFilterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCriteria(value: js.Array[FilterCriteria]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    @scala.inline
    def setCriteriaVarargs(value: FilterCriteria*): Self = StObject.set(x, "criteria", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setIsDataFiltered(value: Boolean): Self = StObject.set(x, "isDataFiltered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDataFilteredUndefined: Self = StObject.set(x, "isDataFiltered", js.undefined)
  }
}
