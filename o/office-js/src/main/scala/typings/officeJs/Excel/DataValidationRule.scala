package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Data validation rule contains different types of data validation. You can only use one of them at a time according the Excel.DataValidationType.
  *
  * [Api set: ExcelApi 1.8]
  */
trait DataValidationRule extends StObject {
  
  /**
    *
    * Custom data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var custom: js.UndefOr[CustomDataValidation] = js.undefined
  
  /**
    *
    * Date data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var date: js.UndefOr[DateTimeDataValidation] = js.undefined
  
  /**
    *
    * Decimal data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var decimal: js.UndefOr[BasicDataValidation] = js.undefined
  
  /**
    *
    * List data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var list: js.UndefOr[ListDataValidation] = js.undefined
  
  /**
    *
    * TextLength data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textLength: js.UndefOr[BasicDataValidation] = js.undefined
  
  /**
    *
    * Time data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var time: js.UndefOr[DateTimeDataValidation] = js.undefined
  
  /**
    *
    * WholeNumber data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var wholeNumber: js.UndefOr[BasicDataValidation] = js.undefined
}
object DataValidationRule {
  
  @scala.inline
  def apply(): DataValidationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValidationRule]
  }
  
  @scala.inline
  implicit class DataValidationRuleMutableBuilder[Self <: DataValidationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom(value: CustomDataValidation): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDate(value: DateTimeDataValidation): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDecimal(value: BasicDataValidation): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
    
    @scala.inline
    def setList(value: ListDataValidation): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    @scala.inline
    def setTextLength(value: BasicDataValidation): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLengthUndefined: Self = StObject.set(x, "textLength", js.undefined)
    
    @scala.inline
    def setTime(value: DateTimeDataValidation): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setWholeNumber(value: BasicDataValidation): Self = StObject.set(x, "wholeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWholeNumberUndefined: Self = StObject.set(x, "wholeNumber", js.undefined)
  }
}
