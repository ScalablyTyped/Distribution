package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `numberFormatInfo.toJSON()`. */
@js.native
trait NumberFormatInfoData extends js.Object {
  
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var numberDecimalSeparator: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var numberGroupSeparator: js.UndefOr[String] = js.native
}
object NumberFormatInfoData {
  
  @scala.inline
  def apply(): NumberFormatInfoData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFormatInfoData]
  }
  
  @scala.inline
  implicit class NumberFormatInfoDataOps[Self <: NumberFormatInfoData] (val x: Self) extends AnyVal {
    
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
    def setNumberDecimalSeparator(value: String): Self = this.set("numberDecimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberDecimalSeparator: Self = this.set("numberDecimalSeparator", js.undefined)
    
    @scala.inline
    def setNumberGroupSeparator(value: String): Self = this.set("numberGroupSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberGroupSeparator: Self = this.set("numberGroupSeparator", js.undefined)
  }
}
