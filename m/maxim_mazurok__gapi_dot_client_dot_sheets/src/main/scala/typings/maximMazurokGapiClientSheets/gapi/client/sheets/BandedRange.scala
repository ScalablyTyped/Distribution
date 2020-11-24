package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BandedRange extends js.Object {
  
  /** The id of the banded range. */
  var bandedRangeId: js.UndefOr[Double] = js.native
  
  /**
    * Properties for column bands. These properties are applied on a column- by-column basis throughout all the columns in the range. At least one of row_properties or column_properties
    * must be specified.
    */
  var columnProperties: js.UndefOr[BandingProperties] = js.native
  
  /** The range over which these properties are applied. */
  var range: js.UndefOr[GridRange] = js.native
  
  /**
    * Properties for row bands. These properties are applied on a row-by-row basis throughout all the rows in the range. At least one of row_properties or column_properties must be
    * specified.
    */
  var rowProperties: js.UndefOr[BandingProperties] = js.native
}
object BandedRange {
  
  @scala.inline
  def apply(): BandedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandedRange]
  }
  
  @scala.inline
  implicit class BandedRangeOps[Self <: BandedRange] (val x: Self) extends AnyVal {
    
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
    def setBandedRangeId(value: Double): Self = this.set("bandedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandedRangeId: Self = this.set("bandedRangeId", js.undefined)
    
    @scala.inline
    def setColumnProperties(value: BandingProperties): Self = this.set("columnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnProperties: Self = this.set("columnProperties", js.undefined)
    
    @scala.inline
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setRowProperties(value: BandingProperties): Self = this.set("rowProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowProperties: Self = this.set("rowProperties", js.undefined)
  }
}
