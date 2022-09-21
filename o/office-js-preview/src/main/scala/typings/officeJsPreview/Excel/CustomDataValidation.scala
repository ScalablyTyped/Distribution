package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the custom data validation criteria.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
trait CustomDataValidation extends StObject {
  
  /**
    * A custom data validation formula. This creates special input rules, such as preventing duplicates, or limiting the total in a range of cells.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var formula: String
}
object CustomDataValidation {
  
  inline def apply(formula: String): CustomDataValidation = {
    val __obj = js.Dynamic.literal(formula = formula.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDataValidation]
  }
  
  extension [Self <: CustomDataValidation](x: Self) {
    
    inline def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
  }
}
