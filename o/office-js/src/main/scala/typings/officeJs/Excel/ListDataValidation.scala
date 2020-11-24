package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the List data validation criteria.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait ListDataValidation extends js.Object {
  
  /**
    *
    * Displays the list in cell drop down or not, it defaults to true.
    *
    * [Api set: ExcelApi 1.8]
    */
  var inCellDropDown: Boolean = js.native
  
  /**
    *
    * Source of the list for data validation
    When setting the value, it can be passed in as a Excel Range object, or a string that contains comma separated number, boolean or date.
    *
    * [Api set: ExcelApi 1.8]
    */
  var source: String | Range = js.native
}
object ListDataValidation {
  
  @scala.inline
  def apply(inCellDropDown: Boolean, source: String | Range): ListDataValidation = {
    val __obj = js.Dynamic.literal(inCellDropDown = inCellDropDown.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataValidation]
  }
  
  @scala.inline
  implicit class ListDataValidationOps[Self <: ListDataValidation] (val x: Self) extends AnyVal {
    
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
    def setInCellDropDown(value: Boolean): Self = this.set("inCellDropDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String | Range): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
