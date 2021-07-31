package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Excel PivotField.
  *
  * [Api set: ExcelApi 1.8]
  */
trait PivotFieldLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Id of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Name of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Determines whether to show all items of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAllItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Subtotals of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotals: js.UndefOr[Boolean] = js.undefined
}
object PivotFieldLoadOptions {
  
  @scala.inline
  def apply(): PivotFieldLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFieldLoadOptions]
  }
  
  @scala.inline
  implicit class PivotFieldLoadOptionsMutableBuilder[Self <: PivotFieldLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setShowAllItems(value: Boolean): Self = StObject.set(x, "showAllItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAllItemsUndefined: Self = StObject.set(x, "showAllItems", js.undefined)
    
    @scala.inline
    def setSubtotals(value: Boolean): Self = StObject.set(x, "subtotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtotalsUndefined: Self = StObject.set(x, "subtotals", js.undefined)
  }
}
