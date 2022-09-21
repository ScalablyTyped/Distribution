package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a linked workbook.
  If a workbook has links pointing to data in another workbook, the second workbook is linked to the first workbook.
  In this scenario, the second workbook is called the "linked workbook".
  *
  * @remarks
  * [Api set: ExcelApiOnline 1.1]
  */
trait LinkedWorkbookLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The original URL pointing to the linked workbook. It is unique across all linked workbooks in the collection.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
}
object LinkedWorkbookLoadOptions {
  
  inline def apply(): LinkedWorkbookLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedWorkbookLoadOptions]
  }
  
  extension [Self <: LinkedWorkbookLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
