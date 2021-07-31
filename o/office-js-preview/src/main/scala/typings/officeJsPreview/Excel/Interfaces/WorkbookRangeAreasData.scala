package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `workbookRangeAreas.toJSON()`. */
trait WorkbookRangeAreasData extends StObject {
  
  /**
    *
    * Returns an array of address in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g., "Sheet1!A1:B4, Sheet1!D1:D4"). Read-only.
    *
    * [Api set: ExcelApi 1.12]
    */
  var addresses: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    *
    * Returns the RangeAreasCollection object, each RangeAreas in the collection represent one or more rectangle ranges in one worksheet.
    *
    * [Api set: ExcelApi 1.12]
    */
  var areas: js.UndefOr[js.Array[RangeAreasData]] = js.undefined
  
  /**
    *
    * Returns ranges that comprise this object in a RangeCollection object.
    *
    * [Api set: ExcelApi 1.12]
    */
  var ranges: js.UndefOr[js.Array[RangeData]] = js.undefined
}
object WorkbookRangeAreasData {
  
  @scala.inline
  def apply(): WorkbookRangeAreasData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeAreasData]
  }
  
  @scala.inline
  implicit class WorkbookRangeAreasDataMutableBuilder[Self <: WorkbookRangeAreasData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setAreas(value: js.Array[RangeAreasData]): Self = StObject.set(x, "areas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreasUndefined: Self = StObject.set(x, "areas", js.undefined)
    
    @scala.inline
    def setAreasVarargs(value: RangeAreasData*): Self = StObject.set(x, "areas", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[RangeData]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: RangeData*): Self = StObject.set(x, "ranges", js.Array(value :_*))
  }
}
