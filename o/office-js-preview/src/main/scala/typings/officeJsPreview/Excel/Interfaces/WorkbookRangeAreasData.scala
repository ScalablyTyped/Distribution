package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `workbookRangeAreas.toJSON()`. */
@js.native
trait WorkbookRangeAreasData extends js.Object {
  
  /**
    *
    * Returns an array of address in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g., "Sheet1!A1:B4, Sheet1!D1:D4"). Read-only.
    *
    * [Api set: ExcelApi 1.12]
    */
  var addresses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    *
    * Returns the RangeAreasCollection object, each RangeAreas in the collection represent one or more rectangle ranges in one worksheet.
    *
    * [Api set: ExcelApi 1.12]
    */
  var areas: js.UndefOr[js.Array[RangeAreasData]] = js.native
  
  /**
    *
    * Returns ranges that comprise this object in a RangeCollection object.
    *
    * [Api set: ExcelApi 1.12]
    */
  var ranges: js.UndefOr[js.Array[RangeData]] = js.native
}
object WorkbookRangeAreasData {
  
  @scala.inline
  def apply(): WorkbookRangeAreasData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeAreasData]
  }
  
  @scala.inline
  implicit class WorkbookRangeAreasDataOps[Self <: WorkbookRangeAreasData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddressesVarargs(value: String*): Self = this.set("addresses", js.Array(value :_*))
    
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    
    @scala.inline
    def setAreasVarargs(value: RangeAreasData*): Self = this.set("areas", js.Array(value :_*))
    
    @scala.inline
    def setAreas(value: js.Array[RangeAreasData]): Self = this.set("areas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreas: Self = this.set("areas", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: RangeData*): Self = this.set("ranges", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[RangeData]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
  }
}
