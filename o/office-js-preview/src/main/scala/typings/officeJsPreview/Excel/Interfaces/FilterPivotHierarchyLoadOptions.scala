package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Excel FilterPivotHierarchy.
  *
  * [Api set: ExcelApi 1.8]
  */
trait FilterPivotHierarchyLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Determines whether to allow multiple filter items.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableMultipleFilterItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Id of the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Name of the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Position of the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Boolean] = js.undefined
}
object FilterPivotHierarchyLoadOptions {
  
  @scala.inline
  def apply(): FilterPivotHierarchyLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterPivotHierarchyLoadOptions]
  }
  
  @scala.inline
  implicit class FilterPivotHierarchyLoadOptionsMutableBuilder[Self <: FilterPivotHierarchyLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setEnableMultipleFilterItems(value: Boolean): Self = StObject.set(x, "enableMultipleFilterItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMultipleFilterItemsUndefined: Self = StObject.set(x, "enableMultipleFilterItems", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
