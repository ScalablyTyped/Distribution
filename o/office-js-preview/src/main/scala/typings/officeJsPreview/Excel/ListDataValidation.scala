package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
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
trait ListDataValidation extends StObject {
  
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
  implicit class ListDataValidationMutableBuilder[Self <: ListDataValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInCellDropDown(value: Boolean): Self = StObject.set(x, "inCellDropDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String | Range): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
