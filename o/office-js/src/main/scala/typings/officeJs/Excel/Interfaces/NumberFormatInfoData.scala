package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `numberFormatInfo.toJSON()`. */
@js.native
trait NumberFormatInfoData extends StObject {
  
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
  implicit class NumberFormatInfoDataMutableBuilder[Self <: NumberFormatInfoData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberDecimalSeparator(value: String): Self = StObject.set(x, "numberDecimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberDecimalSeparatorUndefined: Self = StObject.set(x, "numberDecimalSeparator", js.undefined)
    
    @scala.inline
    def setNumberGroupSeparator(value: String): Self = StObject.set(x, "numberGroupSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberGroupSeparatorUndefined: Self = StObject.set(x, "numberGroupSeparator", js.undefined)
  }
}
