package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the FilterPivotHierarchy object, for use in `filterPivotHierarchy.set({ ... })`. */
trait FilterPivotHierarchyUpdateData extends StObject {
  
  /**
    *
    * Determines whether to allow multiple filter items.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableMultipleFilterItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Name of the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Position of the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Double] = js.undefined
}
object FilterPivotHierarchyUpdateData {
  
  @scala.inline
  def apply(): FilterPivotHierarchyUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterPivotHierarchyUpdateData]
  }
  
  @scala.inline
  implicit class FilterPivotHierarchyUpdateDataMutableBuilder[Self <: FilterPivotHierarchyUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableMultipleFilterItems(value: Boolean): Self = StObject.set(x, "enableMultipleFilterItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMultipleFilterItemsUndefined: Self = StObject.set(x, "enableMultipleFilterItems", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
