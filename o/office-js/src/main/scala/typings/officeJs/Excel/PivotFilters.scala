package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface representing all PivotFilters currently applied to a given PivotField.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
trait PivotFilters extends StObject {
  
  /**
    * The PivotField's currently applied date filter. This property is `null` if no value filter is applied.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var dateFilter: js.UndefOr[PivotDateFilter] = js.undefined
  
  /**
    * The PivotField's currently applied label filter. This property is `null` if no value filter is applied.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var labelFilter: js.UndefOr[PivotLabelFilter] = js.undefined
  
  /**
    * The PivotField's currently applied manual filter. This property is `null` if no value filter is applied.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var manualFilter: js.UndefOr[PivotManualFilter] = js.undefined
  
  /**
    * The PivotField's currently applied value filter. This property is `null` if no value filter is applied.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var valueFilter: js.UndefOr[PivotValueFilter] = js.undefined
}
object PivotFilters {
  
  inline def apply(): PivotFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotFilters] (val x: Self) extends AnyVal {
    
    inline def setDateFilter(value: PivotDateFilter): Self = StObject.set(x, "dateFilter", value.asInstanceOf[js.Any])
    
    inline def setDateFilterUndefined: Self = StObject.set(x, "dateFilter", js.undefined)
    
    inline def setLabelFilter(value: PivotLabelFilter): Self = StObject.set(x, "labelFilter", value.asInstanceOf[js.Any])
    
    inline def setLabelFilterUndefined: Self = StObject.set(x, "labelFilter", js.undefined)
    
    inline def setManualFilter(value: PivotManualFilter): Self = StObject.set(x, "manualFilter", value.asInstanceOf[js.Any])
    
    inline def setManualFilterUndefined: Self = StObject.set(x, "manualFilter", js.undefined)
    
    inline def setValueFilter(value: PivotValueFilter): Self = StObject.set(x, "valueFilter", value.asInstanceOf[js.Any])
    
    inline def setValueFilterUndefined: Self = StObject.set(x, "valueFilter", js.undefined)
  }
}
