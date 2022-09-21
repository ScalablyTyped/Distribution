package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the List data validation criteria.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
trait ListDataValidation extends StObject {
  
  /**
    * Specifies whether to display the list in a cell drop-down. The default is `true`.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var inCellDropDown: Boolean
  
  /**
    * Source of the list for data validation
    When setting the value, it can be passed in as a `Range` object, or a string that contains a comma-separated number, boolean, or date.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var source: String | Range
}
object ListDataValidation {
  
  inline def apply(inCellDropDown: Boolean, source: String | Range): ListDataValidation = {
    val __obj = js.Dynamic.literal(inCellDropDown = inCellDropDown.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataValidation]
  }
  
  extension [Self <: ListDataValidation](x: Self) {
    
    inline def setInCellDropDown(value: Boolean): Self = StObject.set(x, "inCellDropDown", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String | Range): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
