package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.CalculationMode
import typings.officeJsPreview.Excel.CalculationState
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.AutomaticExceptTables
import typings.officeJsPreview.officeJsPreviewStrings.Calculating
import typings.officeJsPreview.officeJsPreviewStrings.Done
import typings.officeJsPreview.officeJsPreviewStrings.Manual
import typings.officeJsPreview.officeJsPreviewStrings.Pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `application.toJSON()`. */
@js.native
trait ApplicationData extends js.Object {
  /**
    *
    * Returns the Excel calculation engine version used for the last full recalculation.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[Double] = js.native
  /**
    *
    * Returns the calculation mode used in the workbook, as defined by the constants in Excel.CalculationMode. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
    *
    * [Api set: ExcelApi 1.1 for get, 1.8 for set]
    */
  var calculationMode: js.UndefOr[CalculationMode | Automatic | AutomaticExceptTables | Manual] = js.native
  /**
    *
    * Returns the calculation state of the application. See Excel.CalculationState for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationState: js.UndefOr[CalculationState | Done | Calculating | Pending] = js.native
  /**
    *
    * Provides information based on current system culture settings. This includes the culture names, number formatting, and other culturally dependent settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var cultureInfo: js.UndefOr[CultureInfoData] = js.native
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on Excel's local settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var decimalSeparator: js.UndefOr[String] = js.native
  /**
    *
    * Returns the Iterative Calculation settings.
    In Excel on Windows and Mac, the settings will apply to the Excel Application.
    In Excel on the web and other platforms, the settings will apply to the active workbook.
    *
    * [Api set: ExcelApi 1.9]
    */
  var iterativeCalculation: js.UndefOr[IterativeCalculationData] = js.native
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on Excel's local settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var thousandsSeparator: js.UndefOr[String] = js.native
  /**
    *
    * Specifies if the system separators of Excel are enabled.
    System separators include the decimal separator and thousands separator.
    *
    * [Api set: ExcelApi 1.11]
    */
  var useSystemSeparators: js.UndefOr[Boolean] = js.native
}

object ApplicationData {
  @scala.inline
  def apply(): ApplicationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationData]
  }
  @scala.inline
  implicit class ApplicationDataOps[Self <: ApplicationData] (val x: Self) extends AnyVal {
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
    def setCalculationEngineVersion(value: Double): Self = this.set("calculationEngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculationEngineVersion: Self = this.set("calculationEngineVersion", js.undefined)
    @scala.inline
    def setCalculationMode(value: CalculationMode | Automatic | AutomaticExceptTables | Manual): Self = this.set("calculationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculationMode: Self = this.set("calculationMode", js.undefined)
    @scala.inline
    def setCalculationState(value: CalculationState | Done | Calculating | Pending): Self = this.set("calculationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculationState: Self = this.set("calculationState", js.undefined)
    @scala.inline
    def setCultureInfo(value: CultureInfoData): Self = this.set("cultureInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCultureInfo: Self = this.set("cultureInfo", js.undefined)
    @scala.inline
    def setDecimalSeparator(value: String): Self = this.set("decimalSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalSeparator: Self = this.set("decimalSeparator", js.undefined)
    @scala.inline
    def setIterativeCalculation(value: IterativeCalculationData): Self = this.set("iterativeCalculation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterativeCalculation: Self = this.set("iterativeCalculation", js.undefined)
    @scala.inline
    def setThousandsSeparator(value: String): Self = this.set("thousandsSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThousandsSeparator: Self = this.set("thousandsSeparator", js.undefined)
    @scala.inline
    def setUseSystemSeparators(value: Boolean): Self = this.set("useSystemSeparators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSystemSeparators: Self = this.set("useSystemSeparators", js.undefined)
  }
  
}

