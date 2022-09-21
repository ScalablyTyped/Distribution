package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `workbookRangeAreas.toJSON()`. */
trait WorkbookRangeAreasData extends StObject {
  
  /**
    * Returns an array of addresses in A1-style. Address values contain the worksheet name for each rectangular block of cells (e.g., "Sheet1!A1:B4, Sheet1!D1:D4"). Read-only.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var addresses: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Returns the `RangeAreasCollection` object. Each `RangeAreas` in the collection represent one or more rectangle ranges in one worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var areas: js.UndefOr[js.Array[RangeAreasData]] = js.undefined
  
  /**
    * Returns ranges that comprise this object in a `RangeCollection` object.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var ranges: js.UndefOr[js.Array[RangeData]] = js.undefined
}
object WorkbookRangeAreasData {
  
  inline def apply(): WorkbookRangeAreasData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeAreasData]
  }
  
  extension [Self <: WorkbookRangeAreasData](x: Self) {
    
    inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setAreas(value: js.Array[RangeAreasData]): Self = StObject.set(x, "areas", value.asInstanceOf[js.Any])
    
    inline def setAreasUndefined: Self = StObject.set(x, "areas", js.undefined)
    
    inline def setAreasVarargs(value: RangeAreasData*): Self = StObject.set(x, "areas", js.Array(value*))
    
    inline def setRanges(value: js.Array[RangeData]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: RangeData*): Self = StObject.set(x, "ranges", js.Array(value*))
  }
}
