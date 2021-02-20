package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of one or more rectangular ranges in multiple worksheets.
  *
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait WorkbookRangeAreasLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns an array of address in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g., "Sheet1!A1:B4, Sheet1!D1:D4"). Read-only.
    *
    * [Api set: ExcelApi 1.12]
    */
  var addresses: js.UndefOr[Boolean] = js.native
}
object WorkbookRangeAreasLoadOptions {
  
  @scala.inline
  def apply(): WorkbookRangeAreasLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeAreasLoadOptions]
  }
  
  @scala.inline
  implicit class WorkbookRangeAreasLoadOptionsMutableBuilder[Self <: WorkbookRangeAreasLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setAddresses(value: Boolean): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
  }
}
