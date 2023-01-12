package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of one or more rectangular ranges in multiple worksheets.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
trait WorkbookRangeAreasLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns an array of addresses in A1-style. Address values contain the worksheet name for each rectangular block of cells (e.g., "Sheet1!A1:B4, Sheet1!D1:D4"). Read-only.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var addresses: js.UndefOr[Boolean] = js.undefined
}
object WorkbookRangeAreasLoadOptions {
  
  inline def apply(): WorkbookRangeAreasLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeAreasLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookRangeAreasLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAddresses(value: Boolean): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
  }
}
