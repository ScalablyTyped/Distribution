package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies a range and its formatting.
  */
@js.native
trait RangeFormatConfiguration extends js.Object {
  
  /**
    * Specifies the range. Example of using Office.Table enum: Office.Table.All. Example of using RangeCoordinates: `{row: 3, column: 4}` specifies
    * the cell in the 3rd (zero-based) row in the 4th (zero-based) column.
    */
  var cells: Table | RangeCoordinates = js.native
  
  /**
    * Specifies the formatting as key-value pairs. Example: `{borderColor: "white", fontStyle: "bold"}`
    */
  var format: js.Object = js.native
}
object RangeFormatConfiguration {
  
  @scala.inline
  def apply(cells: Table | RangeCoordinates, format: js.Object): RangeFormatConfiguration = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFormatConfiguration]
  }
  
  @scala.inline
  implicit class RangeFormatConfigurationOps[Self <: RangeFormatConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCells(value: Table | RangeCoordinates): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: js.Object): Self = this.set("format", value.asInstanceOf[js.Any])
  }
}
