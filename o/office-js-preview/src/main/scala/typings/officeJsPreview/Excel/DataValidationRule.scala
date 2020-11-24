package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Data validation rule contains different types of data validation. You can only use one of them at a time according the Excel.DataValidationType.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait DataValidationRule extends js.Object {
  
  /**
    *
    * Custom data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var custom: js.UndefOr[CustomDataValidation] = js.native
  
  /**
    *
    * Date data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var date: js.UndefOr[DateTimeDataValidation] = js.native
  
  /**
    *
    * Decimal data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var decimal: js.UndefOr[BasicDataValidation] = js.native
  
  /**
    *
    * List data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var list: js.UndefOr[ListDataValidation] = js.native
  
  /**
    *
    * TextLength data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textLength: js.UndefOr[BasicDataValidation] = js.native
  
  /**
    *
    * Time data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var time: js.UndefOr[DateTimeDataValidation] = js.native
  
  /**
    *
    * WholeNumber data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var wholeNumber: js.UndefOr[BasicDataValidation] = js.native
}
object DataValidationRule {
  
  @scala.inline
  def apply(): DataValidationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValidationRule]
  }
  
  @scala.inline
  implicit class DataValidationRuleOps[Self <: DataValidationRule] (val x: Self) extends AnyVal {
    
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
    def setCustom(value: CustomDataValidation): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setDate(value: DateTimeDataValidation): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDecimal(value: BasicDataValidation): Self = this.set("decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    
    @scala.inline
    def setList(value: ListDataValidation): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setTextLength(value: BasicDataValidation): Self = this.set("textLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextLength: Self = this.set("textLength", js.undefined)
    
    @scala.inline
    def setTime(value: DateTimeDataValidation): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setWholeNumber(value: BasicDataValidation): Self = this.set("wholeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWholeNumber: Self = this.set("wholeNumber", js.undefined)
  }
}
