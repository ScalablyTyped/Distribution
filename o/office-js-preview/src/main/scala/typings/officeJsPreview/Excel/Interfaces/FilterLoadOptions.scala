package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manages the filtering of a table's column.
  *
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
trait FilterLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The currently applied filter on the given column.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var criteria: js.UndefOr[Boolean] = js.undefined
}
object FilterLoadOptions {
  
  inline def apply(): FilterLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterLoadOptions]
  }
  
  extension [Self <: FilterLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setCriteria(value: Boolean): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
  }
}
