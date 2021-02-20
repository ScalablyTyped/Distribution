package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Custom data validation criteria.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait CustomDataValidation extends StObject {
  
  /**
    *
    * A custom data validation formula. This creates special input rules, such as preventing duplicates, or limiting the total in a range of cells.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: String = js.native
}
object CustomDataValidation {
  
  @scala.inline
  def apply(formula: String): CustomDataValidation = {
    val __obj = js.Dynamic.literal(formula = formula.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDataValidation]
  }
  
  @scala.inline
  implicit class CustomDataValidationMutableBuilder[Self <: CustomDataValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
  }
}
