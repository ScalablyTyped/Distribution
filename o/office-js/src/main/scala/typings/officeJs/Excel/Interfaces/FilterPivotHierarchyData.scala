package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `filterPivotHierarchy.toJSON()`. */
trait FilterPivotHierarchyData extends StObject {
  
  /**
    *
    * Determines whether to allow multiple filter items.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableMultipleFilterItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the PivotFields associated with the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var fields: js.UndefOr[js.Array[PivotFieldData]] = js.undefined
  
  /**
    *
    * Id of the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[String] = js.undefined
  
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
object FilterPivotHierarchyData {
  
  @scala.inline
  def apply(): FilterPivotHierarchyData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterPivotHierarchyData]
  }
  
  @scala.inline
  implicit class FilterPivotHierarchyDataMutableBuilder[Self <: FilterPivotHierarchyData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableMultipleFilterItems(value: Boolean): Self = StObject.set(x, "enableMultipleFilterItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMultipleFilterItemsUndefined: Self = StObject.set(x, "enableMultipleFilterItems", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[PivotFieldData]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: PivotFieldData*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
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
